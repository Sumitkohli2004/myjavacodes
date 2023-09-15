package FIle_info;

import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class myfile {

  public static void print_string() throws IOException {
    String path = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/FIle_info/info.txt";
    FileWriter fw = new FileWriter(path);
    Scanner sc = new Scanner(System.in);

    System.out.println("Eneter a String -");
    String st = sc.nextLine();

    while (!st.equals("q")) {
      fw.append(st + "\n");
      System.out.println("Enter a String - ");
      st = sc.nextLine();
    }

    fw.close();
  }

  public static void Get_info() throws IOException {
    String path = "C:/Users/DELL/Documents/ColectionFrameWork/file_handling/FIle_info/info.txt";
    FileReader fr = new FileReader(path);
    BufferedReader br = new BufferedReader(fr);
    int charcount = 0;
    int wordCount = 0;
    int lineCount = 0;
    String currentLine = "";
    while ((currentLine = br.readLine()) != null) {
      lineCount++;

      StringTokenizer word = new StringTokenizer(currentLine);
            wordCount += word.countTokens();

      
        charcount+=currentLine.length();
      

      
    }
    System.out.println("Number Of Chars In A File : " + charcount);

      System.out.println("Number Of Words In A File : " + wordCount);

      System.out.println("Number Of Lines In A File : " + lineCount);

    fr.close();

  }

  public static void main(String[] args) throws IOException {
    // print_string();
    Get_info();
  }
}
