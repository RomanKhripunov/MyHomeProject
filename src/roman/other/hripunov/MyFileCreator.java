package roman.other.hripunov;

import java.io.*;

public class MyFileCreator {

    private String pathFile;
//    private String textFile;
    private File newFile;

    public MyFileCreator(){
        this("\\MyFirstFile.txt");
    }

    public MyFileCreator(String pathFile){
        this.pathFile = pathFile;
    }

    public void myFileCreate() throws IOException {
        newFile = new File(pathFile);
        if (newFile.createNewFile()) {
            System.out.println("File is created");
        } else {
            System.out.println("File already exist");
        }
        BufferedReader br = null;
        try {
            String s;
            br = new BufferedReader(new FileReader(pathFile));
            if ((s = br.readLine()) != null){
                System.out.println("File was not empty and was rewritten");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    public void myFileWrite(){
        try{
            TextForFile text = new TextForFile();
            if (!newFile.exists()){
                myFileCreate();
            }
            FileWriter fw = new FileWriter(newFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text.getTextFile());
            bw.close();
            System.out.println("File is written successfully");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public String toString() {
        return pathFile;
    }
    public String getPathFile(){
        return pathFile;
    }
}
