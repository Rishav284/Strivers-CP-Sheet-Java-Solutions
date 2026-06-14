import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        boolean right=true;
        for(int i=0;i<n;i++){
            if((i&1)==0){
                for(int j=0;j<m;j++){
                    System.out.print("#");
                }
                System.out.println();
            }
            else {
                if(right){
                    for(int j=0;j<m-1;j++){
                        System.out.print(".");
                    }
                    System.out.println("#");
                }else {
                    System.out.print("#");
                    for(int j=1;j<m;j++){
                        System.out.print(".");
                    }
                    System.out.println();
                }
                right=!right;
            }
        }
    }
}
