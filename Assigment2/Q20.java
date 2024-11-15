public class Q20 {
    public static void main(String[] args) {
        try{
            int[] negative = new int[-5];
        }catch(NegativeArraySizeException e){
            System.out.println("Negative Size Array");
        }
        System.out.println("Rest of the code");
    }
}
