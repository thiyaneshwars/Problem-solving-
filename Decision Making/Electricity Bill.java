import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int unit = sc.nextInt();
        double bill=0;
        if(unit<=200){
            bill = unit*0.5;
        }
        else if(unit<=400){
            bill = unit*0.65+100;
        }
        else if(unit<=600){
            bill = unit*0.8+200;
        }
        else if(unit>600){
            bill = unit*1.25+425;
        }
        System.out.println("Rs."+(int)(Math.floor(bill)));
}
}
