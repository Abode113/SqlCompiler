// Generated from D:/Downloads/compiler/proj/38/group38-compiler\hql.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link hqlParser}.
 */
public interface hqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link hqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(hqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(hqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(hqlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(hqlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(hqlParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(hqlParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(hqlParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(hqlParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(hqlParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(hqlParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(hqlParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(hqlParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(hqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(hqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon_stmt(hqlParser.Semicolon_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon_stmt(hqlParser.Semicolon_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void enterException_block(hqlParser.Exception_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#exception_block}.
	 * @param ctx the parse tree
	 */
	void exitException_block(hqlParser.Exception_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void enterException_block_item(hqlParser.Exception_block_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#exception_block_item}.
	 * @param ctx the parse tree
	 */
	void exitException_block_item(hqlParser.Exception_block_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(hqlParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(hqlParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(hqlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(hqlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(hqlParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(hqlParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(hqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(hqlParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(hqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(hqlParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(hqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(hqlParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(hqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(hqlParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAllocate_cursor_stmt(hqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#allocate_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAllocate_cursor_stmt(hqlParser.Allocate_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssociate_locator_stmt(hqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#associate_locator_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssociate_locator_stmt(hqlParser.Associate_locator_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_transaction_stmt(hqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#begin_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_transaction_stmt(hqlParser.Begin_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(hqlParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(hqlParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(hqlParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(hqlParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(hqlParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(hqlParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(hqlParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(hqlParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(hqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(hqlParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(hqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(hqlParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(hqlParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(hqlParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_condition_item(hqlParser.Declare_condition_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_condition_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_condition_item(hqlParser.Declare_condition_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor_item(hqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_cursor_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor_item(hqlParser.Declare_cursor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_with_return(hqlParser.Cursor_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cursor_with_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_with_return(hqlParser.Cursor_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void enterCursor_without_return(hqlParser.Cursor_without_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cursor_without_return}.
	 * @param ctx the parse tree
	 */
	void exitCursor_without_return(hqlParser.Cursor_without_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_handler_item(hqlParser.Declare_handler_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_handler_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_handler_item(hqlParser.Declare_handler_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_temporary_table_item(hqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#declare_temporary_table_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_temporary_table_item(hqlParser.Declare_temporary_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(hqlParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(hqlParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(hqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(hqlParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(hqlParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(hqlParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(hqlParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(hqlParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(hqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(hqlParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(hqlParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(hqlParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(hqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(hqlParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(hqlParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(hqlParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(hqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(hqlParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(hqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(hqlParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(hqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(hqlParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(hqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(hqlParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(hqlParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(hqlParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(hqlParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(hqlParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(hqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(hqlParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(hqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(hqlParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(hqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(hqlParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(hqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(hqlParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(hqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(hqlParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(hqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(hqlParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(hqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(hqlParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(hqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(hqlParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(hqlParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(hqlParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_item(hqlParser.Alter_table_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#alter_table_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_item(hqlParser.Alter_table_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(hqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(hqlParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint_item(hqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#alter_table_add_constraint_item}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint_item(hqlParser.Alter_table_add_constraint_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(hqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(hqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(hqlParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(hqlParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(hqlParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(hqlParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(hqlParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(hqlParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(hqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(hqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(hqlParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(hqlParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(hqlParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(hqlParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(hqlParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(hqlParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(hqlParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(hqlParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(hqlParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(hqlParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(hqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(hqlParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(hqlParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(hqlParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(hqlParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(hqlParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(hqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(hqlParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(hqlParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(hqlParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(hqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(hqlParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_options(hqlParser.Create_routine_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_routine_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_options(hqlParser.Create_routine_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_option(hqlParser.Create_routine_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_routine_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_option(hqlParser.Create_routine_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#class_block}.
	 * @param ctx the parse tree
	 */
	void enterClass_block(hqlParser.Class_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#class_block}.
	 * @param ctx the parse tree
	 */
	void exitClass_block(hqlParser.Class_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function(hqlParser.Create_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function(hqlParser.Create_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#new_type}.
	 * @param ctx the parse tree
	 */
	void enterNew_type(hqlParser.New_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#new_type}.
	 * @param ctx the parse tree
	 */
	void exitNew_type(hqlParser.New_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#new_for}.
	 * @param ctx the parse tree
	 */
	void enterNew_for(hqlParser.New_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#new_for}.
	 * @param ctx the parse tree
	 */
	void exitNew_for(hqlParser.New_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#def_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_if(hqlParser.Def_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#def_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_if(hqlParser.Def_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#def_else_if}.
	 * @param ctx the parse tree
	 */
	void enterDef_else_if(hqlParser.Def_else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#def_else_if}.
	 * @param ctx the parse tree
	 */
	void exitDef_else_if(hqlParser.Def_else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#def_else}.
	 * @param ctx the parse tree
	 */
	void enterDef_else(hqlParser.Def_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#def_else}.
	 * @param ctx the parse tree
	 */
	void exitDef_else(hqlParser.Def_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#def_operation}.
	 * @param ctx the parse tree
	 */
	void enterDef_operation(hqlParser.Def_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#def_operation}.
	 * @param ctx the parse tree
	 */
	void exitDef_operation(hqlParser.Def_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#new_equal_to_var}.
	 * @param ctx the parse tree
	 */
	void enterNew_equal_to_var(hqlParser.New_equal_to_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#new_equal_to_var}.
	 * @param ctx the parse tree
	 */
	void exitNew_equal_to_var(hqlParser.New_equal_to_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#arch}.
	 * @param ctx the parse tree
	 */
	void enterArch(hqlParser.ArchContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#arch}.
	 * @param ctx the parse tree
	 */
	void exitArch(hqlParser.ArchContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#new_select}.
	 * @param ctx the parse tree
	 */
	void enterNew_select(hqlParser.New_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#new_select}.
	 * @param ctx the parse tree
	 */
	void exitNew_select(hqlParser.New_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#func_p}.
	 * @param ctx the parse tree
	 */
	void enterFunc_p(hqlParser.Func_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#func_p}.
	 * @param ctx the parse tree
	 */
	void exitFunc_p(hqlParser.Func_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_new_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_new_table(hqlParser.Create_new_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_new_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_new_table(hqlParser.Create_new_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#p}.
	 * @param ctx the parse tree
	 */
	void enterP(hqlParser.PContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#p}.
	 * @param ctx the parse tree
	 */
	void exitP(hqlParser.PContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(hqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(hqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(hqlParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(hqlParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(hqlParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(hqlParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void enterEnd_transaction_stmt(hqlParser.End_transaction_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#end_transaction_stmt}.
	 * @param ctx the parse tree
	 */
	void exitEnd_transaction_stmt(hqlParser.End_transaction_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(hqlParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(hqlParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(hqlParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(hqlParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(hqlParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(hqlParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(hqlParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(hqlParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(hqlParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(hqlParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(hqlParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(hqlParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(hqlParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(hqlParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInclude_stmt(hqlParser.Include_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#include_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInclude_stmt(hqlParser.Include_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(hqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(hqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_cols(hqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#insert_stmt_cols}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_cols(hqlParser.Insert_stmt_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_rows(hqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#insert_stmt_rows}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_rows(hqlParser.Insert_stmt_rowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_row(hqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#insert_stmt_row}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_row(hqlParser.Insert_stmt_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_directory_stmt(hqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#insert_directory_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_directory_stmt(hqlParser.Insert_directory_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(hqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(hqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt(hqlParser.Get_diag_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#get_diag_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt(hqlParser.Get_diag_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_item(hqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#get_diag_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_item(hqlParser.Get_diag_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_exception_item(hqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#get_diag_stmt_exception_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_exception_item(hqlParser.Get_diag_stmt_exception_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void enterGet_diag_stmt_rowcount_item(hqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#get_diag_stmt_rowcount_item}.
	 * @param ctx the parse tree
	 */
	void exitGet_diag_stmt_rowcount_item(hqlParser.Get_diag_stmt_rowcount_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(hqlParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(hqlParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt_item(hqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#grant_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt_item(hqlParser.Grant_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void enterLeave_stmt(hqlParser.Leave_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#leave_stmt}.
	 * @param ctx the parse tree
	 */
	void exitLeave_stmt(hqlParser.Leave_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMap_object_stmt(hqlParser.Map_object_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#map_object_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMap_object_stmt(hqlParser.Map_object_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void enterOpen_stmt(hqlParser.Open_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#open_stmt}.
	 * @param ctx the parse tree
	 */
	void exitOpen_stmt(hqlParser.Open_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFetch_stmt(hqlParser.Fetch_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#fetch_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFetch_stmt(hqlParser.Fetch_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_stmt(hqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#collect_stats_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_stmt(hqlParser.Collect_stats_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void enterCollect_stats_clause(hqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#collect_stats_clause}.
	 * @param ctx the parse tree
	 */
	void exitCollect_stats_clause(hqlParser.Collect_stats_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void enterClose_stmt(hqlParser.Close_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#close_stmt}.
	 * @param ctx the parse tree
	 */
	void exitClose_stmt(hqlParser.Close_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCmp_stmt(hqlParser.Cmp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cmp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCmp_stmt(hqlParser.Cmp_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void enterCmp_source(hqlParser.Cmp_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cmp_source}.
	 * @param ctx the parse tree
	 */
	void exitCmp_source(hqlParser.Cmp_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_local_stmt(hqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_from_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_local_stmt(hqlParser.Copy_from_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCopy_stmt(hqlParser.Copy_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCopy_stmt(hqlParser.Copy_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void enterCopy_source(hqlParser.Copy_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_source}.
	 * @param ctx the parse tree
	 */
	void exitCopy_source(hqlParser.Copy_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void enterCopy_target(hqlParser.Copy_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_target}.
	 * @param ctx the parse tree
	 */
	void exitCopy_target(hqlParser.Copy_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(hqlParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(hqlParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_file_option(hqlParser.Copy_file_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#copy_file_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_file_option(hqlParser.Copy_file_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(hqlParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(hqlParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(hqlParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(hqlParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(hqlParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(hqlParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_storage_clause(hqlParser.Index_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#index_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_storage_clause(hqlParser.Index_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void enterIndex_mssql_storage_clause(hqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#index_mssql_storage_clause}.
	 * @param ctx the parse tree
	 */
	void exitIndex_mssql_storage_clause(hqlParser.Index_mssql_storage_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPrint_stmt(hqlParser.Print_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#print_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPrint_stmt(hqlParser.Print_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterQuit_stmt(hqlParser.Quit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#quit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitQuit_stmt(hqlParser.Quit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(hqlParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(hqlParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterResignal_stmt(hqlParser.Resignal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#resignal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitResignal_stmt(hqlParser.Resignal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(hqlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(hqlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(hqlParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(hqlParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_session_option(hqlParser.Set_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#set_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_session_option(hqlParser.Set_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_current_schema_option(hqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#set_current_schema_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_current_schema_option(hqlParser.Set_current_schema_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_mssql_session_option(hqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#set_mssql_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_mssql_session_option(hqlParser.Set_mssql_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void enterSet_teradata_session_option(hqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#set_teradata_session_option}.
	 * @param ctx the parse tree
	 */
	void exitSet_teradata_session_option(hqlParser.Set_teradata_session_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSignal_stmt(hqlParser.Signal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#signal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSignal_stmt(hqlParser.Signal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSummary_stmt(hqlParser.Summary_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#summary_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSummary_stmt(hqlParser.Summary_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(hqlParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(hqlParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(hqlParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(hqlParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_into_stmt(hqlParser.Values_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#values_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_into_stmt(hqlParser.Values_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(hqlParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(hqlParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_cursor_stmt(hqlParser.For_cursor_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#for_cursor_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_cursor_stmt(hqlParser.For_cursor_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(hqlParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(hqlParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(hqlParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(hqlParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(hqlParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(hqlParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(hqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(hqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(hqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(hqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(hqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(hqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(hqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(hqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(hqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(hqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(hqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(hqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(hqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(hqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(hqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(hqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(hqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(hqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(hqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(hqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(hqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(hqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(hqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(hqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(hqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(hqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(hqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(hqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(hqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(hqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(hqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(hqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(hqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(hqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(hqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(hqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(hqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(hqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(hqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(hqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(hqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(hqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(hqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(hqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(hqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(hqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(hqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(hqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(hqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(hqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(hqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(hqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(hqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(hqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(hqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(hqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(hqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(hqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(hqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(hqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(hqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(hqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(hqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(hqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(hqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(hqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_assignment(hqlParser.Update_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#update_assignment}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_assignment(hqlParser.Update_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_table(hqlParser.Update_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_table(hqlParser.Update_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_upsert(hqlParser.Update_upsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#update_upsert}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_upsert(hqlParser.Update_upsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMerge_stmt(hqlParser.Merge_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#merge_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMerge_stmt(hqlParser.Merge_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void enterMerge_table(hqlParser.Merge_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#merge_table}.
	 * @param ctx the parse tree
	 */
	void exitMerge_table(hqlParser.Merge_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void enterMerge_condition(hqlParser.Merge_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#merge_condition}.
	 * @param ctx the parse tree
	 */
	void exitMerge_condition(hqlParser.Merge_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void enterMerge_action(hqlParser.Merge_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#merge_action}.
	 * @param ctx the parse tree
	 */
	void exitMerge_action(hqlParser.Merge_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(hqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(hqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void enterDelete_alias(hqlParser.Delete_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#delete_alias}.
	 * @param ctx the parse tree
	 */
	void exitDelete_alias(hqlParser.Delete_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(hqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(hqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(hqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(hqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(hqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(hqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(hqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(hqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(hqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(hqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(hqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(hqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(hqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(hqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(hqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(hqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(hqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(hqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(hqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(hqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(hqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(hqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(hqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(hqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(hqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(hqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(hqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(hqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(hqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(hqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(hqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(hqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(hqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(hqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(hqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(hqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(hqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(hqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(hqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(hqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(hqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(hqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(hqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(hqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(hqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(hqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(hqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(hqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(hqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(hqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(hqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(hqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(hqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(hqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(hqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(hqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void enterExpr_select(hqlParser.Expr_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_select}.
	 * @param ctx the parse tree
	 */
	void exitExpr_select(hqlParser.Expr_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void enterExpr_file(hqlParser.Expr_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#expr_file}.
	 * @param ctx the parse tree
	 */
	void exitExpr_file(hqlParser.Expr_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void enterHive(hqlParser.HiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#hive}.
	 * @param ctx the parse tree
	 */
	void exitHive(hqlParser.HiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void enterHive_item(hqlParser.Hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#hive_item}.
	 * @param ctx the parse tree
	 */
	void exitHive_item(hqlParser.Hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(hqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(hqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHost_cmd(hqlParser.Host_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#host_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHost_cmd(hqlParser.Host_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHost_stmt(hqlParser.Host_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#host_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHost_stmt(hqlParser.Host_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void enterFile_name(hqlParser.File_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#file_name}.
	 * @param ctx the parse tree
	 */
	void exitFile_name(hqlParser.File_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(hqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(hqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(hqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(hqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(hqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(hqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(hqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(hqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(hqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link hqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(hqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(hqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(hqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(hqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(hqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(hqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(hqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(hqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(hqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link hqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(hqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link hqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(hqlParser.Non_reserved_wordsContext ctx);
}