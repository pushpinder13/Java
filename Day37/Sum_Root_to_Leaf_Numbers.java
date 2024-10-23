public class Sum_Root_to_Leaf_Numbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int result = Solution.sumNumbers(root);
        System.out.println("Sum of all root-to-leaf numbers: " + result);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public static int sumNumbers(TreeNode root) {
        return solve(root, 0);
    }

    static int solve(TreeNode root, int ans) {
        if (root == null) {
            return 0;
        }
        ans = ans * 10 + root.val;

        int left = solve(root.left, ans);
        int right = solve(root.right, ans);

        if (root.left == null && root.right == null) {
            return ans;
        }
        return left + right;

    }
}