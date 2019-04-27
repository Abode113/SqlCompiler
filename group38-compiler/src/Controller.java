public class Controller {

    queryData DataObject;

    map _map;

    Controller(queryData DataObject){
        this.DataObject = DataObject;
        this._map = new map(this.DataObject);
    }

    public void process(){

        this._map.process();

    }
}
