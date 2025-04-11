import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a = 0;
        int b = 1;
        int c ;
        for(int i=0;i<n-2;i++){
             c=a+b;
            a=b;
            b=c;
           
        }
         System.out.print(b);
      
        
    }
}
