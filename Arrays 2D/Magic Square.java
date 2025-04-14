import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0;
        for(int i=0;i<n;i++){
            sum1+=a[i][i];
        }
        int sum2=0;
        for(int i=0;i<n;i++){
            sum2+=a[i][n-i-1];
        }
        if(sum1==sum2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
