import java.util.Scanner;

public class ChewbaccaAndNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        long ans=0;
        double count=0;
        while (n>=10 && (n%10==0 || 9-(n%10)==0)){
            count++;
            n/=10;
        }
        while (n>0){
            long rem=n%10;
            if(n>10 || (n<10 && 9-rem!=0)){
                rem=Math.min(rem,9-rem);
            }
            ans=ans*10+rem;
            n/=10;
        }
        n=0;
        while (ans>0){
            long rem=ans%10;
            n=n*10+rem;
            ans/=10;
        }
        n*= (int) Math.pow((double) 10,count);
        System.out.println(n);
    }
}
