import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = sc.nextLine();
        char[] ch=a.toCharArray();
        int count=0;
        for(char c:ch){
            count++;
        }
        int vowel = 0;
        for(int i=0;i<count;i++){
            if((ch[i]=='A'||ch[i]=='E'||ch[i]=='U'||ch[i]=='O'||ch[i]=='I')||(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')){
                vowel++;
            }
        }
        System.out.println("Number of vowels: "+vowel);
    }
}
