// Generated from D:/Downloads/compiler/proj/38/group38-compiler\hql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link hqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface hqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link hqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(hqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(hqlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(hqlParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(hqlParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(hqlParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(hqlParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(hqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(hqlParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#exception_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block(hqlParser.Exception_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_block_item(hqlParser.Exception_block_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(hqlParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(hqlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(hqlParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(hqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(hqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(hqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(hqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocate_cursor_stmt(hqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssociate_locator_stmt(hqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_transaction_stmt(hqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(hqlParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(hqlParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(hqlParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(hqlParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(hqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(hqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(hqlParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_condition_item(hqlParser.Declare_condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor_item(hqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_with_return(hqlParser.Cursor_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_without_return(hqlParser.Cursor_without_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_handler_item(hqlParser.Declare_handler_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_temporary_table_item(hqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(hqlParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(hqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(hqlParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(hqlParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(hqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(hqlParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(hqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(hqlParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(hqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(hqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(hqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(hqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(hqlParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(hqlParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(hqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(hqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(hqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(hqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(hqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(hqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(hqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(hqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(hqlParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_item(hqlParser.Alter_table_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(hqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint_item(hqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(hqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(hqlParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(hqlParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(hqlParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(hqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(hqlParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(hqlParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(hqlParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(hqlParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(hqlParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(hqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(hqlParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(hqlParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(hqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(hqlParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(hqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_options(hqlParser.Create_routine_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_option(hqlParser.Create_routine_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#class_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_block(hqlParser.Class_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function(hqlParser.Create_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#new_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_type(hqlParser.New_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#new_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_for(hqlParser.New_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#def_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_if(hqlParser.Def_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#def_else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else_if(hqlParser.Def_else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#def_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_else(hqlParser.Def_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#def_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_operation(hqlParser.Def_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#new_equal_to_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_equal_to_var(hqlParser.New_equal_to_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#arch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArch(hqlParser.ArchContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#new_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_select(hqlParser.New_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#func_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_p(hqlParser.Func_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_new_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_new_table(hqlParser.Create_new_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP(hqlParser.PContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(hqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(hqlParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_stmt(hqlParser.Drop_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_transaction_stmt(hqlParser.End_transaction_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(hqlParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(hqlParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(hqlParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(hqlParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(hqlParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(hqlParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(hqlParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#include_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude_stmt(hqlParser.Include_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(hqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_cols(hqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_rows(hqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_row(hqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_directory_stmt(hqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(hqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt(hqlParser.Get_diag_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_item(hqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_exception_item(hqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_diag_stmt_rowcount_item(hqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt(hqlParser.Grant_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_stmt_item(hqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_stmt(hqlParser.Leave_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap_object_stmt(hqlParser.Map_object_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#open_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_stmt(hqlParser.Open_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_stmt(hqlParser.Fetch_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_stmt(hqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect_stats_clause(hqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#close_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_stmt(hqlParser.Close_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_stmt(hqlParser.Cmp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cmp_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp_source(hqlParser.Cmp_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_local_stmt(hqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_stmt(hqlParser.Copy_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_source(hqlParser.Copy_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_target(hqlParser.Copy_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(hqlParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_file_option(hqlParser.Copy_file_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(hqlParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(hqlParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(hqlParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_storage_clause(hqlParser.Index_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_mssql_storage_clause(hqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#print_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_stmt(hqlParser.Print_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuit_stmt(hqlParser.Quit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(hqlParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignal_stmt(hqlParser.Resignal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(hqlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(hqlParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#set_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_session_option(hqlParser.Set_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_current_schema_option(hqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_mssql_session_option(hqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_teradata_session_option(hqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal_stmt(hqlParser.Signal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummary_stmt(hqlParser.Summary_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(hqlParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(hqlParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_into_stmt(hqlParser.Values_into_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(hqlParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_cursor_stmt(hqlParser.For_cursor_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(hqlParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(hqlParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#using_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_clause(hqlParser.Using_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(hqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(hqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(hqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(hqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(hqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(hqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(hqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(hqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(hqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(hqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(hqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(hqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(hqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(hqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(hqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(hqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(hqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(hqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(hqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(hqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(hqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(hqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(hqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(hqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(hqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(hqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(hqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(hqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(hqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(hqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(hqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(hqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(hqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#update_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_assignment(hqlParser.Update_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_table(hqlParser.Update_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#update_upsert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_upsert(hqlParser.Update_upsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_stmt(hqlParser.Merge_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#merge_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_table(hqlParser.Merge_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#merge_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_condition(hqlParser.Merge_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#merge_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_action(hqlParser.Merge_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(hqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#delete_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_alias(hqlParser.Delete_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(hqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(hqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(hqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(hqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(hqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(hqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(hqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(hqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(hqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(hqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(hqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(hqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(hqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(hqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(hqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(hqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(hqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(hqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(hqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(hqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(hqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(hqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(hqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(hqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(hqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(hqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(hqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(hqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_select(hqlParser.Expr_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#expr_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_file(hqlParser.Expr_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#hive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive(hqlParser.HiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHive_item(hqlParser.Hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(hqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#host_cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_cmd(hqlParser.Host_cmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#host_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost_stmt(hqlParser.Host_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_name(hqlParser.File_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(hqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(hqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(hqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(hqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(hqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(hqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(hqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(hqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(hqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link hqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(hqlParser.Non_reserved_wordsContext ctx);
}