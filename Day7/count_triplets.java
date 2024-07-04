import java.util.*;
class Solution {
    int countTriplet(int arr[], int n) {
         Arrays.sort(arr);
        int count = 0;
        
        for (int i = 0; i < n - 2; i++) {
            
            int left=0;
            int right=n-1;
            int third=arr[i+2];
            
            while(left<right){
                
                int sum=arr[left]+arr[right];
                
                if(sum==third){
                    count++;
                    left++;
                    right--;
                }else if(sum<third){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return count;
        
        
    }
}
public class count_triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
      Solution obj=new Solution();
      int c=obj.countTriplet(arr,n);
      System.out.println(c);
        sc.close();
    }

}



