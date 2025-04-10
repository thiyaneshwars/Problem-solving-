import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alp = sc.next().charAt(0);
        if((alp=='A'||alp=='E'||alp=='I'||alp=='O'||alp=='U')||(alp=='a'||alp=='e'||alp=='i'||alp=='o'||alp=='u'))
        {
            System.out.println("Vowel");
        }
        else if(alp>='A'&&alp<='Z'||alp>='a'&&alp<='z'){
            System.out.println("Consonant");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }
}
