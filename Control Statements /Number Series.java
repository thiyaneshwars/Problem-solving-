import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
       int count=0;
        for(int i=1;i<=n;i++){
            count++;
            if(count%2==1){
                int a = (i*i)-1;
                 System.out.print(a+" ");
            }
            else{
                int a=(i*i)-2;
                 System.out.print(a+" ");
            }
        } 
       
    }
}
