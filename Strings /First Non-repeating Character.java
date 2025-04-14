import java.util.Scanner;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int b =a.length();
        char arr[]=a.toCharArray();
        int count =0;
        for(int i=0;i<b;i++){
            int flag= 0;
            for(int j=0;j<b;j++){
                if(arr[i]==arr[j]){
                    flag =flag+1;
                }
                if(flag==2){
                    break;
                }
            }
            if(flag==1){
                System.out.println(arr[i]);
                break;
            }
            else{
                count++;
            }
        }
        if(count>b-1){
            System.out.println("All the characters are repetitive");
        }
        
    }
}
        

