
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int b =0;
        while(a!=0){
           int c =  a%10;
           b = b*10 +c;
           a= a/10;
        }
        System.out.println("Reversed Number : "+b);
    }
}
