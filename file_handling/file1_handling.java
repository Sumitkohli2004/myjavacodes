import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class file1_handling {

    public static String toUpperCase(String s) {
          String res = "";
          for(char ch : s.toCharArray()){
            if(ch >= 65 && ch<=90){
                res+=(char)(ch+32);

            }else if(ch>=90 && ch<=122){
                res+= (char)(ch-32);
            }else{
                res+=ch;
            }

          }
          return res;
    }

    public static void main(String[] args) throws FileNotFoundException {
         String path = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/file1-text.txt";
        try {
           
            FileWriter fw = new FileWriter(path);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter string - ");
            String s = sc.nextLine();

            while (!s.equals("q")) {
                fw.append(s + "\n");
                System.out.println("enter string - ");
                s = sc.nextLine();
            }
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        String path2 = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/file2-text.txt";
       
        try {
             FileWriter f2 = new FileWriter(path2);
             FileReader fr = new FileReader(path);
            BufferedReader b = new BufferedReader(fr);
            String temp = " ";
            while ((temp = b.readLine()) != null) {
             String v = toUpperCase(temp);
             f2.append(v+"\n");
            }
            f2.close();
            fr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
