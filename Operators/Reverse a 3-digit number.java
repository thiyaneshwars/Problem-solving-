import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=0){
            int rev = num%10;
            System.out.print(rev);
            num=num/10;
        }
    }
}
