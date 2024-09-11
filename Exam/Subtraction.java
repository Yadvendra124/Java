package Exam;
public class Subtraction {
    public void sub(int a,int b){
        int c = a-b;
        System.out.println("Subtraction : "+c);

    }
    public static void main(String[] args) {
        Subtraction s = new Subtraction();
        s.sub(5, 10);
    }
}
