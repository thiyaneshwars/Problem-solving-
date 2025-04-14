import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m = sc.nextInt();
        int arri[]=new int[n];
        int arrj[]=new int[m];
        int sum1=0;
        int sum2=0;
        if(n==m){
        for(int i=0;i<n;i++){
            arri[i]=sc.nextInt();
            sum1+=arri[i];
        }
        for(int j=0;j<m;j++){
            arrj[j]=sc.nextInt();
            sum2+=arrj[j];
        }
        if(sum1==sum2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        }
        else{
            System.out.println("Not Same");
        }
        
    }
}
