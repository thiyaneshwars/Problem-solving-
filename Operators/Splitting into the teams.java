import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int member = sc.nextInt();
        int team = sc.nextInt();
        float total = member/team;
        float rem = member%team;
        System.out.println("The number of friends in each team is "+((int)Math.floor(total)+" and left out is "+((int)Math.floor(rem))));
    }
}
