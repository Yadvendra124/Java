import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        double median;
        if(n%2==0){
            median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0 ;

        }
        else{
            median = arr[n/2];

        }
        System.out.println("Median : "+median);
    }
}
