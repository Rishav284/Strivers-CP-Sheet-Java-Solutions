import java.util.Scanner;

public class MahmoudAndEhab {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            if((n&1)==0) System.out.println("Mahmoud");
            else System.out.println("Ehab");
        }
}
