import java.util.*;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

public class Search_a_2D_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix: ");
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the target element to search: ");
        int target = sc.nextInt();
        
        Solution obj = new Solution();
        boolean found = obj.searchMatrix(matrix, target);
        
        if (found) {
            System.out.println("Target element " + target + " found in the matrix.");
        } else {
            System.out.println("Target element " + target + " not found in the matrix.");
        }

        sc.close();
    }
}
