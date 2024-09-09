interface Drawable{
    void draw();
}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing Rectangle..");
    }
}
class circle implements Drawable{
    public void draw(){
        System.out.println("Drawing circle ..");
    }
}
public class Interface {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
        // Rectangle r = new Rectangle();
        // r.draw();  
    }
}
