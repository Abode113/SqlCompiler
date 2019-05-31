import java.util.ArrayList;
import java.util.List;

public class map {

    queryData DataObject;

    map(queryData DataObject){
        this.DataObject = DataObject;
    }

    public List<List<String>> process(){

        List<List<List<String>>> AllTablesData = getTablesData();

        List<List<String>> JoinedTable = On(AllTablesData);

        List<List<String>> TablesAfterWhereCondition = where(JoinedTable);

        List<List<String>> justSelect = justSelect(TablesAfterWhereCondition);

        List<List<String>> TablesAfterDistinct = Distinct(justSelect);

        return TablesAfterDistinct;

    }

    public List<List<String>> justSelect(List<List<String>> justSelect){

        if(justSelect != null) {
            List<String> SelectList = new ArrayList<>();
            for (int i = 0; i < this.DataObject.selectList.size(); i++) {
                if (this.DataObject.selectList.get(i)[1].contains("param")) {
                    SelectList.add(this.DataObject.selectList.get(i)[1].split(" ")[1]);
                } else {
                    SelectList.add(this.DataObject.selectList.get(i)[1]);
                }
            }

            boolean complete = true;
            for (int i = 0; i < SelectList.size(); i++) {
                if (!SelectList.get(i).contains(".")) {
                    complete = false;
                    break;
                }
            }

            if (!complete) {
                for (int i = 0; i < SelectList.size(); i++) {
                    if (SelectList.get(i).contains(".")) {
                        SelectList.set(i, SelectList.get(i).split("\\.")[1]);
                    }
                }
            }

            List<Integer> indexList = new ArrayList<>();
            for (int i = 0; i < SelectList.size(); i++) {
                for (int j = 0; j < justSelect.get(1).size(); j++) {
                    if (justSelect.get(1).get(j).equalsIgnoreCase(SelectList.get(i))) {
                        indexList.add(j);
                        break;
                    }
                }
            }

            List<List<String>> Data = new ArrayList<>();
            for (int i = 0; i < justSelect.size(); i++) {
                List<String> Obj = new ArrayList<>();
                for (int j = 0; j < indexList.size(); j++) {
                    Obj.add(justSelect.get(i).get(indexList.get(j)));
                }
                Data.add(Obj);
            }
            return Data;
        }
        return null;
    }

    public List<List<String>> Distinct(List<List<String>> TablesAfterWhereCondition){

        if(TablesAfterWhereCondition != null) {
            boolean Distinct = false;
            for (int i = 0; i < this.DataObject.selectList.size(); i++) {
                if (this.DataObject.selectList.get(i)[0].equalsIgnoreCase("distinct")) {
                    Distinct = true;
                    break;
                }
            }
            if (Distinct) {

                List<Integer> similarIndex = new ArrayList<>();

                for (int i = 2; i < TablesAfterWhereCondition.size(); i++) {
                    if (!similarIndex.contains(i)) {
                        for (int j = i + 1; j < TablesAfterWhereCondition.size(); j++) {
                            if (!similarIndex.contains(j)) {
                                int index = j;
                                for (int k = 0; k < TablesAfterWhereCondition.get(i).size(); k++) {
                                    if (!TablesAfterWhereCondition.get(i).get(k).equalsIgnoreCase(TablesAfterWhereCondition.get(j).get(k))) {
                                        index = -1;
                                    }
                                }
                                if (index != -1) {
                                    similarIndex.add(index);
                                }
                            }
                        }
                    }
                }
                List<List<String>> Data = new ArrayList<>();
                for (int i = 0; i < TablesAfterWhereCondition.size(); i++) {
                    if (!similarIndex.contains(i)) {
                        Data.add(TablesAfterWhereCondition.get(i));
                    }
                }

                return Data;
            } else {
                return TablesAfterWhereCondition;
            }
        }
        return null;
    }

    public List<List<String>> where(List<List<String>> JoinedTable){
        conditionTree _conditionTree = new conditionTree();
        TreeNode Tree = _conditionTree.build(this.DataObject.WhereClauseStatement);

        List<List<String>> TablesAfterWhereCondition = ApplyWhereOnTables(JoinedTable, Tree);
        return TablesAfterWhereCondition;
    }

    public List<List<String>> ApplyWhereOnTables(List<List<String>> JoinedTable, TreeNode ConditionTree){

        if(ConditionTree != null) {
            List<List<String>> Result = new ArrayList<>();
            Result.add(JoinedTable.get(0));
            Result.add(JoinedTable.get(1));
            for (int i = 2; i < JoinedTable.size(); i++) {
                List<String> Res = WhereCondition(JoinedTable.get(0), JoinedTable.get(1), JoinedTable.get(i), ConditionTree);
                if (Res != null) {
                    Result.add(Res);
                }
            }
            return Result;
        }
        return null;
    }

    public List<String> WhereCondition(List<String> rowType, List<String> rowColName, List<String> RowValue, TreeNode ConditionTree){

        if(WalkOnTree(rowType, rowColName, RowValue, ConditionTree)){
            return RowValue;
        }
        return null;
    }

    public boolean WalkOnTree(List<String> rowType, List<String> rowColName, List<String> RowValue, TreeNode ConditionTree){

        boolean Res = false, Res1 = false, Res2 = false;
        if(ConditionTree.right != null){ // there are right
            if(ConditionTree.right.right != null){
                Res1 = WalkOnTree(rowType, rowColName, RowValue, ConditionTree.right);
                Res2 = OkOrNot(rowType, rowColName, RowValue, ConditionTree.left.left.Data, ConditionTree.left.Data, ConditionTree.left.right.Data);
                if(ConditionTree.Data.equalsIgnoreCase("or")){
                    Res = Res1 || Res2;
                } else if(ConditionTree.Data.equalsIgnoreCase("and")){
                    Res = Res1 && Res2;
                }
            }else {
                Res = OkOrNot(rowType, rowColName, RowValue, ConditionTree.left.Data, ConditionTree.Data, ConditionTree.right.Data);
            }

        }else{  // last right element

        }
        return Res;
        //
    }

    public boolean OkOrNot(List<String> rowType, List<String> rowColName, List<String> RowValue, String left, String Operation, String right){

        List<String> complete_rowType = new ArrayList<>();
        List<String> un_complete_rowType = new ArrayList<>();

        for(int i = 0; i < rowColName.size(); i++){
            complete_rowType.add(rowColName.get(i));
            un_complete_rowType.add(rowColName.get(i).split("\\.")[1]);
        }

        boolean left_complete = false;
        if(left.contains(".")){
            left_complete = true;
        }

        boolean right_complete = false;
        if(right.contains(".")){
            right_complete = true;
        }

        int index_left = 0, index_right = 0;
        String type_left = "", type_right = "";

        if(left_complete){
            for(int i = 0; i < complete_rowType.size(); i++){
                if(left.equalsIgnoreCase(complete_rowType.get(i))){
                    index_left = i;
                    type_left = rowType.get(i);
                    break;
                }
            }
        }else{
            for(int i = 0; i < un_complete_rowType.size(); i++){
                if(left.equalsIgnoreCase(un_complete_rowType.get(i))){
                    index_left = i;
                    type_left = rowType.get(i);
                    break;
                }
            }
        }

        boolean enter = false;
        if(right_complete){
            for(int i = 0; i < complete_rowType.size(); i++){
                if(right.equalsIgnoreCase(complete_rowType.get(i))){
                    index_right = i;
                    type_right = rowType.get(i);
                    enter = true;
                    break;
                }
            }
        }else{
            for(int i = 0; i < un_complete_rowType.size(); i++){
                if(right.equalsIgnoreCase(un_complete_rowType.get(i))){
                    index_right = i;
                    type_right = rowType.get(i);
                    enter = true;
                    break;
                }
            }
        }
        int int_value = 0;
        String string_value = "";
        boolean tables = true;
        if(!enter){
            tables = false;
            try {
                type_right = "int";
                int_value = Integer.parseInt(right);
            } catch (NumberFormatException e) {
                type_right = "string";
                string_value = right;
            }
        }

        if(RowValue.get(index_left).equalsIgnoreCase("null") || RowValue.get(index_right).equalsIgnoreCase("null")){
            return false;
        }

        if(type_left.equalsIgnoreCase(type_right)) {
            if(tables) {
                if (type_left.equalsIgnoreCase("int") || type_left.equalsIgnoreCase("number")) {
                    switch (Operation) {
                        case "=":
                            if (Integer.parseInt(RowValue.get(index_left)) == Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "==":
                            if (Integer.parseInt(RowValue.get(index_left)) == Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case ">":
                            if (Integer.parseInt(RowValue.get(index_left)) > Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case ">=":
                            if (Integer.parseInt(RowValue.get(index_left)) >= Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<":
                            if (Integer.parseInt(RowValue.get(index_left)) < Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<=":
                            if (Integer.parseInt(RowValue.get(index_left)) <= Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "!=":
                            if (Integer.parseInt(RowValue.get(index_left)) != Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<>":
                            if (Integer.parseInt(RowValue.get(index_left)) != Integer.parseInt(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }
                        default:
                            return false;
                    }
                } else if (type_left.equalsIgnoreCase("string") || type_left.equalsIgnoreCase("varchar")) {
                    switch (Operation) {
                        case "=":
                            if (RowValue.get(index_left).equals(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "==":
                            if (RowValue.get(index_left).equals(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "!=":
                            if (!RowValue.get(index_left).equals(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<>":
                            if (!RowValue.get(index_left).equals(RowValue.get(index_right))) {
                                return true;
                            } else {
                                return false;
                            }
                        default:
                            return false;
                    }
                }
            }else {
                if (type_right.equalsIgnoreCase("int")) {
                    switch (Operation) {
                        case "=":
                            if (Integer.parseInt(RowValue.get(index_left)) == int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case "==":
                            if (Integer.parseInt(RowValue.get(index_left)) == int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case ">":
                            if (Integer.parseInt(RowValue.get(index_left)) > int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case ">=":
                            if (Integer.parseInt(RowValue.get(index_left)) >= int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<":
                            if (Integer.parseInt(RowValue.get(index_left)) < int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<=":
                            if (Integer.parseInt(RowValue.get(index_left)) <= int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case "!=":
                            if (Integer.parseInt(RowValue.get(index_left)) != int_value) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<>":
                            if (Integer.parseInt(RowValue.get(index_left)) != int_value) {
                                return true;
                            } else {
                                return false;
                            }
                        default:
                            return false;
                    }
                } else if (type_right.equalsIgnoreCase("string")) {
                    switch (Operation) {
                        case "=":
                            if (RowValue.get(index_left).equals(string_value)) {
                                return true;
                            } else {
                                return false;
                            }

                        case "==":
                            if (RowValue.get(index_left).equals(string_value)) {
                                return true;
                            } else {
                                return false;
                            }

                        case "!=":
                            if (!RowValue.get(index_left).equals(string_value)) {
                                return true;
                            } else {
                                return false;
                            }

                        case "<>":
                            if (!RowValue.get(index_left).equals(string_value)) {
                                return true;
                            } else {
                                return false;
                            }
                        default:
                            return false;
                    }
                }
            }
        }


        return false;
    }

    public List<List<List<String>>> getTablesData(){
        List<List<List<String>>> AllTablesData = new ArrayList<>();
        for (int i = 0; i < this.DataObject.QueryTables.size(); i++){
            tableList tabObj = new tableList();
            List<List<String>> DataOfFile = tabObj.readDataFromCsvFile(this.DataObject.QueryTables.get(i)[0]);
            AllTablesData.add(DataOfFile);
        }
        return AllTablesData;
    }

    public List<List<String>> On(List<List<List<String>>> AllTablesData){

        List<String> Col_FirstTab_Type = AllTablesData.get(0).get(0);
        List<String> Col_FirstTab = AllTablesData.get(0).get(1);
        List<List<String>> JoinedTable = AllTablesData.get(0);

        for(int i = 1; i < this.DataObject.QueryTables.size(); i++){

            String[] OnIndex = OnIndex(
                     Col_FirstTab_Type                         //Col_FirstTab_Type
                    , Col_FirstTab                              //Col_FirstTab
                    , AllTablesData.get(i).get(0)               //Col_secTab_Type
                    , AllTablesData.get(i).get(1)               //Col_secTab
                    , this.DataObject.OnStatement.get(i - 1)    //OnStatment
            );

            JoinedTable =
                    joinTable(
                            JoinedTable                    //FirstTab
                            , AllTablesData.get(i)                      //SecTab
                            , this.DataObject.QueryTables.get(i - 1)[1] //JoinType
                            , OnIndex                                   //OnIndex
                    );

            Col_FirstTab_Type = JoinedTable.get(0);
            Col_FirstTab = JoinedTable.get(1);
            System.out.println("hey");
        }

        return JoinedTable;
    }

    public String[] OnIndex(List<String> Col_FirstTab_Type, List<String> Col_FirstTab, List<String> Col_secTab_Type, List<String> Col_secTab, String[] OnStatment){

        String[] Result = new String[5];

        if(OnStatment.length >= 3){

            Result[2] = OnStatment[1];

            // ------------------------------------------
            // complete or not
            boolean complete = true;
            for(int i = 0; i < Col_FirstTab.size(); i++){
                if(!Col_FirstTab.get(i).contains(".")){
                    complete = false;
                }
            }
            for(int i = 0; i < Col_secTab.size(); i++){
                if(!Col_secTab.get(i).contains(".")){
                    complete = false;
                }
            }
            if(!OnStatment[0].contains(".") || !OnStatment[2].contains(".")){
                complete = false;
            }
            // ------------------------------------------

            String OnStat_1_ColName;
            String OnStat_2_ColName;

            if(!complete) {

                OnStat_1_ColName = OnStatment[0];
                if(OnStatment[0].contains(".")) {
                    OnStat_1_ColName = new String();
                    OnStat_1_ColName = OnStatment[0].split("\\.")[1];
                }
                OnStat_2_ColName = OnStatment[2];
                if(OnStatment[2].contains(".")) {
                    OnStat_2_ColName = new String();
                    OnStat_2_ColName = OnStatment[2].split("\\.")[1];
                }

                for(int i = 0; i < Col_FirstTab.size(); i++){
                    if(Col_FirstTab.get(i).contains(".")) {
                        Col_FirstTab.set(i, Col_FirstTab.get(i).split("\\.")[1]);
                    }
                }
                for(int i = 0; i < Col_secTab.size(); i++){
                    if(Col_secTab.get(i).contains(".")) {
                        Col_secTab.set(i, Col_secTab.get(i).split("\\.")[1]);
                    }
                }

            }else {
                OnStat_1_ColName = OnStatment[0];
                OnStat_2_ColName = OnStatment[2];
            }

            int OnStat_1_ColName_index = 0;
            int OnStat_2_ColName_index = 0;

            String OnStat_1_ColName_type = "";
            String OnStat_2_ColName_type = "";

            //------------------
            boolean enter = false;
            for (int i = 0; i < Col_FirstTab.size(); i++) {
                if (OnStat_1_ColName.equalsIgnoreCase(Col_FirstTab.get(i))) {
                    OnStat_1_ColName_index = i;
                    OnStat_1_ColName_type = Col_FirstTab_Type.get(i);
                    enter = true;
                    break;
                }
            }
            if(!enter){
                for (int i = 0; i < Col_secTab.size(); i++) {
                    if (OnStat_1_ColName.equalsIgnoreCase(Col_secTab.get(i))) {
                        OnStat_1_ColName_index = i;
                        OnStat_1_ColName_type = Col_secTab_Type.get(i);
                        break;
                    }
                }
            }
            enter = false;
            for (int i = 0; i < Col_secTab.size(); i++) {
                if (OnStat_2_ColName.equalsIgnoreCase(Col_secTab.get(i))) {
                    OnStat_2_ColName_index = i;
                    OnStat_2_ColName_type = Col_secTab_Type.get(i);
                    enter = true;
                    break;
                }
            }
            if(!enter){
                for (int i = 0; i < Col_FirstTab.size(); i++) {
                    if (OnStat_2_ColName.equalsIgnoreCase(Col_FirstTab.get(i))) {
                        OnStat_2_ColName_index = i;
                        OnStat_2_ColName_type = Col_FirstTab_Type.get(i);
                        enter = true;
                        break;
                    }
                }
            }
            Result[0] = new Integer(OnStat_1_ColName_index).toString();
            Result[1] = OnStat_1_ColName_type;
            Result[3] = new Integer(OnStat_2_ColName_index).toString();
            Result[4] = OnStat_2_ColName_type;

        }
        return Result;
    }

    public List<List<String>> joinTable(List<List<String>> FirstTab, List<List<String>> SecTab, String JoinType, String[] OnIndex){

        List<List<String>> Result = new ArrayList<>();

        List<String> setup = new ArrayList<>();
        for (int i = 0; i < FirstTab.get(0).size(); i++){
            setup.add(FirstTab.get(0).get(i));
        }
        setup.add(SecTab.get(0).get(0));
        setup.add(SecTab.get(0).get(1));
        Result.add(setup);

        setup = new ArrayList<>();
        for (int i = 0; i < FirstTab.get(1).size(); i++){
            setup.add(FirstTab.get(1).get(i));
        }
        setup.add(SecTab.get(1).get(0));
        setup.add(SecTab.get(1).get(1));
        Result.add(setup);

        for(int i = 2; i < FirstTab.size(); i++){
            for (int j = 2; j < SecTab.size(); j++){
                List<String> Res = compareTwoElement(FirstTab.get(i), SecTab.get(j), JoinType, OnIndex);
                if(Res != null){
                    Result.add(Res);
                }
            }
        }

        return Result;
    }

    public List<String> compareTwoElement(List<String> First_row, List<String> sec_row, String JoinType, String[] OnIndex){

        switch (JoinType){
            case "inner":
                if(First_row.get(Integer.parseInt(OnIndex[0])).equalsIgnoreCase("null") || sec_row.get(Integer.parseInt(OnIndex[3])).equalsIgnoreCase("null")){
                    return null;
                }
                if(operation(First_row.get(Integer.parseInt(OnIndex[0])), OnIndex[1], sec_row.get(Integer.parseInt(OnIndex[3])), OnIndex[4], OnIndex[2])){
                    List<String> Result = new ArrayList<>();
                    for(int i = 0; i < First_row.size(); i++){
                        Result.add(First_row.get(i));
                    }
                    for(int i = 0; i < sec_row.size(); i++){
                        Result.add(sec_row.get(i));
                    }
                    return Result;
                }
                break;
            case "outerjoin":
                if(First_row.get(Integer.parseInt(OnIndex[0])).equalsIgnoreCase("null") || sec_row.get(Integer.parseInt(OnIndex[3])).equalsIgnoreCase("null")){
                    List<String> Result = new ArrayList<>();
                    for(int i = 0; i < First_row.size(); i++){
                        Result.add(First_row.get(i));
                    }
                    for(int i = 0; i < sec_row.size(); i++){
                        Result.add(sec_row.get(i));
                    }
                    return Result;
                }else{
                    if(operation(First_row.get(Integer.parseInt(OnIndex[0])), OnIndex[1], sec_row.get(Integer.parseInt(OnIndex[3])), OnIndex[4], OnIndex[2])){
                        List<String> Result = new ArrayList<>();
                        for(int i = 0; i < First_row.size(); i++){
                            Result.add(First_row.get(i));
                        }
                        for(int i = 0; i < sec_row.size(); i++){
                            Result.add(sec_row.get(i));
                        }
                        return Result;
                    }
                }
                break;
            case "left":
                if(sec_row.get(Integer.parseInt(OnIndex[3])).equalsIgnoreCase("null")){
                    return null;
                }
                else if(First_row.get(Integer.parseInt(OnIndex[0])).equalsIgnoreCase("null")){
                    List<String> Result = new ArrayList<>();
                    for(int i = 0; i < First_row.size(); i++){
                        Result.add(First_row.get(i));
                    }
                    for(int i = 0; i < sec_row.size(); i++){
                        Result.add(sec_row.get(i));
                    }
                    return Result;
                }
                else {
                    if(operation(First_row.get(Integer.parseInt(OnIndex[0])), OnIndex[1], sec_row.get(Integer.parseInt(OnIndex[3])), OnIndex[4], OnIndex[2])){
                        List<String> Result = new ArrayList<>();
                        for(int i = 0; i < First_row.size(); i++){
                            Result.add(First_row.get(i));
                        }
                        for(int i = 0; i < sec_row.size(); i++){
                            Result.add(sec_row.get(i));
                        }
                        return Result;
                    }
                }

                break;
            case "right":
                if(First_row.get(Integer.parseInt(OnIndex[0])).equalsIgnoreCase("null")){
                    return null;
                }
                else if(sec_row.get(Integer.parseInt(OnIndex[3])).equalsIgnoreCase("null")){
                    List<String> Result = new ArrayList<>();
                    for(int i = 0; i < First_row.size(); i++){
                        Result.add(First_row.get(i));
                    }
                    for(int i = 0; i < sec_row.size(); i++){
                        Result.add(sec_row.get(i));
                    }
                    return Result;
                }
                else {
                    if(operation(First_row.get(Integer.parseInt(OnIndex[0])), OnIndex[1], sec_row.get(Integer.parseInt(OnIndex[3])), OnIndex[4], OnIndex[2])){
                        List<String> Result = new ArrayList<>();
                        for(int i = 0; i < First_row.size(); i++){
                            Result.add(First_row.get(i));
                        }
                        for(int i = 0; i < sec_row.size(); i++){
                            Result.add(sec_row.get(i));
                        }
                        return Result;
                    }
                }
                break;
        }

        return null;
    }

    public boolean operation(String FirstElem, String typeof_FirstElem, String SecElem, String typeof_SecElem, String operation){

        if(typeof_FirstElem.equalsIgnoreCase(typeof_SecElem)){
            //-----------------
            if(typeof_FirstElem.equalsIgnoreCase("int") || typeof_FirstElem.equalsIgnoreCase("number")){
                int _FirstElem = Integer.parseInt(FirstElem);
                int _SecElem = Integer.parseInt(SecElem);

                switch (operation){
                    case "=":
                        if(_FirstElem == _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case "==":
                        if(_FirstElem == _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case ">":
                        if(_FirstElem > _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case ">=":
                        if(_FirstElem >= _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case "<":
                        if(_FirstElem < _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case "<=":
                        if(_FirstElem <= _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case "!=":
                        if(_FirstElem != _SecElem){
                            return true;
                        }else{
                            return false;
                        }

                    case "<>":
                        if(_FirstElem != _SecElem){
                            return true;
                        }else{
                            return false;
                        }
                    default:
                        return false;
                }

            }else if (typeof_FirstElem.equalsIgnoreCase("String") || typeof_FirstElem.equalsIgnoreCase("varchar")){
                String _FirstElem = FirstElem;
                String _SecElem = SecElem;

                switch (operation){
                    case "=":
                        if(_FirstElem.equals(_SecElem)){
                            return true;
                        }else{
                            return false;
                        }

                    case "==":
                        if(_FirstElem.equals(_SecElem)){
                            return true;
                        }else{
                            return false;
                        }

                    case "!=":
                        if(!_FirstElem.equals(_SecElem)){
                            return true;
                        }else{
                            return false;
                        }

                    case "<>":
                        if(!_FirstElem.equals(_SecElem)){
                            return true;
                        }else{
                            return false;
                        }
                    default:
                        return false;
                }
            }
            return false;
            //-----------------
        }else{
            return false;
        }
    }

}
