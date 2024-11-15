public class Theard1 extends Thread{
    public void run(){
        System.out.println("thread is running..");
    }
    public static void main(String[] args) {
        Theard1 t1 = new Theard1();
        t1.start();
        
    }
}
