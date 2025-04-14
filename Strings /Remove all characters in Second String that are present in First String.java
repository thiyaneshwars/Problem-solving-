import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b =sc.next();
        char ch2[]=b.toCharArray();
        char ch1[]=a.toCharArray();
        int n = b.length();
        for(int i=0;i<a.length();i++){
            for(int j=0;j<n;j++){
                if((ch1[i]==ch2[j])){
                    for(int k=j;k<n-1;k++){
                        ch2[k]=ch2[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
       for(int i=0;i<n;i++){
           System.out.print(ch2[i]);
       }
        }
    }
