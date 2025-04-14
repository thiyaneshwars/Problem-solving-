import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int a[][]=new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int even = 0;
        int odd = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]%2!=0){
                    odd++;
                }
                else{
                    even++;
                }
            }
        }
        if(even==m*m||odd==m*m){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        }
}
