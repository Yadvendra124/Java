
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = sc.nextInt();
        int b = 0;
        for(int i= 1;i<=a;i++){
            if(a%i==0){
                b++;
            }

        }
        if(b==2){
            System.out.println(a+" is prime number ");
        }else{
            System.out.println(a+" is not prime number ");
        }

    }
}
