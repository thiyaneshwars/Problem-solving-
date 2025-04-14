import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos = sc.nextInt();
        
        
        if(pos<n){
        System.out.println("Array after insertion is");
            int element = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i==pos-1){
                System.out.println(element);
            }
            System.out.println(arr[i]);
        }
        }
            else{
                System.out.println("Invalid Input");
        }   
    }
}
