
import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of element : ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
            
        }
        System.out.println("The smallest No. : "+min);
        
    }
}
