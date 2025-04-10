import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num =sc.nextInt();
                num = Math.abs(num);
                int a = num/1000;
                int b = num%10;
                System.out.print(a+b);
        
        
}
}
