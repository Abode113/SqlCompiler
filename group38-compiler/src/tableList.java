import java.io.*;
import java.util.ArrayList;

public class tableList implements Serializable{
    ArrayList<table> tableList = new ArrayList<>();
    public static String filePath = "table_type.txt";

    public void createOrOverwirteTableListToFile(table newTable) throws IOException, ClassNotFoundException {

        this.tableList.add(newTable);

        File file = new File(filePath);

        if(file.createNewFile()){ // file not exist
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this.tableList);
            objectOut.close();

//  test read
//            this.readTableListFromFile();

        }else{ // file exist
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            this.tableList = (ArrayList<table>) objectIn.readObject();
            objectIn.close();

            this.tableList.add(newTable);
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(this.tableList);
            objectOut.close();


// test read
//            this.readTableListFromFile();
        }
    }

    public ArrayList<table> readTableListFromFile() throws IOException, ClassNotFoundException {

            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            this.tableList = (ArrayList<table>) objectIn.readObject();
            objectIn.close();

            return this.tableList;
    }
}
