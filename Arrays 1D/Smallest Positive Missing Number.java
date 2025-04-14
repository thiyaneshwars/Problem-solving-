import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        int count = -1;
        int pos=a-1,k;
        for(k=0;k<=a-1;k++)
        {
            if(arr[k]>0)
                break;
        }
            for(int i=k;i<a-1;i++){
                if(arr[i]+1!=arr[i+1]){
                    count=(arr[i]+1);
                    break;
                }
                }
        if(count!=-1){
            System.out.println(count);
        }
        else{
            count =arr[pos]+1;
            System.out.println(count);
    }
    }
}
