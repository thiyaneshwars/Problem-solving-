import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x1=3;
        int y1=4;
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int diff1 = x2-x1;
        int diff2 = y2-y1;
        int product = (diff1*diff1)+(diff2*diff2);
        double squr = Math.sqrt(product);
        System.out.print((int)Math.floor(squr));
    }
}
