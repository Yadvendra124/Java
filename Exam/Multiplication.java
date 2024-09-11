package Exam;

public class Multiplication {
    public void Mult(int a , int b){
        int c = a*b;
        System.out.println("Multiplication : "+c);
    }
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.Mult(3, 4);
        
    }
}
