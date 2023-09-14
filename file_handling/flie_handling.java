import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.FileReader;

public class flie_handling {
  public static void main(String[] args) throws IOException {
    // File f1 = new
    // File("C:/Users/DELL/Documents/ColectionFrameWork/file-text.txt");

    // f1.createNewFile();
    // System.out.println("can read file - "+f1.canRead());
    // System.out.println("can write file - "+f1.canWrite());
    // System.out.println("delete file - "+f1.delete());

    // if( f1.canWrite()){
    // System.out.println(true);
    // }else
    // System.out.println(false);

    // if(f1.canRead()){
    // System.out.println("true");
    // }else
    // System.out.println("false");

//    try{ String path = "C:/Users/DELL/Documents/ColectionFrameWork/file-text.txt";
//     FileWriter fw = new FileWriter(path);
//     Scanner sc = new Scanner(System.in);

//     System.out.println(" Enter String - ");
//     String st = sc.nextLine();

//     while (!st.equals("q")) {
//       fw.append(st + "\n");
//       System.out.println("Enter String - ");
//       st = sc.nextLine();
//     }
//       fw.close();
// }catch(Exception e){
//     e.printStackTrace();

//     }

 
 String path = "C:/Users/DELL/Documents/ColectionFrameWork/file-text.txt";
 FileReader fr= new FileReader(path);
 try{
  BufferedReader br = new BufferedReader(fr);
 String temp = " ";
 while ((temp = br.readLine()) != null) {
  System.out.println(temp);
    
}

fr.close();
 }catch (IOException e ){
   e.printStackTrace();

 }

 

 


  }

}
