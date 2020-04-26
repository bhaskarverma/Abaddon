// Generated from AbaddonParser.g4 by ANTLR 4.5.1
package me.apollyon.abaddon;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AbaddonParser}.
 */
public interface AbaddonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AbaddonParser#abaddonFile}.
	 * @param ctx the parse tree
	 */
	void enterAbaddonFile(AbaddonParser.AbaddonFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbaddonParser#abaddonFile}.
	 * @param ctx the parse tree
	 */
	void exitAbaddonFile(AbaddonParser.AbaddonFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbaddonParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(AbaddonParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbaddonParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(AbaddonParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationStatement(AbaddonParser.VarDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varDeclarationStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationStatement(AbaddonParser.VarDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(AbaddonParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(AbaddonParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AbaddonParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link AbaddonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AbaddonParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbaddonParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AbaddonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbaddonParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AbaddonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbaddonParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(AbaddonParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbaddonParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(AbaddonParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AbaddonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AbaddonParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AbaddonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AbaddonParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(AbaddonParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(AbaddonParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(AbaddonParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(AbaddonParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(AbaddonParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLiteral}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(AbaddonParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(AbaddonParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(AbaddonParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperation(AbaddonParser.BinaryOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOperation}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperation(AbaddonParser.BinaryOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(AbaddonParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(AbaddonParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarReference(AbaddonParser.VarReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varReference}
	 * labeled alternative in {@link AbaddonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarReference(AbaddonParser.VarReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link AbaddonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInteger(AbaddonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link AbaddonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInteger(AbaddonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link AbaddonParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(AbaddonParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link AbaddonParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(AbaddonParser.DecimalContext ctx);
}