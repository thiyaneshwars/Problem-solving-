import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=100&&a<1000){
            int num = (a/10)%10;
            if(num%3==0){
                System.out.println("Trendy Number");
            }
            else{
                System.out.println("Not a Trendy Number");
            }
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}
