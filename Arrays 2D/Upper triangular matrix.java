import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int count=1;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[j][i]!=0){
                    count=0;
                    break;
                }
                }
            }
        if(count==1){
            System.out.println("Upper triangular matrix");
        }
        else{
             System.out.println("Not an Upper triangular matrix");
        }
        }
    }
