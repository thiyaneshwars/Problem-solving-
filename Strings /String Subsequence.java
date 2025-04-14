import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c =0;
        int d = 0;
        while(c<a.length()&&d<b.length()){
            if(a.charAt(c)==b.charAt(d)){
                d++;
            }
            c++;
        }
        if(d==b.length()){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        }
}
