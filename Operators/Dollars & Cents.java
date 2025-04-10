import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


    int dollar1 = scanner.nextInt();
    int cent1 = scanner.nextInt();
    int dollar2 = scanner.nextInt();
    int cent2 = scanner.nextInt();


    int totalCents = cent1 + cent2;

    int totalDollars = dollar1 + dollar2 + (totalCents / 100);
    int remainingCents = totalCents % 100;

    System.out.println( totalDollars );
        System.out.println( remainingCents );
}
    }
