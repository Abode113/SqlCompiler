import java.util.ArrayList;
import java.util.List;

public class Reduce {
    List<List<String>> MapperData;
    queryData DataObject;
    List<List<List<String>>> ShuffleResult;
    public Reduce(List<List<List<String>>> ShuffleResult, List<List<String>> MapperData, queryData DataObject){
        this.MapperData = MapperData;
        this.DataObject = DataObject;
        this.ShuffleResult = ShuffleResult;
    }

    public List<List<String>> process(){

        List<List<String>> FunctionResult = functionsProcess();

        List<List<String>> sortList = sortList(FunctionResult);

        List<List<String>> sortListafterTwoParamFun = TwoParamFun(sortList);

        return sortList;
    }

    public List<List<String>> TwoParamFun(List<List<String>> sortList){

        List<String> Functions = new ArrayList<>();
        for(int i = 0; i < this.DataObject.selectList.size(); i++){
            if(this.DataObject.selectList.get(i)[0].contains("fun") && this.DataObject.selectList.get(i)[1].contains("param")){
                Functions.add(this.DataObject.selectList.get(i)[0].split(" ")[1]);
                Functions.add(this.DataObject.selectList.get(i)[1].split(" ")[1]);
                Functions.add(this.DataObject.selectList.get(i)[2].split(" ")[1]);
            }
        }

        if(Functions.size() > 0) {
            boolean complete = true;
            if (!Functions.get(1).contains(".")) {
                complete = false;
            }

            if (!complete) {
                if (Functions.get(1).contains(".")) {
                    Functions.set(1, Functions.get(1).split("\\.")[1]);
                }
            }

            int index = -1;
            for (int i = 0; i < sortList.get(1).size(); i++) {
                if (sortList.get(1).get(i).equalsIgnoreCase(Functions.get(1))) {
                    index = i;
                }
            }

            for (int i = 2; i < sortList.size(); i++) {
                if (sortList.get(i).get(index).equalsIgnoreCase("null")) {
                    sortList.get(i).set(index, Functions.get(2));
                }
            }
        }
        return sortList;
    }

    public List<List<String>> sortList(List<List<String>> FunctionResult){

        if(this.DataObject.OrderByList != null) {
            String sortType = "";
            List<String> orderByList = new ArrayList<>();
            for (int i = 0; i < this.DataObject.OrderByList.size(); i++) {
                if (!this.DataObject.OrderByList.get(i).equalsIgnoreCase("ASC") && !this.DataObject.OrderByList.get(i).equalsIgnoreCase("DESC")
                        && !this.DataObject.OrderByList.get(i).equalsIgnoreCase("ASC.ASC") && !this.DataObject.OrderByList.get(i).equalsIgnoreCase("DESC.DESC")) {
                    orderByList.add(this.DataObject.OrderByList.get(i));
                } else {
                    if (this.DataObject.OrderByList.get(i).equalsIgnoreCase("ASC") || this.DataObject.OrderByList.get(i).equalsIgnoreCase("ASC.ASC")) {
                        sortType = "ASC";
                    } else if (this.DataObject.OrderByList.get(i).equalsIgnoreCase("DESC") || this.DataObject.OrderByList.get(i).equalsIgnoreCase("DESC.DESC")) {
                        sortType = "DESC";
                    }
                }
            }

            boolean complete = true;
            for (int i = 0; i < orderByList.size(); i++) {
                if (!orderByList.get(i).contains(".")) {
                    complete = false;
                    break;
                }
            }


            if (!complete) {
                for (int i = 0; i < orderByList.size(); i++) {
                    if (orderByList.get(i).contains(".")) {
                        orderByList.set(i, orderByList.get(i).split("\\.")[1]);
                    }
                }
            }

            List<Integer> indexList = new ArrayList<>();
            for (int i = 0; i < orderByList.size(); i++) {
                for (int j = 0; j < FunctionResult.get(1).size(); j++) {
                    if (orderByList.get(i).equalsIgnoreCase(FunctionResult.get(1).get(j))) {
                        indexList.add(j);
                    }
                }
            }

            List<List<String>> sortList = new ArrayList<>();
            for (int i = 2; i < FunctionResult.size(); i++) {
                List<String> Obj = new ArrayList<>();
                Obj.add(String.valueOf(i));
                for (int j = 0; j < indexList.size(); j++) {
                    Obj.add(FunctionResult.get(i).get(indexList.get(j)));
                }
                sortList.add(Obj);
            }

            List<Integer> order = sort(sortList, sortType);

            List<List<String>> newList = new ArrayList<>();
            newList.add(FunctionResult.get(0));
            newList.add(FunctionResult.get(1));
            for (int i = 0; i < order.size(); i++) {
                newList.add(sortList.get(order.get(i)));
            }
            return newList;
        }else{
            return FunctionResult;
        }
    }

    public List<Integer> sort(List<List<String>> sortList, String SortType){

        String Valtype = "";
        int IndexNum = -1;
        List<Integer> int_Index = new ArrayList<>();
        List<String> String_Index = new ArrayList<>();
        for(int i = 0; i < sortList.size(); i++) {

            List<String> NumList = new ArrayList<>();
            List<String> RestList = new ArrayList<>();
            try {
                Valtype = "int";
                Integer.parseInt(sortList.get(0).get(1));
            } catch (NumberFormatException e) {
                Valtype = "string";
            }
            int Num = 0;
            String Word = "";
            if(Valtype.equalsIgnoreCase("int")){
                if(SortType.equalsIgnoreCase("ASC")) {
                    Num = 1000000;
                }else if(SortType.equalsIgnoreCase("DESC")){
                    Num = -1000000;
                }
            }else if(Valtype.equalsIgnoreCase("string")){
                if(SortType.equalsIgnoreCase("ASC")) {
                    Word = "A";
                }else if(SortType.equalsIgnoreCase("DESC")){
                    Word = "Z";
                }
            }
            for (int j = 0; j < sortList.size(); j++) {
                if(!int_Index.contains(j) && !String_Index.contains(sortList.get(j).get(1))) {
                    int int_value = 0;
                    String string_value = "";
                    if(Valtype.equalsIgnoreCase("int")){
                        int_value = Integer.parseInt(sortList.get(j).get(1));
                    }else if(Valtype.equalsIgnoreCase("string")){
                        string_value = sortList.get(j).get(1);
                    }
                    if(Valtype.equalsIgnoreCase("int")) {
                        if (SortType.equalsIgnoreCase("ASC")) {
                            if (Num > int_value) {
                                Num = int_value;
                                IndexNum = j;
                                if (sortList.get(j).size() > 2) {
                                    for (int k = 2; k < sortList.size(); k++) {
                                        NumList.add(sortList.get(j).get(k));
                                    }
                                }
                            } else if (Num == int_value && sortList.get(j).size() > 2) {
                                for(int t = 2; t < sortList.get(j).size(); t++){
                                    if(Integer.parseInt(sortList.get(IndexNum).get(t)) > Integer.parseInt(sortList.get(j).get(t))){
                                        Num = Integer.parseInt(sortList.get(j).get(t));
                                        IndexNum = j;
                                        break;
                                    }
                                }
                            }
                        } else if (SortType.equalsIgnoreCase("DESC")) {
                            if (Num < int_value) {
                                Num = int_value;
                                IndexNum = j;
                                if (sortList.get(j).size() > 2) {
                                    for (int k = 2; k < sortList.get(j).size(); k++) {
                                        NumList.add(sortList.get(j).get(k));
                                    }
                                }
                            } else if (Num == int_value && sortList.get(j).size() > 2) {
                                for(int t = 2; t < sortList.get(j).size(); t++){
                                    if(Integer.parseInt(sortList.get(IndexNum).get(t)) < Integer.parseInt(sortList.get(j).get(t))){
                                        Num = Integer.parseInt(sortList.get(j).get(t));
                                        IndexNum = j;
                                        break;
                                    }
                                }
                            }
                        }

                    }else if(Valtype.equalsIgnoreCase("string")){
                        if (SortType.equalsIgnoreCase("ASC")) {
                            if (Word.compareTo(string_value) > 0) {
                                Word = new String(string_value);
                                IndexNum = j;
                                if (sortList.get(j).size() > 2) {
                                    for (int k = 2; k < sortList.size(); k++) {
                                        NumList.add(sortList.get(j).get(k));
                                    }
                                }
                            } else if (Word.compareTo(string_value) == 0 && sortList.get(j).size() > 2) {
                                for(int t = 2; t < sortList.get(j).size(); t++){
                                    if(sortList.get(IndexNum).get(t).compareTo(sortList.get(j).get(t)) > 0){
                                        Num = Integer.parseInt(sortList.get(j).get(t));
                                        IndexNum = j;
                                        break;
                                    }
                                }
                            }
                        } else if (SortType.equalsIgnoreCase("DESC")) {
                            if (Word.compareTo(string_value) < 0) {
                                Word = string_value;
                                IndexNum = j;
                                if (sortList.get(j).size() > 2) {
                                    for (int k = 2; k < sortList.size(); k++) {
                                        NumList.add(sortList.get(j).get(k));
                                    }
                                }
                            } else if (Word.compareTo(string_value) == 0 && sortList.get(j).size() > 2) {
                                for(int t = 2; t < sortList.get(j).size(); t++){
                                    if(sortList.get(IndexNum).get(t).compareTo(sortList.get(j).get(t)) < 0){
                                        Num = Integer.parseInt(sortList.get(j).get(t));
                                        IndexNum = j;
                                        break;
                                    }
                                }
                            }
                        }

                    }

                }
            }
            int_Index.add(IndexNum);
        }
        return int_Index;
    }

    public List<List<String>> functionsProcess(){
        if(this.ShuffleResult.get(0) != null) {
            List<List<String>> AllList = new ArrayList<>();
            AllList.add(this.ShuffleResult.get(0).get(0));
            AllList.add(this.ShuffleResult.get(0).get(1));

            List<String[]> ColIndex = new ArrayList<>();
            for (int i = 0; i < DataObject.selectList.size(); i++) {
                String[] Index_Name = new String[2];
                Index_Name[0] = String.valueOf(i);
                Index_Name[1] = DataObject.selectList.get(i)[0];
                if (Index_Name[1].equalsIgnoreCase("sum") || Index_Name[1].equalsIgnoreCase("max")) {
                    ColIndex.add(Index_Name);
                }
            }
            if (this.ShuffleResult.size() == 1 && ColIndex.size() == 0) {
                return this.ShuffleResult.get(0);
            }
            for (int j = 1; j < this.ShuffleResult.size(); j++) {

                List<String> NewRow = new ArrayList<>();
                for (int k = 0; k < this.ShuffleResult.get(j).get(0).size(); k++) {
                    boolean ok = true;
                    for (int o = 0; o < ColIndex.size(); o++) {
                        if (k == Integer.parseInt(ColIndex.get(o)[0])) {
                            ok = false;
                        }
                    }
                    if (ok) {
                        NewRow.add(this.ShuffleResult.get(j).get(0).get(k));
                    } else {
                        NewRow.add("");
                    }
                }

                List<String> FunctionValue = new ArrayList<>();
                List<String> ValueGrouped = new ArrayList<>();
                for (int o = 0; o < ColIndex.size(); o++) {
                    for (int k = 0; k < this.ShuffleResult.get(j).size(); k++) {
                        ValueGrouped.add(this.ShuffleResult.get(j).get(k).get(Integer.parseInt(ColIndex.get(o)[0])));
                    }
                    FunctionValue.add(getFunctionValue(ValueGrouped, ColIndex.get(o)[1]));
                }

                for (int u = 0; u < FunctionValue.size(); u++) {
                    NewRow.set(Integer.parseInt(ColIndex.get(u)[0]), FunctionValue.get(u));
                }

                AllList.add(NewRow);
            }
            return AllList;
        }
        return null;
    }
    public String getFunctionValue(List<String> ValueGrouped, String function){
        if(function.equalsIgnoreCase("sum")){
            int sum = 0;
            for (int i = 0; i < ValueGrouped.size(); i++) {
                if(!ValueGrouped.get(i).equalsIgnoreCase("null")) {
                    sum += Integer.parseInt(ValueGrouped.get(i));
                }
            }
            return String.valueOf(sum);
        }else if(function.equalsIgnoreCase("max")){

            int max = -1000000000;
            for(int i = 0; i < ValueGrouped.size(); i++){
                if(!ValueGrouped.get(i).equalsIgnoreCase("null")) {
                    if (Integer.parseInt(ValueGrouped.get(i)) > max) {
                        max = Integer.parseInt(ValueGrouped.get(i));
                    }
                }else{
                    if(max == -1000000000){
                        max = 0;
                    }
                }
            }
            return String.valueOf(max);
        }
        return "";
    }
}
