
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Student : ");
        int n = sc.nextInt();
        int elgible=0;
        int Notelgible=0;
        for (int i = 0; i < n; i++) {
        System.out.println("Enter the marks of "+(i+1)+ " Student");
        System.out.println("Enter the Mathametics Marks : ");
        int Mathametics = sc.nextInt();
        System.out.println("Enter the Physics Marks : ");
        int Physics = sc.nextInt();
        System.out.println("Enter the Chemistry Marks : ");
        int Chemistry = sc.nextInt();
        int total =  Mathametics+Chemistry+Physics;
           if((Mathametics>=60 && Physics>=50 && Chemistry>=40 && total>=200 )|| (Mathametics+Physics)>=150){
            elgible++;
           }
           else{
            Notelgible++;
           }
        }
        System.out.println("Number of Student Elgible : " + elgible);
        System.out.println("Number of Student Not Elgible : " + Notelgible);

    }
}
