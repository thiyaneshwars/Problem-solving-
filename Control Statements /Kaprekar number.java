import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int square = a * a;
        int sq;
        int count = 0;
        int sum = 0;

        int temp = square;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        sq = a * a; 

        if (count == 4) {
            while (sq != 0) {
                int rem = sq % 100; 
                sum += rem;
                sq = sq / 100;
            }
        } 
        if(count==2){
            while(sq!=0){
                int rem = sq%10;
                sum+=rem;
                sq/=10;
            }
        }
        else {
            while (sq != 0) {
                int rem = sq % 1000; 
                sum += rem;
                sq = sq / 1000;
            }
        }

        if (a == sum) {
            System.out.print("Kaprekar Number");
        } else {
            System.out.print("Not a Kaprekar Number");
        }
    }
}
