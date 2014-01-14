// Generated from S:\cloud\mindfulthinktank\GitHub\k\v1\src\com\mindfulthinktank\k\language\v1\Klang.g4 by ANTLR 4.1
package com.mindfulthinktank.k.language.v1;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KlangParser#StringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(@NotNull KlangParser.StringLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#BinaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpression(@NotNull KlangParser.BinaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull KlangParser.ParExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#PrimaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(@NotNull KlangParser.PrimaryExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#NullLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(@NotNull KlangParser.NullLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#primitiveCollectionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveCollectionType(@NotNull KlangParser.PrimitiveCollectionTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(@NotNull KlangParser.CompilationUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull KlangParser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(@NotNull KlangParser.StatementExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull KlangParser.QualifiedNameContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#FloatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(@NotNull KlangParser.FloatLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#PrintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull KlangParser.PrintStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#CharacterLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterLiteral(@NotNull KlangParser.CharacterLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull KlangParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#primitiveCollection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveCollection(@NotNull KlangParser.PrimitiveCollectionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#primitiveTypePlural}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveTypePlural(@NotNull KlangParser.PrimitiveTypePluralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(@NotNull KlangParser.ConstantExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull KlangParser.PrimitiveTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#IntegerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull KlangParser.IntegerLiteralContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(@NotNull KlangParser.PrimaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#IgnoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreStatement(@NotNull KlangParser.IgnoreStatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#Ignore}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnore(@NotNull KlangParser.IgnoreContext ctx);

	/**
	 * Visit a parse tree produced by {@link KlangParser#BooleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(@NotNull KlangParser.BooleanLiteralContext ctx);
}