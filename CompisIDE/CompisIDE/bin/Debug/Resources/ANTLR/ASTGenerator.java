import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
        File myObj = new File("salida.txt");
        myObj.createNewFile();
        BufferedWriter out = null;
        FileWriter fstream = new FileWriter("salida.txt", true); //true tells to append data.
        out = new BufferedWriter(fstream);

        printAST(ctx, false, 0, out);
        out.close();
    }

    private static void printAST(RuleContext ctx, boolean verbose, int indentation, BufferedWriter arch) {
 
        boolean toBeIgnored = !verbose && ctx.getChildCount() == 1 && ctx.getChild(0) instanceof ParserRuleContext;

        if (!toBeIgnored) {
            String ruleName = tinyParser.ruleNames[ctx.getRuleIndex()];
            
            if(ruleName == "declaration" || ruleName == "assign" || ruleName == "var" || ruleName == "repetitionstmt" || ruleName == "evaluacion" || ruleName == "relop" || ruleName == "addop" || ruleName == "term" || ruleName == "mulop" || ruleName == "selectionstmt" || ruleName == "iterationstmt" || ruleName == "sentread" || ruleName == "sentwrite") {
            	for (int i = 0; i < indentation; i++) {
                    try {
                        arch.write(" | ");
                    }
                    catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    
                }
                if(ruleName == "repetitionstmt" || ruleName == "selectionstmt" || ruleName == "iterationstmt") {
                    try {
                        arch.write(ruleName + "\n");
                    }
                    catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                
                } else {
                    try {
                        arch.write(ruleName + " -> " + ctx.getText() + "\n");
                    }
                    catch (IOException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                }
            }
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                printAST((RuleContext) element, verbose, indentation + (toBeIgnored ? 0 : 1), arch);
            }
        }
    }
}
 

  