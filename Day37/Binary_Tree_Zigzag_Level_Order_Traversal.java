import java.util.*;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = Solution.zigzagLevelOrder(root);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
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
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return l;
        }
        boolean lTor = true;
        q.add(root);

        while (!q.isEmpty()) {

            List<Integer> ll = new ArrayList<>();
            int size = q.size();

            for (int i = 0; i < size; i++) {
                TreeNode temp = q.remove();
                if (lTor) {
                    ll.add(temp.val);
                } else {
                    ll.add(0, temp.val);
                }

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }

            }

            l.add(ll);
            lTor = !lTor;
        }
        return l;

    }
}