import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,flag;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            flag=1;
            for(j=0;j<i;j++){
                if(a[i]==a[j]){
                    flag=0;
                }
            }
            if(flag==1){
                System.out.println(a[i]);
            }   
        }
    }
}
