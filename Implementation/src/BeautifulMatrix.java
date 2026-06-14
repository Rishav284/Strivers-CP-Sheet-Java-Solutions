import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[][] inp=new int[5][5];
        int locRow=0;
        int locCol=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                inp[i][j]=in.nextInt();
                if(inp[i][j]==1) {
                    locCol=j;
                    locRow=i;
                }
            }
        }
        int ans=Math.abs(locCol-2)+Math.abs(locRow-2);
        System.out.println(ans);
    }
}
