

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Choose the temprature");
        System.out.println("Press 1 for celsius");
        System.out.println("Press 2 for Fahrenheit");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Enter the Temprature :");
            double x = sc.nextDouble();
            double y = x*(1.8) + 32 ;
            System.out.println(x + "°C = "+y+"°F");
        }
        else if(a==2){
            System.out.println("Enter the Temprature :");
            double x = sc.nextDouble();
            double y = (x-32)*0.55 ;
            System.out.println(x + "°F = "+y+"°C");

        }
        else{
            System.out.println("Invalid ");
        }
    }
    
}
