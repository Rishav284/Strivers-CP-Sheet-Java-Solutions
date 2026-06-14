import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int k= in.nextInt();
        int l= in.nextInt();
        int c= in.nextInt();
        int d= in.nextInt();
        int p= in.nextInt();
        int nl= in.nextInt();
        int np= in.nextInt();
        int toast1=(k*l)/nl;
        int toast2=c*d;
        int toast3=p/np;
        int ans=Math.min(toast1,Math.min(toast2,toast3))/n;
        System.out.println(ans);
    }
}
