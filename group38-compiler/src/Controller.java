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
}
