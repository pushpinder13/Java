import java.util.*;

public class Two_Out_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array1: ");
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();

        }
        System.out.println("Enter the size of array2: ");
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();

        }
        System.out.println("Enter the size of array3: ");
        int n3 = sc.nextInt();
        int arr3[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i] = sc.nextInt();

        }
        List<Integer> l = Solution.twoOutOfThree(arr1, arr2, arr3);
        System.out.print(l + "");
        sc.close();
    }
}

class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> s3 = new HashSet<>();

        Set<Integer> s = new HashSet<>();

        for (int i : nums1) {
            s1.add(i);
        }
        for (int i : nums2) {
            s2.add(i);
        }
        for (int i : nums3) {
            s3.add(i);
        }

        for (int num : s1) {
            if (s2.contains(num) || s3.contains(num)) {
                s.add(num);
            }
        }

        for (int num : s2) {
            if (s3.contains(num)) {
                s.add(num);
            }
        }
        return new ArrayList<>(s);

    }
}