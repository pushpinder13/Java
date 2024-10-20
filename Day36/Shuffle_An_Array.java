import java.util.Random;
import java.util.Scanner;

class Solution {
    int[] ori;
    int[] arr;
    Random r;

    public Solution(int[] nums) {
        ori = new int[nums.length];
        arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ori[i] = nums[i];
            arr[i] = nums[i];
        }
        this.r = new Random();

    }

    public int[] reset() {
        return this.ori;
    }

    public int[] shuffle() {
        int l = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}

public class Shuffle_An_Array {

    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution(nums);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Shuffle the array");
            System.out.println("2. Reset the array");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int[] shuffled = solution.shuffle();
                    System.out.println("Shuffled array: ");
                    for (int num : shuffled) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int[] resetArray = solution.reset();
                    System.out.println("Array reset to original: ");
                    for (int num : resetArray) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
