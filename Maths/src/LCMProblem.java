import java.util.Scanner;

public class LCMProblem {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                long l=in.nextLong();
                long r=in.nextLong();
                if(r%l==0) System.out.println(l+" "+r);
                else if(2*l<r) System.out.println(l+" "+2*l);
                else System.out.println(-1+" "+-1);
            }
        }
}
