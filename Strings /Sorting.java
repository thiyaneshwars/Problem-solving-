import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char ch[]=a.toCharArray();
        for(int i=0;i<a.length()-1;i++){
            for(int j=i+1;j<a.length();j++){
                if(ch[i]>ch[j]){
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
        }
        a=new String(ch);
        System.out.println(a);
     }
}
