package Exam;
public class Addition{
    public void add(int a,int b){
        int c = a+b;
        System.out.println("Addition : "+c);
    }
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add(5,7);
    }
}



