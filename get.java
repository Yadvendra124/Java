 class abc{
    private String name ;
    void set(String name){
        this.name=name;

    }
    void get(){
        System.out.println(name);
    }
}
public class get{
    public static void main(String[] args) {
        abc emp = new abc();
        emp.set("Yadvendra");
        emp.get();
    }

}
