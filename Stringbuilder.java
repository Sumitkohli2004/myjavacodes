
import java.util.*;
import java.util.Scanner;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("S");
        StringBuilder sb2 = new StringBuilder("Sumit");
        sb.append("u");   // str = str + "u";
        sb.append("m");   // str = str + "m";
        sb.append("i");   // str = str + "i";
        sb.append("t");   // str = str + "t";
        System.out.println(sb);

        // length
        // System.out.println(sb.length());
        
        // System.out.println(sb);
        
        // char At index = 0;
        // System.out.println(sb.charAt(0));
        
        // set char At index = 0;
        // sb.setCharAt(0, 'p');
        // System.out.println(sb);

        // insert = 0;
        // sb.insert(0,'k');
        // System.out.println(sb);
        
        // insert at any index
        // sb.insert(4,'m');
        // System.out.println(sb);

        // delete an character
        // sb.delete(4, 5);
        // System.out.println(sb);

        //the default capacity of stringbuilder is - 16
        System.out.println("Default capacity of stringbuilder is - "+sb.capacity());
        
        // for getting class
        System.out.println(sb.getClass());

        // for getting hashcode
        System.out.println(sb.hashCode());

        // for compairing two stringbuilder
        System.out.println(sb.compareTo(sb2));

        // for reversing the string
        System.out.println(sb2.reverse());

        // make substring from given string
        System.out.println(sb.substring(0, 3));

        // make subsequence from given string
        System.out.println(sb.subSequence(0, 3));

        // leaves the index element
        System.out.println(sb.substring(3));

        // give true false if string is equal or not
        System.out.println(sb.equals(sb2));

      

        
    }
}
