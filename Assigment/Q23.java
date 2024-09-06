public class Q23 {
    public static void main(String[] args) {
        //a
        int num = 1;
        for(int i=1;i<=3;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print(num+" ");
                num++;
            }
           System.out.println();
        }
        System.out.println("--------------");
        //b
        int n = 4;
        for(int i=1;i<=n;i++){
            int j;
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            int k = i;
            for(;j<=n;j++){
                System.out.print(k+" ");
                k--;
            }
            k=2;
            for(;j<=n+i-1;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
