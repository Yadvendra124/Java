
import java.util.*;

public class mathss {
    public static double areaofrectangle(double length, double width){
        return length * width;
    
    }
    public static double areaoftraingle(double height,double base){
        return 0.5*height*base;
    }
    public static double areaofcircle(double radius){
        return Math.PI *radius*radius;
    }
    public static double areaofsquare(double side){
        return side*side;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double m = sc.nextDouble();
        //Trignometric Operations
        System.out.println("Sin("+n+") = "+ Math.sin(n));
        System.out.println("Cos("+n+") = "+ Math.cos(n));
        System.out.println("Tan("+n+") = "+ Math.tan(n));
        System.out.println("Cot("+n+") = "+ (1.0/Math.tan(n)));
        System.out.println("Cosine("+n+") = "+ (1.0/Math.sin(n)));
        System.out.println("Sec("+n+") = "+ (1.0/Math.cos(n)));
        //Trignometric Inverse
        System.out.println("Sin^-1("+n+") = "+ Math.asin(n));
        System.out.println("Cos^-1("+n+") = "+ Math.acos(n));
        System.out.println("Tan^-1("+n+") = "+ Math.atan(n));
        System.out.println("Cot^-1("+n+") = "+ (1.0/Math.atan(n)));
        System.out.println("Cosine^-1("+n+") = "+ (1.0/Math.asin(n)));
        System.out.println("Sec^-1("+n+") = "+ (1.0/Math.acos(n)));
        //another some maths function
        System.out.println("Log("+n+") = "+ Math.log(n));
        System.out.println("Log10("+n+") = "+ Math.log10(n));
        System.out.println("Radian("+n+") = "+ Math.toRadians(n));
        System.out.println("Degree("+n+") = "+ Math.toDegrees(n));
        System.out.println("Sqrt("+n+") = "+ Math.sqrt(n));
        System.out.println("cbrt("+n+") = "+ Math.cbrt(n));
        System.out.println("Power("+n+") = "+ Math.pow(n, m));
        //Area
        System.out.println("Area of Rectangle : "+areaofrectangle(n, m));
        System.out.println("Area of Traingle : "+areaoftraingle(n, m));
        System.out.println("Area of Circle : "+areaofcircle(n));
        System.out.println("Area of Square : "+areaofsquare(n));




    }
}
