import java.util.*;
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int arr[][] = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               System.out.print(arr[i][j]+" : ("+(i+1)+","+(j+1)+"), ");
            }
        }
     }
}
