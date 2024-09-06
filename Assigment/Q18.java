
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int b = 0;
        while(a!=0){
            a=a/10;
            b++;
            
        }
        System.out.println("Number of the Digit : "+b);
    }
}
