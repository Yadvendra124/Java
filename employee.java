



class employe{
    private String employName;
    private float salary;
    private int experince;
    private String department;
    void set(String name , float Salary , int experince,String department){
        this.employName=name;
        this.salary=Salary;
        this.experince=experince;
        this.department=department;
    }
    void get(){
        System.out.println(employName);
        System.out.println(salary);
        System.out.println(experince);
        System.out.println(department);
    }

}
public class employee {
    public static void main(String[] args) {
        employe emp = new employe();
        emp.set("Yadvendra",5000,5,"IT");
        emp.get();
        

    }
}
