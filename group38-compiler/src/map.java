import java.util.ArrayList;
import java.util.List;

public class map {

    queryData DataObject;

    map(queryData DataObject){
        this.DataObject = DataObject;
    }

    public void process(){

        List<List<List<String>>> AllTablesData = getTablesData();

        List<List<String>> JoinedTable = On(AllTablesData);

        System.out.println("hey");

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

            String OnStat_1_ColName = OnStatment[0].split("\\.")[1];
            String OnStat_2_ColName = OnStatment[2].split("\\.")[1];

            int OnStat_1_ColName_index = 0;
            int OnStat_2_ColName_index = 0;

            String OnStat_1_ColName_type = "";
            String OnStat_2_ColName_type = "";

            //------------------
            for (int i = 0; i < Col_FirstTab.size(); i++){
                if(OnStat_1_ColName.equalsIgnoreCase(Col_FirstTab.get(i))){
                    OnStat_1_ColName_index = i;
                    OnStat_1_ColName_type = Col_FirstTab_Type.get(i);
                    break;
                }
            }
            for (int i = 0; i < Col_secTab.size(); i++){
                if(OnStat_2_ColName.equalsIgnoreCase(Col_secTab.get(i))){
                    OnStat_2_ColName_index = i;
                    OnStat_2_ColName_type = Col_secTab_Type.get(i);
                    break;
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
        setup.add(FirstTab.get(0).get(0));
        setup.add(FirstTab.get(0).get(1));
        setup.add(SecTab.get(0).get(0));
        setup.add(SecTab.get(0).get(1));
        Result.add(setup);

        setup = new ArrayList<>();
        setup.add(FirstTab.get(1).get(0));
        setup.add(FirstTab.get(1).get(1));
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

                break;
            case "leftjoin":

                break;
            case "rightjoin":

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
