import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("The Sum of rows is ");
        int t=0;
        int count=0;
        for(int i=0;i<n;i++){
            int sum1=0;
            for(int j=0;j<m;j++){
                sum1+=a[i][j];
     }
            System.out.print(sum1+" ");
            if(sum1>t){
                      t=sum1;
                      count++;
            }    
        }
        System.out.println();
        System.out.println("Row "+count+" has a maximum sum");
        int temp=0;
        int c=0;
        System.out.print("The Sum of columns is ");
           for(int i=0;i<n;i++){
            int sum2=0;
            for(int j=0;j<m;j++){
                sum2+=a[j][i];
            }
            System.out.print(sum2+" ");
               if(sum2>temp){
                   temp=sum2;
                   c++;
               }
        }
        System.out.println();
        System.out.println("Column "+c+" has the maximum sum");
    }
}
