import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String arr[]=new String[10];
        int a=0;
        while(flag){
            arr[a]=sc.next();
            if(arr[a].endsWith("####")){
                break;
            }
            a++;
        }
        for(int i=0;i<a;i++){
            if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0)){
                System.out.println(arr[i]);
            }
            else{
                System.out.println(arr[i]);
            break;
            }
        }
            }
}
