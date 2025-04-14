import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        
        while (t-- >0){
            int n = sc.nextInt();
            int res=0,count=0,one=0;
        while(n!=0){
            int total = n%10;
            if(total==1){
                res = (res*10)+total;
                one++;
            }
            else{
                count++;
            }
            n/=10;
        }
            System.out.print(res);
            for(int i=0;i<count;i++){
                System.out.print("0");
            }
            System.out.println();
    }
    }
}
