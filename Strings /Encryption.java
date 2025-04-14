import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        char arr[]=a.toCharArray();
        int b =a.length();
        int i=0;
        while(i<b-1){
            char t=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
            
            i+=2;
        }
        a = new String(arr);
        System.out.println(arr);
    }
}
