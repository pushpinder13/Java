import java.util.*;
class Solution {
    public static boolean find3Numbers(int arr[], int n, int x) {
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                int sum=arr[i]+arr[left]+arr[right];
                if(sum==x){
                    return true;
                }else if(sum<x){
                    left++;
                }else{
                    right--;
                    
                }
            }
        }
        
        return false;
        
    }
    
}
public class Triplet_Sum_in_Array {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter the value of x: ");
        int x=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the "+n+" elements: ");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println();
      
        boolean ans=Solution.find3Numbers(arr,n,x);
        if(ans){
            System.out.println(x+" is present");
        }
        else{
            System.out.println(x+" is not present ");
        }
        sc.close();
    }
}
