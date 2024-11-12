abstract class bike{
    abstract void run();
    abstract void stop();
    
}
class honda4 extends bike{
    void run(){
        System.out.println("running..");
    }
    void stop(){
        System.out.println("stopping..");
    }

}
public class Abstract {
    public static void main(String[] args) {
        bike obj1 = new honda4();
        obj1.run();
        obj1.stop();
        
    }
}
