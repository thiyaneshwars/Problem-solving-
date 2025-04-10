import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        System.out.println("The required length is "+(2*(length+breath))+" m");
        System.out.println("The required area of carpet is "+(length*breath)+" sqm");
            
    }
}
