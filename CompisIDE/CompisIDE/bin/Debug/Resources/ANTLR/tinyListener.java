// Generated from .\Resources\ANTLR\tiny.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinyParser}.
 */
public interface tinyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlist(tinyParser.DeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlist(tinyParser.DeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(tinyParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(tinyParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVardeclaration(tinyParser.VardeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#vardeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVardeclaration(tinyParser.VardeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(tinyParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(tinyParser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void enterStatementlist(tinyParser.StatementlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#statementlist}.
	 * @param ctx the parse tree
	 */
	void exitStatementlist(tinyParser.StatementlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tinyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tinyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(tinyParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(tinyParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#selectionstmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstmt(tinyParser.SelectionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#selectionstmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstmt(tinyParser.SelectionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#iterationstmt}.
	 * @param ctx the parse tree
	 */
	void enterIterationstmt(tinyParser.IterationstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#iterationstmt}.
	 * @param ctx the parse tree
	 */
	void exitIterationstmt(tinyParser.IterationstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#repetitionstmt}.
	 * @param ctx the parse tree
	 */
	void enterRepetitionstmt(tinyParser.RepetitionstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#repetitionstmt}.
	 * @param ctx the parse tree
	 */
	void exitRepetitionstmt(tinyParser.RepetitionstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#evaluacion}.
	 * @param ctx the parse tree
	 */
	void enterEvaluacion(tinyParser.EvaluacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#evaluacion}.
	 * @param ctx the parse tree
	 */
	void exitEvaluacion(tinyParser.EvaluacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(tinyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(tinyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#expreval}.
	 * @param ctx the parse tree
	 */
	void enterExpreval(tinyParser.ExprevalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#expreval}.
	 * @param ctx the parse tree
	 */
	void exitExpreval(tinyParser.ExprevalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#sentread}.
	 * @param ctx the parse tree
	 */
	void enterSentread(tinyParser.SentreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#sentread}.
	 * @param ctx the parse tree
	 */
	void exitSentread(tinyParser.SentreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#sentwrite}.
	 * @param ctx the parse tree
	 */
	void enterSentwrite(tinyParser.SentwriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#sentwrite}.
	 * @param ctx the parse tree
	 */
	void exitSentwrite(tinyParser.SentwriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#bexpresion}.
	 * @param ctx the parse tree
	 */
	void enterBexpresion(tinyParser.BexpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#bexpresion}.
	 * @param ctx the parse tree
	 */
	void exitBexpresion(tinyParser.BexpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#bterm}.
	 * @param ctx the parse tree
	 */
	void enterBterm(tinyParser.BtermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#bterm}.
	 * @param ctx the parse tree
	 */
	void exitBterm(tinyParser.BtermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#notfactor}.
	 * @param ctx the parse tree
	 */
	void enterNotfactor(tinyParser.NotfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#notfactor}.
	 * @param ctx the parse tree
	 */
	void exitNotfactor(tinyParser.NotfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#bfactor}.
	 * @param ctx the parse tree
	 */
	void enterBfactor(tinyParser.BfactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#bfactor}.
	 * @param ctx the parse tree
	 */
	void exitBfactor(tinyParser.BfactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tinyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tinyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(tinyParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(tinyParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleexpression(tinyParser.SimpleexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#simpleexpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleexpression(tinyParser.SimpleexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(tinyParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(tinyParser.RelopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(tinyParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(tinyParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#addop}.
	 * @param ctx the parse tree
	 */
	void enterAddop(tinyParser.AddopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#addop}.
	 * @param ctx the parse tree
	 */
	void exitAddop(tinyParser.AddopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(tinyParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(tinyParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#mulop}.
	 * @param ctx the parse tree
	 */
	void enterMulop(tinyParser.MulopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#mulop}.
	 * @param ctx the parse tree
	 */
	void exitMulop(tinyParser.MulopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tinyParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tinyParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(tinyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(tinyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(tinyParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(tinyParser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinyParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(tinyParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinyParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(tinyParser.ArglistContext ctx);
}