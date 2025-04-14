import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i][1]>arr[j][1]){
                    int t=arr[i][1];
                    arr[i][1]=arr[j][1];
                    arr[j][1]=t;
                        
                    t=arr[i][0];
                    arr[i][0]=arr[j][0];
                    arr[j][0]=t;
                }
            }
        }
    int val1 = arr[n-1][0];
    int val2= arr[n-2][0];
          if(val1>val2){
              System.out.print(val2+" "+val1);
          }
        else{
            System.out.print(val1+" "+val2);
        }
    }
}
