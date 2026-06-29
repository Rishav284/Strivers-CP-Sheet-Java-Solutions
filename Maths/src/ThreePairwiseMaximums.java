import java.util.Scanner;

public class ThreePairwiseMaximums {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int t=in.nextInt();
            while (t-->0){
                long x=in.nextLong();
                long y=in.nextLong();
                long z=in.nextLong();
                if(x==y && y==z) {
                    System.out.println("YES");
                    System.out.println(x+" "+y+" "+z);
                }else if(x==y && x>z){
                    System.out.println("YES");
                    System.out.println(x+" "+z+" "+z);
                }else if(y==z && x<y){
                    System.out.println("YES");
                    System.out.println(x+" "+x+" "+z);
                }else if(x==z && x>y){
                    System.out.println("YES");
                    System.out.println(y+" "+x+" "+y);
                }else System.out.println("NO");
            }
        }
}
