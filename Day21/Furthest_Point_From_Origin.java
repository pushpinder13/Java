import java.util.Scanner;

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int neutral = 0;
        int left = 0;
        int right = 0;
        int n = moves.length();
        for (int i = 0; i < n; i++) {
            if (moves.charAt(i) == 'L') {
                left++;
            } else if (moves.charAt(i) == '_') {
                neutral++;
            } else if (moves.charAt(i) == 'R') {
                right++;
            }
        }
        return Math.max(right + neutral - left, left + neutral - right);
    }
}

public class Furthest_Point_From_Origin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the moves (L, R, _): ");
        String moves = sc.nextLine();
        Solution obj = new Solution();
        int ans = obj.furthestDistanceFromOrigin(moves);
        System.out.println(ans);
        sc.close();

    }
}
