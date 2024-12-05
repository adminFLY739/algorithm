package nowcoder.BM.binarytree;

public class BM37 {
    public int lowestCommonAncestor(TreeNode root, int p, int q) {
        if (p > q) {
            int temp = p;
            p = q;
            q = temp;
        }
        while (true) {// 根本上时判断两个节点是否在root的两边
            if (root.val <= q && root.val >= p) {
                return root.val;
            } else if (root.val > q) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
    }
}
