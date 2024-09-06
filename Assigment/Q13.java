
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Range : ");
        int a = sc.nextInt();
        int natural =0;
        for(int i=1;i<=a;i++){
            natural=natural+i;
        }
        System.out.println("Sum of Natural Number : "+natural);
    }
}
