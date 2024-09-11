package Exam;

public class Divison {
    public void Div(int a,int b){
        double c = a/b;
        System.out.println("Divison : "+c);
    }
    public static void main(String[] args) {
        Divison d = new Divison();
        d.Div(5, 7);
    }
}
