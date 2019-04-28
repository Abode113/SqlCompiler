import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public List<List<String>> readDataFromCsvFile(String TableName){

        List<List<String>> records = new ArrayList<>();

        try {
            String Location = "";
            String delemeter = "";
            ArrayList<table> tableListObj = this.readTableListFromFile();
            for(int i = 0; i < tableListObj.size(); i++){
                if(tableListObj.get(i).tablename.equalsIgnoreCase(TableName)){
                    Location = getString(tableListObj.get(i).location) + tableListObj.get(i).tablename + ".csv";
                    delemeter = "\\" + getString(tableListObj.get(i).delemeter);
                    String type = "";
                    for (int j = 0; j < tableListObj.get(i).col.size(); j++){
                        type += tableListObj.get(i).col.get(j).column_name + getString(tableListObj.get(i).delemeter);
                    }
                    String[] types = type.split(delemeter);
                    for(int j = 0; j < types.length; j++){
                        types[j] = types[j].replaceAll("\\s+","");
                    }
                    records.add(Arrays.asList(types));
                    break;
                }
            }

            String line;
            Location = Location.substring(1);
            BufferedReader br = new BufferedReader(new FileReader(Location));
//            BufferedReader br = new BufferedReader(new FileReader("prices.csv"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(delemeter);
                for(int j = 0; j < values.length; j++){
                    values[j] = values[j].replaceAll("\\s+","");
                }
                records.add(Arrays.asList(values));
            }

            System.out.println(tableListObj);
        }catch(Exception e){
            List<List<String>> Records = new ArrayList<>();
        }
        return records;
    }

    public String getString (String Word){
        Word = Word.substring(1);
        Word = Word.substring(0, Word.length() - 1);
        return Word;
    }
}
