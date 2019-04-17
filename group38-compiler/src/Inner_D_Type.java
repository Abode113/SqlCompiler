import java.util.ArrayList;

public class Inner_D_Type implements java.io.Serializable{
    public String Name;
    public String Type;
    public String  Kind="";
    public String value="";


    D_Type parent;

    public Inner_D_Type() {
        parent=null;
    }

    public Inner_D_Type(String name, String type, D_Type parent,String kind) {
        Name = name;
        Type = type;
        Kind=kind;

        this.parent = parent;
    }
}
