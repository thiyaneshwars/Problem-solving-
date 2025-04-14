import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        if(num%2==0){
            int max[]=new int[num/2];
            int min[]=new int[num/2];
            for(int i=0;i<num/2;i++){
                max[i]=arr[i];
            }
            int a=num/2;
            int temp=(num/2)+1;
            for(int i=0;i<a;i++){
               min[i]=arr[i+a];
            }
            for (int i=0;i<a-1;i++){
                for(int j=i+1;j<a;j++){
                    if(min[i]>min[j]){
                    int d = min[i];
                    min[i]=min[j];
                    min[j]=d;
                }
                }
            }
            for(int i=0;i<num/2;i++){
                System.out.println(max[i]+" "+min[i]);
            }
        }
        else{
            int a = (num/2)+1;
           int max[]=new int[a];
            int min[]=new int[a];
            for(int i=0;i<a;i++){
                max[i]=arr[i];
            }
            int temp=a+1;
            for (int i = 0; i < num - a; i++) {
                min[i] = arr[a + i];
            }
              for (int i = 0; i < num - a - 1; i++) {
                for (int j = i + 1; j < num - a; j++) {
                    if (min[i] > min[j]) {
                        int d = min[i];
                        min[i] = min[j];
                        min[j] = d;
                    }
                }
            }
            for(int i=0;i<a;i++){
                System.out.println(max[i]+" "+min[i]);
            }
        }
    }
}
