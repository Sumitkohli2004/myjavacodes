import java.util.*;

// Swap two numbers without using third variable.

public class Swap_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first elements - ");
        int a  = sc.nextInt();
        System.out.println("Enter second element" );
        int b = sc.nextInt();
        
        a=a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping - ");
        System.out.println("a - "+a+" b - "+b);
        
        
        
    }
    
}
