import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp = n;
        while(temp!=0){
            int ld = temp%10;
            int product = 1;
            for(int i=2;i<=ld;i++){
                product*=i;
            }
            sum = sum+product;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
