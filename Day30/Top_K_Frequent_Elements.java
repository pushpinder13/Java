import java.util.*;

public class Top_K_Frequent_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter kth element: ");
        int k = sc.nextInt();

        int a[] = Solution.topKFrequent(arr, k);
        for (int i : a) {
            System.out.print("[ " + i + "" + " ] ");
        }
        sc.close();
    }
}

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            h.put(nums[i], count);

        }
        List<Integer> l = new ArrayList<>(h.keySet());

        Collections.sort(l, (a, b) -> h.get(b) - h.get(a));

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = l.get(i);
        }
        return arr;

    }
}