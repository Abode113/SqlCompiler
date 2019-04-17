import javafx.util.Pair;

import java.sql.Types;
import java.time.Clock;
import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class MyVisitor extends hqlBaseVisitor<Object> {
    ArrayList<D_Type> types = new ArrayList<>();
    D_Type Type = new D_Type();
    queryData _queryData = new queryData();


    void print(D_Type type2) {
        System.out.println("print");
        printfunction(type2);
        System.out.println("");

        if (!type2.Isfunction) {

            System.out.println("scope name -> " + type2.Name);


            for (int j = 0; j < type2.information.size(); j++) {
                System.out.println("variable type -> " + type2.information.get(j).Type);
                System.out.println("variable  name -> " + type2.information.get(j).Name);



            }
        }
        System.out.println("");
        print_table(type2);


    }

    void print_table(D_Type type) {
        System.out.println("print_table");
        if (type.istable) {

for(int i=0;i<type.tabl.size();i++) {
    System.out.println("table name -> " + type.tabl.get(i).tablename);
    for (int j = 0; j < type.tabl.get(i).col.size(); j++) {

        System.out.println("column type -> " + type.tabl.get(i).col.get(j).column_type);
        System.out.println("column name -> " + type.tabl.get(i).col.get(j).column_name);


    }
}

        }
    }


    void get(String type1, List<D_Type> types2) {
        System.out.println("get");
        for (int i = 0; i < types2.size(); i++) {
            if (types2.get(i).Name.equalsIgnoreCase(type1)) {
                System.out.println("scope name ->" + types2.get(i).Name);
                System.out.println("details:");
                for (int j = 0; j < types2.get(i).information.size(); j++) {
                    System.out.println("variable  name -> " + types2.get(i).information.get(j).Name);
                    System.out.println("variable type -> " + types2.get(i).information.get(j).Type);
                    get(types2.get(i).information.get(j).Type, types2);
                }
            }
        }
    }

    void print_symboltable(){
        System.out.println("print_symboltable");
             for(int i=0;i<types.size();i++){
                print(types.get(i));
            }


    }


    void task2() throws FileNotFoundException {
        System.out.println("FileNotFoundException");
        FileInputStream fis = new FileInputStream("data_type.ser");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ArrayList<D_Type> types3 = (ArrayList<D_Type>) ois.readObject();
            get("B", types3);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


    void printfunction(D_Type types) {
        System.out.println("printfunction");
        if (types.Isfunction) {
            System.out.println("function type -> " + types.Type);
            System.out.println("function name -> " + types.Name);


            for (int j = 0; j < types.information.size(); j++) {
                if (types.information.get(j).Kind.equalsIgnoreCase("parameter")) {
                    System.out.println("function parameter list");
                }
                System.out.println("variable type -> " + types.information.get(j).Type);
                System.out.println("variable name -> " + types.information.get(j).Name);


            }
        }
    }


    @Override
    public Object visitProgram(hqlParser.ProgramContext ctx) {
        System.out.println("Program");
        this._queryData.QueryTables = new ArrayList<>();
        this._queryData.selectList = new ArrayList<>();
        this._queryData.OnStatement = new ArrayList<>();

        return visitChildren(ctx);
    }

    boolean tableexist(String tablename) {
        System.out.println("tableexist");
        for (int i = 0; i < types.size(); i++) {
            for (int j = 0; j < types.get(i).tabl.size(); j++) {
                if (types.get(i).tabl.get(j).tablename.equalsIgnoreCase(tablename)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean columnexist(String column) {
        System.out.println("columnexist");
        for (int i = 0; i < types.size(); i++) {
            if (types.get(i).istable) {
                for (int j = 0; j < types.get(i).tabl.size(); j++) {
                    for (int x = 0; x < types.get(i).tabl.get(j).col.size(); x++) {
                        if ( types.get(i).tabl.get(j).col.get(x).column_name.equalsIgnoreCase(column)) {
                            return true;
                        }
                    }
                }

            }


        }
        return false;
    }
    @Override public Object visitDef_if(hqlParser.Def_ifContext ctx) {
        System.out.println("Def_if");
        for(int i=0;i<ctx.p().size();i++) {
            Inner_D_Type temp=new Inner_D_Type();
            temp.Type = ctx.p(i).dtype().getText();
            temp.Name = ctx.p(i).ident().getText();
            temp.parent=new D_Type(ctx.T_IF().getText());
            Type.information.add(temp);
        }

        return visitChildren(ctx); }



    @Override public Object visitNew_for(hqlParser.New_forContext ctx) {
        System.out.println("New_for");
   for(int i=0;i<ctx.p().size();i++) {
       Inner_D_Type temp=new Inner_D_Type();
       temp.Type = ctx.p(i).dtype().getText();
       temp.Name = ctx.p(i).ident().getText();
      temp.parent=new D_Type(ctx.T_FOR().getText());
       Type.information.add(temp);
   }

        return visitChildren(ctx); }


    @Override public Object visitCreate_new_table(hqlParser.Create_new_tableContext ctx) {
        System.out.println("Create_new_table");
        table tab =new table();
        tab.tablename=ctx.table_name().ident().getText();


        for (int i =0 ; i< ctx.column().size();i++){
            column c=new column();
            c.column_type=ctx.column(i).dtype().getText();

          c.column_name=ctx.column(i).ident().getText();
          tab.col.add(c);


        }
        Type.istable=true;
        Type.tabl.add(tab);

        try {
            tableList _tableList = new tableList();
            //_tableList.createOrOverwirteTableListToFile(tab);
            _tableList.readTableListFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return visitChildren(ctx); }


  /*  @Override public Object visitClass_block(hqlParser.Class_blockContext ctx) {

        D_Type Type = new D_Type();
        Type.Name = ctx.x().ident().getText();
        for (int i =0 ; i< ctx.p().size();i++){
            Inner_D_Type temp =new Inner_D_Type();
            temp.Name=ctx.p(i).ident().getText();

            temp.Type=ctx.p(i).dtype().getText();

            temp.parent= new D_Type(ctx.x().ident().getText());

            Type.Details.add(temp);

        }
        ArrayList<D_Type> types=new ArrayList<>();
        types.add(Type);
        for(int i=0;i<types.size();i++) {
            print(types.get(i));
            System.out.println("");
        }


        return visitChildren(ctx); }*/

    @Override
    public Object visitNew_select(hqlParser.New_selectContext ctx) {
        System.out.println("New_select");
        Inner_D_Type temp=new Inner_D_Type();
        temp.Type=ctx.p().dtype().getText();
        temp.Name=ctx.p().ident().getText();
        Type.information.add(temp);

      //  for(int j=0;j<ctx.table_name().size();j++) {
          /* String table = ctx.table_name().getText();
            if (tableexist(table)) {
                System.out.println("table exist");
            }
            for (int i = 0; i < ctx.column().size(); i++) {
                String column = ctx.column(i).ident().getText();
                if (columnexist(column)) {
                    System.out.println("column exit");
                }


        }*/



        return visitChildren(ctx);
    }


    void save_in_file(ArrayList<D_Type> types) {
    System.out.println("save_in_file");
    FileOutputStream fileOut = null;
    try {
        fileOut = new FileOutputStream("SymbolTable.ser");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.writeObject(types);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }



}


    @Override public Object visitCreate_function(hqlParser.Create_functionContext ctx) {
        System.out.println("Create_function");

        Type.Type=ctx.dtype().getText();

        Type.Name =ctx.x().ident().getText();
        Type.Isfunction=true;



        for (int i =0 ; i<ctx.func_p().size();i++){


            Inner_D_Type temp =new Inner_D_Type();

            temp.Type=ctx.func_p(i).dtype().getText();

            temp.Name=ctx.func_p(i).ident().getText();
            temp.Kind="parameter";




            temp.parent= new D_Type(ctx.x().ident().getText());

            Type.information.add(temp);

        }
        for (int i =0 ; i< ctx.p().size();i++){


            Inner_D_Type temp =new Inner_D_Type();

            temp.Type=ctx.p(i).dtype().getText();

            temp.Name=ctx.p(i).ident().getText();

            temp.parent= new D_Type(ctx.x().ident().getText());

            Type.information.add(temp);

        }

        types.add(Type);



        return visitChildren(ctx); }



    @Override public Object visitNew_type(hqlParser.New_typeContext ctx) {
        System.out.println("New_type");


        Type.Name = ctx.x().ident().getText();



        for (int i =0 ; i< ctx.p().size();i++){
            Inner_D_Type temp =new Inner_D_Type();

            temp.Type=ctx.p(i).dtype().getText();


            temp.Name=ctx.p(i).ident().getText();


            temp.parent= new D_Type(ctx.x().ident().getText());


            Type.information.add(temp);

        }

        types.add(Type);






        return this.visitChildren(ctx);

    }

    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    // TO CATCH JOINED TABLE
    @Override
    public Object visitTable_name(hqlParser.Table_nameContext ctx) {

        //System.out.println(ctx.start.getText());

        String[] value = {ctx.start.getText(), ""};
        this._queryData.QueryTables.add(value);

        return this.visitChildren(ctx);
    }

    @Override
    public Object visitSelect_list_alias(hqlParser.Select_list_aliasContext ctx) {
        //System.out.println(ctx.start.getText());

        String[] value = {ctx.start.getText(), ""};
        this._queryData.QueryTables.add(value);

        return this.visitChildren(ctx);
    }

    @Override
    public Object visitNon_reserved_words(hqlParser.Non_reserved_wordsContext ctx) {

        if(this._queryData.QueryTables.size() >= 1) {
            String key = this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[0];
            String value = this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1];
            //System.out.println(ctx.start.getText());
            switch (ctx.start.getText()) {
                case "inner":
                    if ((!value.equals("innerjoin") || !value.equals("leftjoin") || !value.equals("rightjoin") || !value.equals("outerjoin")) && value.equals("")) {
                        this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1] += ctx.start.getText();
                    }
                    break;
                case "join":
                    if ((!value.equals("innerjoin") || !value.equals("leftjoin") || !value.equals("rightjoin") || !value.equals("outerjoin"))
                            && (value.equals("inner") || value.equals("left") || value.equals("right") || value.equals("outer"))) {
                        this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1] += ctx.start.getText();
                    }
                    break;
                case "order":
                    this._queryData.OrderByList = new ArrayList<>();
                    // dont do any thing
//                    String[] strings = new String[2];
//                    strings[0] = ctx.start.getText();
//                    strings[1] = "";
//                    this._queryData.OrderByList.add(strings);
                    break;
                case "by":
                    // dont do any thing
                    //this._queryData.OrderByList.get(this._queryData.OrderByList.size() - 1)[0] = this._queryData.OrderByList.get(this._queryData.OrderByList.size() - 1)[0] + ctx.start.getText();
                    break;
            }
        }
        //System.out.println(ctx.start.getText());
        return this.visitChildren(ctx);
    }

    @Override
    public Object visitFrom_join_type_clause(hqlParser.From_join_type_clauseContext ctx) {
        if(this._queryData.QueryTables.size() >= 1) {
            String key = this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[0];
            String value = this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1];
            //System.out.println(ctx.start.getText());
            switch (ctx.start.getText()) {
                case "inner":
                    if ((!value.equals("innerjoin") || !value.equals("leftjoin") || !value.equals("rightjoin") || !value.equals("outerjoin")) && value.equals("")) {
                        this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1] += ctx.start.getText() + ctx.stop.getText();
                    }
                    break;
                case "join":
                    if ((!value.equals("innerjoin") || !value.equals("leftjoin") || !value.equals("rightjoin") || !value.equals("outerjoin"))
                            && (value.equals("inner") || value.equals("left") || value.equals("right") || value.equals("outer"))) {
                        this._queryData.QueryTables.get(this._queryData.QueryTables.size() - 1)[1] += ctx.start.getText();
                    }
                    break;
                case "order":
                    this._queryData.OrderByList = new ArrayList<>();
                    // dont do any thing
//                    String[] strings = new String[2];
//                    strings[0] = ctx.start.getText();
//                    strings[1] = "";
//                    this._queryData.OrderByList.add(strings);
                    break;
                case "by":
                    // dont do any thing
                    //this._queryData.OrderByList.get(this._queryData.OrderByList.size() - 1)[0] = this._queryData.OrderByList.get(this._queryData.OrderByList.size() - 1)[0] + ctx.start.getText();
                    break;
            }
        }
        //System.out.println(ctx.start.getText());
        return this.visitChildren(ctx);
    }

    @Override
    public Object visitFrom_alias_clause(hqlParser.From_alias_clauseContext ctx) {
        String[] value = {ctx.start.getText(), ""};
        this._queryData.QueryTables.add(value);
        //System.out.println(ctx.start.getText());
        return this.visitChildren(ctx);
    }

    // may get here other than table name like on or order
    @Override
    public Object visitExpr_func(hqlParser.Expr_funcContext ctx) {
        if(!ctx.start.getText().equals("on") && !ctx.start.getText().equals("order")) {
        String[] value = {ctx.start.getText(), ""};
        this._queryData.QueryTables.add(value);
        }
        //System.out.println(ctx.start.getText());
        return this.visitChildren(ctx);
    }


    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    // TO CATCH ORDER LIST

    @Override
    public Object visitExpr_atom(hqlParser.Expr_atomContext ctx) {
        //System.out.println(ctx.start.getText());
        if(this._queryData.OrderByList != null){
            this._queryData.OrderByList.add(ctx.start.getText() + "." + ctx.stop.getText());
        }

        return this.visitChildren(ctx);
    }


    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------



    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //  TO CATCH SELECTED COLUMN
    @Override
    public Object visitSelect_list_item(hqlParser.Select_list_itemContext ctx) {
        if(!ctx.start.getText().equals("sum")){
            String[] selectedList = new String[2];
            selectedList[0] = "none";
            String _stop = ctx.stop.getText();
            if(ctx.stop.getText().equals("join")){
                _stop = ctx.children.get(0).getChild(0).getChild(0).getChild(2).getText();
            }
            selectedList[1] = ctx.start.getText() + "." + _stop;
            this._queryData.selectList.add(selectedList);
        }
        return this.visitChildren(ctx);
    }

    @Override
    public Object visitExpr_agg_window_func(hqlParser.Expr_agg_window_funcContext ctx) {
        String[] selectedList = new String[2];
        selectedList[0] = ctx.children.get(0).getText();
        selectedList[1] = ctx.children.get(2).getText();
        this._queryData.selectList.add(selectedList);
        return this.visitChildren(ctx);
    }

    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------





    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    // TO CATCH THE LINK BETWEEN TEABLE

    @Override
    public Object visitFunc_param(hqlParser.Func_paramContext ctx) {
        if(this._queryData.OrderByList == null) {
            String[] strings = new String[3];
            int i = 0;
            for (int j = 0; j < ctx.children.size(); j++) {
                strings[i] = ctx.children.get(j).getText();
                i++;
            }
            this._queryData.OnStatement.add(strings);
        }
        return this.visitChildren(ctx);
    }

    @Override
    public Object visitBool_expr_binary(hqlParser.Bool_expr_binaryContext ctx) {
        System.out.println(ctx.children.get(0).getChild(0).getChild(0).getChild(0).getText());
        String[] strings = new String[3];
        strings[0] = ctx.children.get(0).getChild(0).getChild(0).getChild(0).getText() + "." + ctx.children.get(0).getChild(0).getChild(0).getChild(2).getText();
        strings[1] = ctx.children.get(1).getText();
        strings[2] = ctx.children.get(2).getChild(0).getChild(0).getChild(0).getText() + "." + ctx.children.get(0).getChild(0).getChild(0).getChild(2).getText();
        this._queryData.OnStatement.add(strings);
        return this.visitChildren(ctx);
    }

    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------------------------
}




















