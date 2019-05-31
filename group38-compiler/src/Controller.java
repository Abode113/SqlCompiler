import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    queryData DataObject;

    map _map;
    shuffle _shuffle;
    Reduce _Reduce;

    Controller(queryData DataObject){
        this.DataObject = DataObject;
        this._map = new map(this.DataObject);
    }

    public void process(){

        tableList _tableList = new tableList();

        deleteOrDrop();

        List<List<String>> MapResult = this._map.process();
        _tableList.createTableOutputData("MapResult", MapResult);

        this._shuffle = new shuffle(MapResult, this.DataObject);
        List<List<List<String>>> ShuffleResult = this._shuffle.process();
        _tableList.createTableOutputGroupedData("shuffleResult", ShuffleResult);

        this._Reduce = new Reduce(ShuffleResult, MapResult, this.DataObject);
        List<List<String>> ReduceResult = this._Reduce.process();
        _tableList.createTableOutputData("ReduceResult", ReduceResult);

        System.out.println("hey");

    }

    void deleteOrDrop(){
        if(this.DataObject.QueryTables.get(0)[1].equalsIgnoreCase("delete")){
            File folder = new File(this.DataObject.QueryTables.get(0)[0] + "/");
            deleteDirectoryRecursionJava6(folder);
        }else if(this.DataObject.QueryTables.get(0)[1].equalsIgnoreCase("drop")){
            tableList _tableList = new tableList();
            try {
                ArrayList<table> newtableListObj = new ArrayList<>();
                ArrayList<table> tableListObj = _tableList.readTableListFromFile();
                for(int i = 0; i < tableListObj.size(); i++){
                    if(!tableListObj.get(i).tablename.equalsIgnoreCase(this.DataObject.QueryTables.get(0)[0])){
                        newtableListObj.add(tableListObj.get(i));
                    }
                }

                FileOutputStream fileOut = new FileOutputStream("table_type.txt");
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
                objectOut.writeObject(newtableListObj);
                objectOut.close();

                tableListObj = _tableList.readTableListFromFile();

                System.out.println("hy");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    void deleteDirectoryRecursionJava6(File file) {
        if (file.isDirectory()) {
            File[] entries = file.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    deleteDirectoryRecursionJava6(entry);
                }
            }
        }
        if (!file.delete()) {
            try {
                throw new IOException("Failed to delete " + file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
