public class Runnable1 implements Runnable {
    public void run(){
        System.out.println("Thread is Running");
    }
    public static void main(String[] args) {
        Runnable1 r1 = new Runnable1();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
