
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        if(x>0){
            System.out.println("Postive Number ");
        }
        else if(x<0){
            System.out.println("Negative Number ");
        }
        else{
            System.out.println("Zero");
        }
        
    }

    
}
