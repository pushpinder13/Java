import java.util.*;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : arr)
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        int distinctCount = 0;
        for (String s : arr) {
            if (countMap.get(s) == 1) {
                distinctCount++;
                if (distinctCount == k) {
                    return s;
                }
            }
        }
        return "";
    }
}

public class Kth_Distinct_String_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        Solution obj = new Solution();
        String result = obj.kthDistinct(arr, k);

        if (result.isEmpty()) {
            System.out.println("There are fewer than " + k + " distinct strings in the array.");
        } else {
            System.out.println("The " + k + "-th distinct string in the array is: " + result);
        }

        sc.close();
    }
}
