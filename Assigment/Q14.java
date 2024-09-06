
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Interval : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Multiple of 10 : ");
        for(int i=a;i<=b;i++){
            if(i%10==0){
                System.out.print(i+ " ");
            }

        }
    }
}
