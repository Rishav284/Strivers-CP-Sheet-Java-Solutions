import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt();
            ArrayList<Integer> ans=new ArrayList<>();
            int val=n;
            int count=0;
            while (val>0){
                int rem=val%10;
                if(rem!=0) ans.add(rem*(int) Math.pow(10,count));
                count++;
                val/=10;
            }
            System.out.println(ans.size());
            for (Integer an : ans) {
                System.out.print(an + " ");
            }
            System.out.println();
        }
    }
}
