// Generated from S:\cloud\mindfulthinktank\GitHub\k\v1\src\com\mindfulthinktank\k\language\v1\Klang.g4 by ANTLR 4.1
package com.mindfulthinktank.k.language.v1;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KlangParser}.
 */
public interface KlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KlangParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull KlangParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull KlangParser.ParExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#PrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(@NotNull KlangParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#PrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(@NotNull KlangParser.PrimaryExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#primitiveCollectionType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveCollectionType(@NotNull KlangParser.PrimitiveCollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#primitiveCollectionType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveCollectionType(@NotNull KlangParser.PrimitiveCollectionTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#IgnoreLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreLiteral(@NotNull KlangParser.IgnoreLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#IgnoreLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreLiteral(@NotNull KlangParser.IgnoreLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull KlangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull KlangParser.CompilationUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull KlangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull KlangParser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull KlangParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull KlangParser.StatementExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(@NotNull KlangParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(@NotNull KlangParser.QualifiedNameContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#PrintStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull KlangParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#PrintStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull KlangParser.PrintStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull KlangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull KlangParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#primitiveCollection}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveCollection(@NotNull KlangParser.PrimitiveCollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#primitiveCollection}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveCollection(@NotNull KlangParser.PrimitiveCollectionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#primitiveTypePlural}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveTypePlural(@NotNull KlangParser.PrimitiveTypePluralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#primitiveTypePlural}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveTypePlural(@NotNull KlangParser.PrimitiveTypePluralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull KlangParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull KlangParser.ConstantExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull KlangParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull KlangParser.PrimitiveTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull KlangParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull KlangParser.IntegerLiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull KlangParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull KlangParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#IgnoreStatement}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreStatement(@NotNull KlangParser.IgnoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#IgnoreStatement}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreStatement(@NotNull KlangParser.IgnoreStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link KlangParser#Ignore}.
	 * @param ctx the parse tree
	 */
	void enterIgnore(@NotNull KlangParser.IgnoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link KlangParser#Ignore}.
	 * @param ctx the parse tree
	 */
	void exitIgnore(@NotNull KlangParser.IgnoreContext ctx);
}