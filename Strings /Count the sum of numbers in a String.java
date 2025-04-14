import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ch = a.toCharArray();
        int sum ,ts= 0;
        int l = a.length();

        for (int i = 0; i < l; i++) {
            sum=0;
            if (ch[i] >'0' && ch[i] <= '9') {
                while (i< l && ch[i] >= '0' && ch[i] <= '9') {
                    sum = sum*10+(int)ch[i]-48;
                    i++;
                }
                ts=ts+sum;

            }
        }

        System.out.println(ts);
    }
}
