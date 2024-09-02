
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two Number : ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Values Before the Swapping : ");
        System.out.println("a = "+a+"; b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values After the Swapping : ");
        System.out.println("a = "+a+"; b = "+b);
        


    }
    
}
