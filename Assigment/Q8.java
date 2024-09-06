
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the divisible Number : ");
        int b = sc.nextInt();
        if(a%b==0){
            System.out.println(a+" is divisible by " + b);
        }
        else{
            System.out.println(a+" is not divisible by " + b);

        }
    }
    
}
