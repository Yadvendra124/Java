
import java.util.Scanner;

public class Q21 {
    public static int convertBinaryToDecimal(long binary) {
        int decimal = 0, power = 0;
        long a;
        while (binary != 0) {
            a = binary % 10;
            binary /= 10;
            decimal += a * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
    public static long convertDecimalToBinary(int decimal) {
        long binary = 0;
        int a, i = 1;
        while (decimal != 0) {
            a = decimal % 2;
            decimal /= 2;
            binary += a * i;
            i *= 10;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int Decimal = sc.nextInt();
        System.out.println("Enter the Binary Number : ");
        long  Binary = sc.nextLong();
        long convertBin = convertDecimalToBinary(Decimal);
        System.out.println("Binary of "+Decimal+" is "+convertBin);
        int convertDec = convertBinaryToDecimal(Binary);
        System.out.println("Decimal of "+Binary+" is "+convertDec);
        
    }
}
