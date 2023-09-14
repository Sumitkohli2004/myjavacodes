import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public  class append_100_Files {

    public static void generate100files() throws IOException{
    String folderPath = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/myFiles/";
    String filename = "";

    for(int i=1;i<=100;i++){
        filename = "file"+i+".txt";
        FileWriter fw = new FileWriter(folderPath+filename);
        for(int j=1;j<=5;j++){
            String st = UUID.randomUUID().toString();
            fw.append(st +"\n");
        }
        fw.close();
    }
}

public static void combine_files() throws IOException{
 String folderPath = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/myFiles/";
 
 String folder1 = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/ourfiles/appendedFile.txt";
 FileWriter fw = new FileWriter(folder1);
 String filename = "";
 for(int i=1;i<=100;i++){
     filename = "file"+i+".txt";
     FileReader fr = new FileReader(folderPath+filename);
    BufferedReader br = new BufferedReader(fr);
    
    String temp = "";
    while((temp = br.readLine()) != null){
        fw.write(temp+"\n");
    }
    fr.close();
    

 }
 fw.close();
}

public static void main(String[] args) throws IOException {
    generate100files();
    System.out.println("before combine - ");
    combine_files();
       System.out.println("after combine - ");
    
    }

}









      
        
    

