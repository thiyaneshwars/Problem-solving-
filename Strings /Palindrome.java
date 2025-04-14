import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char[] ca =a.toCharArray();
        int count=0;
        for(char c:ca){
            count++;
        }
        char[] ac = new char[count];
        for(int i=0;i<count;i++){
            ac[i]=ca[count-1-i];
        }
        int flag=0;
        for(int i=0;i<count;i++){
        if(ca[i]!=ac[i]){
            flag=-1;
            break;
        }
    }
        if(flag==0){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
