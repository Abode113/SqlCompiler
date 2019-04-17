import java.util.ArrayList;

public class D_Type implements java.io.Serializable {

    public String Name;
    public String Type;
    public boolean Isfunction=false;

    public boolean istable=false;
    public ArrayList<table> tabl =new ArrayList<>();
     public ArrayList<Inner_D_Type> information = new ArrayList<Inner_D_Type>();

    public D_Type() {
    }

    public D_Type(String name) {
        Name = name;
    }
}

