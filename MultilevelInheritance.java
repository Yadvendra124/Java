class Animal{
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        BabyDog a = new BabyDog();
        a.bark();
        a.eat();
        a.weep();
        
    }
}
