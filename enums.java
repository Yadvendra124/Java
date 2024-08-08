
import java.util.*;


enum Day{
   Sunday,
   Monday,
   Tuesday,
   Wednesday,
   Thursday,
   Friday,
   Saturday;


}
public class enums{
    Day day;
    public enums(Day day){
        this.day=day;
    }
    public void dayIsLike() {
        switch (day) {
        case Monday:
            System.out.println("Mondays are bad.");
            break;
        case Friday:
            System.out.println("Fridays are better.");
            break;
        case Saturday:
            System.out.println("Saturday are good");

        case Sunday:
            System.out.println("Weekends are best.");
            break;
        default:
            System.out.println("Midweek days are so-so.");
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        enums e1 = new enums(Day.valueOf(str));
        e1.dayIsLike();
        
    }
}