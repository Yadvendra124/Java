abstract  class ThreeDObject{
    abstract double wholeSurfaceArea();
    abstract double volume();
}
class Box extends ThreeDObject{
    double length,width,height;
    Box(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
}
public class Q9 {
    public static void main(String[] args) {
        
    }
}
