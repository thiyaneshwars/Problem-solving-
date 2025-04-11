import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=1;
        int b = n*n+1;
        for(int i=n;i>0;i--){
            for(int k=0;k<n-i;k++){
                System.out.print("--");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num+"*");
                num++;
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(b+"*");
                    b++;
            }
            System.out.println(b);
            b=b-2*(i-1);
        }
    }
}
