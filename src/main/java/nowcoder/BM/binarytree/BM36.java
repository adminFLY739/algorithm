package nowcoder.BM.binarytree;

public class BM36 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right) && Math.abs(deep(root.left) - deep(root.right)) <= 1;
    }

    public int deep(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(deep(root.left), deep(root.right)) + 1;
    }
}
