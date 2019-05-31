import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tableList implements Serializable{
    ArrayList<table> tableList = new ArrayList<>();
    public static String filePath = "table_type.txt";

    public void createTableOutputData(String FileName, List<List<String>> Data){

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(FileName, "UTF-8");

            if(Data != null) {
                for (int i = 0; i < Data.size(); i++) {
                    String str = "";
                    for (int j = 0; j < Data.get(i).size(); j++) {
                        str += Data.get(i).get(j) + ", ";
                    }
                    writer.println(str);
                }
            }else{
                writer.println("");
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public void createTableOutputGroupedData(String FileName, List<List<List<String>>> Data){

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(FileName, "UTF-8");
            if (Data != null) {
                for (int i = 0; i < Data.size(); i++) {
                    if (Data.get(0) != null) {
                        String str = "";
                        for (int j = 0; j < Data.get(i).size(); j++) {
                            for (int k = 0; k < Data.get(i).get(j).size(); k++) {
                                str += Data.get(i).get(j).get(k) + ", ";
                            }
                            writer.println(str);
                            str = "";
                        }
                        writer.println("");
                    }else{
                        writer.println("");
                    }
                }
            }else{
                writer.println("");
            }
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("hey");
    }

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
                    Location = getString(tableListObj.get(i).location) + tableListObj.get(i).tablename + "/";
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

            File folder = new File(Location);
            File[] listOfFiles = folder.listFiles();

            BufferedReader firstFile = new BufferedReader(new FileReader(Location + "head.csv"));
            String FirstLine = firstFile.readLine();
            String[] Firstvalues = FirstLine.split(delemeter);
            for(int s = 0; s < Firstvalues.length; s++){
                Firstvalues[s] = Firstvalues[s].replaceAll("\\s+", "");
                Firstvalues[s] = TableName + "." + Firstvalues[s];
            }
            records.add(Arrays.asList(Firstvalues));

            Location = Location.replace('/','\\');
            for(int k = 0; k < listOfFiles.length; k++) {
                if(!listOfFiles[k].toString().equalsIgnoreCase(Location + "head.csv")) {
                    BufferedReader br = new BufferedReader(new FileReader(listOfFiles[k]));
//            BufferedReader br = new BufferedReader(new FileReader("prices.csv"));
//                    boolean first = true;
                    while ((line = br.readLine()) != null) {
                        String[] values = line.split(delemeter);
                        for (int j = 0; j < values.length; j++) {
                            values[j] = values[j].replaceAll("\\s+", "");
//                            if (first) {
//                                first = false;
//                                for (int t = 0; t < values.length; t++) {
//                                    values[t] = TableName + "." + values[t];
//                                }
//                            }
                        }
                        records.add(Arrays.asList(values));
                    }
                }
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
