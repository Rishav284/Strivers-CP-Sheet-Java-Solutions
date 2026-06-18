import java.util.Scanner;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] difficulty=new int[n];
        boolean isEasy=true;
        for (int i=0;i<n;i++){
            difficulty[i]=in.nextInt();
            if(difficulty[i]==1) isEasy=false;
        }
        if(isEasy) System.out.println("EASY");
        else System.out.println("HARD");
    }
}
