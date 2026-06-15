import java.util.Scanner;

public class ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n+1];
        int maxIndex=1;//Should be as left as possible (if multiple max then consider the leftmost)
        int minIndex=1;//Should be as right as possible (if multiple min then consider the rightmost)
        for(int i=1;i<n+1;i++){
            arr[i]=in.nextInt();
            if(arr[i]<=arr[minIndex]) minIndex=i;
            if(arr[i]>arr[maxIndex]) maxIndex=i;
        }
        if(arr[maxIndex]==arr[minIndex]) System.out.println(0);
        else if(maxIndex<minIndex) System.out.println(maxIndex-1+(n-minIndex));
        else{
            System.out.println(maxIndex-2+(n-minIndex));
        }
    }
}
