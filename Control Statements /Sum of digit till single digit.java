import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int sum=0  ;
        while(n!=0){
           
            int reminder = n%10;
            sum=sum+reminder;
            n=n/10;
        }
        int total=0;
        while(sum!=0){
            int reminder = sum%10;
            total=total+reminder;
            sum=sum/10;
        }
        System.out.print(total);
        }
    }
