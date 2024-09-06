class Animal{
    void bark(){
        System.out.println("barking..");
    }
    
}
class Dog extends Animal{
    void bark(){
        System.out.println("eating..");
    }
}
class cat extends Dog{
    void meow(){
        System.out.println("meow..");
    }
}
public class overridding {
    public static void main(String[] args) {
        cat c1 = new cat();
        c1.bark();
        c1.meow();

        
    }
}
