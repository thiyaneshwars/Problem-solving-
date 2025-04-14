import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][]=new int[r][c];
        int b[][]=new int[r][c];
        int c1[][]=new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                c1[i][j]=0;
                for(int k=0;k<r;k++){
                    c1[i][j]+=(a[i][k]*b[k][j]);
                }
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                System.out.print(c1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
