import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
     
        for(int i =n;i<=m;i++){
        int temp = i;
        int sum = 0;
        int product = 1;
        
        while(temp!=0){
            sum=sum+(temp%10);
            product = product *(temp%10);
            temp = temp/10;
        }
            if(i==(sum+product)){
                System.out.println(i);
            } 
        }
    }
}
