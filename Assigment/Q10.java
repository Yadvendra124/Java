import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        
        for(int i=1;i<=a;i++){
        System.out.print(fibonacii(i)+" ");
        }

        
    }
    public static int fibonacii(int n){
        if(n==1) return 0;
        if (n==2) return 1;
        return fibonacii(n-1)+fibonacii(n-2);
    
    
    }
}
