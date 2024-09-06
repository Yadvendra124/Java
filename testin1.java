class Animal{
    void bark(){
        System.out.println("barking..");
    }
    class Dog{
        void bark(){
            System.out.println("eating..");
        }
    }
}
class cat extends Animal{
    void meow(){
        System.out.println("meow..");
    }
}
public class testin1 {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.bark();
        c1.meow();

        
    }
}
