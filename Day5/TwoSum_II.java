import java.util.Scanner;

public class TwoSum_II {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;
        int[] n = new int[2];
        
        while (s < e) {
            if (numbers[s] + numbers[e] == target) {
                n[0] = s + 1;
                n[1] = e + 1;
                break;
            }
            if (numbers[s] + numbers[e] < target) {
                s++;
            } else {
                e--;
            }
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
      
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        
        TwoSum_II  solution = new TwoSum_II ();
        int[] result = solution.twoSum(numbers, target);
        
        System.out.println("Indices of the two numbers whose sum is equal to target:");
        System.out.println("Index 1: " + result[0]);
        System.out.println("Index 2: " + result[1]);
        
        scanner.close();
    }
}
