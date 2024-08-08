public class Typecasting {
    public static void main(String[] args) {
        //Automatic Casting
        //byte -> short -> char -> int -> long -> float -> double

        int Integer = 9;
        char ch = 'A';
        double Doublee = Integer;//Int->Double
        int Character = ch;
        System.out.println(Integer);
        System.out.println(Doublee);
        System.out.println(Character);
        //Narrow Casting
        //    double -> float -> long -> int -> char -> short -> byte 
        double pointValue = 2.67;
        int values = (int)pointValue;
        float f = (float)pointValue;
        char c = (char)pointValue;
        byte b = (byte)pointValue;
        System.out.println(pointValue);
        System.out.println(values);
        System.out.println(f);
        System.out.println(c);
        System.out.println(b);




    }
}
