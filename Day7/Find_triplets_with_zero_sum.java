
import java.util.*;

class Solution {
    public boolean findTriplets(int arr[], int n) {
        if (n < 3)
            return false;
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (sum == 0) {
                    return true;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return false;

    }
}

public class Find_triplets_with_zero_sum {
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
        boolean ans=obj.findTriplets(arr,n);
        if(ans){
            System.out.println("Triplets present");
        }
        else{
            System.out.println("Triplets  not present ");
        }

        sc.close();
    }

}
