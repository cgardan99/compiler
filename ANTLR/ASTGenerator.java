import java.io.File;
import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.file.Files;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTGenerator {

    public static String readFile(String filename) throws IOException {
    	File file = new File(filename);
        byte[] encoded = Files.readAllBytes(file.toPath());
        return new String(encoded, Charset.forName("UTF-8"));
    }

    public static void main(String args[]) throws IOException {
        String inputString = readFile(args[0]);
        ANTLRInputStream input = new ANTLRInputStream(inputString);
        tinyLexer lexer = new tinyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tinyParser parser = new tinyParser(tokens);
        ParserRuleContext ctx = parser.program();
        System.out.print("\n\n");
        printAST(ctx, false, 0);
    }

    private static void printAST(RuleContext ctx, boolean verbose, int indentation) {
 
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = tinyParser.ruleNames[ctx.getRuleIndex()];
            
            if(ruleName == "assign" || ruleName == "var" || ruleName == "repetitionstmt" || ruleName == "evaluacion" || ruleName == "relop" || ruleName == "addop" || ruleName == "term" || ruleName == "mulop" || ruleName == "selectionstmt" || ruleName == "iterationstmt" || ruleName == "sentread" || ruleName == "sentwrite") {
            	for (int i = 0; i < indentation; i++) {
                    System.out.print(" | ");
                }
            	System.out.println(ruleName + " -> " + ctx.getText());
            }
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                printAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1));
            }
        }
    }
}
 

  