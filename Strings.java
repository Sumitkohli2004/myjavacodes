import java.util.*;
public class Strings {
    public static void main(String[] args) {
    //    String declaration
    //  String name = "sumit";
    //  String fullName = "sumit kohli";
    //  String sentence = "my name is sumit kohli";

    // Scanner sc = new Scanner(System.in);
    // String name = sc.nextLine();
    // System.out.println("Your name is - "+ name);  

    // concatenation = adding
    String first = "Sumit";
    String second = "Kohli";
    String fullname = first + " "+ second;
    System.out.println(fullname);

    // to find length
    System.out.println(fullname.length());

    // charAt
    for(int i=0;i<fullname.length();i++){
        System.out.print(fullname.charAt(i));
    }
    System.out.println();


    // compairing two strings
    //    String name1 = "Sumit";
    //    String name2 = "Kohli";

    // 1. case  s1>s2 : +ve value
    // 2. case  s1=s2 : 0
    // 3. case  s1<s2 : -ve value

    // if(name1.compareTo(name2)==0){
    //     System.out.println("Strings are equal");
    // }else
    // System.out.println("String are not equal");

    // this is not good use in strings   
//     if(name1==name2){
//         System.out.println("Strings are equal");
//     }else{
//     System.out.println("String are not equal");
// }

    // because
    // if(new String("sumit") == new String("sumit")){
    //     System.out.println("Strings are equal");
    // }else
    // System.out.println("Strings are not equal");


    // substring function
    String s = "My name is Sumit kohli";
    String s2 = s.substring(11, s.length());


    
     
    }
    
}
