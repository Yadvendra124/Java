
import java.io.IOException;


public class TestThrows{
    void m()throws IOException{
        throw new IOException("DEVICE ERROR");
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        TestThrows t = new TestThrows();
        t.p();
        System.out.println("Normal Flow");
    }
}