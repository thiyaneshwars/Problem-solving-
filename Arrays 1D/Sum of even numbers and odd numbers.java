import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[]=new int[a];
        int odd=0;
        int even=0;
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    even+=arr[i];
                }
                else{
                    odd+=arr[i];
                }
            }
        System.out.println("The sum of the even numbers in the array is "+even);
        System.out.println("The sum of the odd numbers in the array is "+odd);
        
    }
}
