import Exam.Addition;
import Exam.Divison;
import Exam.Multiplication;
import Exam.Subtraction;

public class Calculator {
    public static void main(String[] args) {
        Addition b = new Addition();
        b.add(5,8);
        Subtraction s = new Subtraction();
        s.sub(10, 3);
        Multiplication m = new Multiplication();
        m.Mult(5,7);
        Divison d = new Divison();
        d.Div(20, 3 );
    }
}
