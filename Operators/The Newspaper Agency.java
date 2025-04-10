import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paper = sc.nextInt();
        int cost = sc.nextInt();
        int wages = sc.nextInt();
        System.out.println((paper*cost)-(paper*wages)-100);
    }
}
