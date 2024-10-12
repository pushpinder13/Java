import java.util.*;

public class Maximum_Width_Ramp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Solution.maxWidthRamp(arr));
        sc.close();
    }

}

class Solution {
    public static int maxWidthRamp(int[] nums) {
        int sum = 0;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            l.add(i);
        }
        l.sort((a, b) -> Integer.compare(nums[a], nums[b]));

        int minIdx = l.get(0);

        for (int i = 1; i < nums.length; i++) {
            int currIdx = l.get(i);

            if (currIdx > minIdx) {
                sum = Math.max(sum, currIdx - minIdx);
            } else {
                minIdx = Math.min(minIdx, currIdx);
            }
        }
        return sum;
    }
}