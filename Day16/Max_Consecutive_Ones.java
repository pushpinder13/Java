import java.util.Scanner;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max_count=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)count++;
            else{count=0;}
            max_count=Math.max(count,max_count);
        }
        return max_count;
    }
}
public class Max_Consecutive_Ones {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.findMaxConsecutiveOnes(arr);
        System.out.println(result );
        sc.close();
    }
    
}
