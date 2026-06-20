import java.util.Scanner;

public class ArrWithOddSum {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                int n=in.nextInt();
                int[] a=new int[n];
                boolean allEven=true;
                boolean atLeastOneEven=false;
                for(int i=0;i<n;i++){
                    a[i]=in.nextInt();
                    if((a[i]&1)==1) allEven=false;
                    if((a[i]&1)==0) atLeastOneEven=true;
                }
                if(!allEven && ((n&1)==1 || atLeastOneEven)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
}
