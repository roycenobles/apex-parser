// Generated from /Users/royce/Idea/src/main/antlr/Apex.g4 by ANTLR 4.7
package com.ncino.apex.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ApexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ApexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ApexParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ApexParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(ApexParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(ApexParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(ApexParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(ApexParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(ApexParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(ApexParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(ApexParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(ApexParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(ApexParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ApexParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(ApexParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(ApexParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(ApexParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(ApexParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(ApexParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ApexParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(ApexParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(ApexParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(ApexParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ApexParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ApexParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(ApexParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(ApexParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(ApexParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ApexParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(ApexParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#propertyBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBodyDeclaration(ApexParser.PropertyBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(ApexParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(ApexParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ApexParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(ApexParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(ApexParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(ApexParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ApexParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ApexParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ApexParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ApexParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ApexParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enumConstantName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstantName(ApexParser.EnumConstantNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ApexParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(ApexParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ApexParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ApexParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ApexParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(ApexParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ApexParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ApexParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ApexParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ApexParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ApexParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(ApexParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ApexParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ApexParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(ApexParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationName(ApexParser.AnnotationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(ApexParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(ApexParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(ApexParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(ApexParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(ApexParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(ApexParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(ApexParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(ApexParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(ApexParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(ApexParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(ApexParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(ApexParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ApexParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ApexParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ApexParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ApexParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ApexParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#propertyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBlock(ApexParser.PropertyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(ApexParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(ApexParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(ApexParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(ApexParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(ApexParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(ApexParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(ApexParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(ApexParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ApexParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ApexParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ApexParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ApexParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ApexParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ApexParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ApexParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ApexParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#apexDbExpressionLong}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApexDbExpressionLong(ApexParser.ApexDbExpressionLongContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#apexDbExpressionShort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApexDbExpressionShort(ApexParser.ApexDbExpressionShortContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#apexDbExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApexDbExpression(ApexParser.ApexDbExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ApexParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ApexParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(ApexParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(ApexParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(ApexParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(ApexParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#mapCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCreatorRest(ApexParser.MapCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#setCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCreatorRest(ApexParser.SetCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(ApexParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(ApexParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(ApexParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(ApexParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(ApexParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(ApexParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(ApexParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link ApexParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ApexParser.ArgumentsContext ctx);
}