import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1,x2,y1,y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        
        float formula = (x1+x2)/2;
        float formula1=(y1+y2)/2;
        System.out.print("Arun's house is located at("+formula+","+(formula1)+")");
    }
}
