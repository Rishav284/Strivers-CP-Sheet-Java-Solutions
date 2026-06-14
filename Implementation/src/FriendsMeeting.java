import java.util.Arrays;
import java.util.Scanner;

public class FriendsMeeting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] num=new int[3];
        num[0]=in.nextInt();
        num[1]=in.nextInt();
        num[2]=in.nextInt();
        Arrays.sort(num);
        System.out.println((num[1]-num[0])+(num[2]-num[1]));
    }
}
