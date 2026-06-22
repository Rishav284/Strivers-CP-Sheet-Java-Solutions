import java.util.Scanner;

public class FloorNumber {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0) {
                int n = in.nextInt();
                int x = in.nextInt();
                if (n < 3){
                    System.out.println(1);
                    continue;
                }
                n-=2;
                int ans=(int) Math.ceil((double) n/x);
                System.out.println(1+ans);
            }
        }
}
