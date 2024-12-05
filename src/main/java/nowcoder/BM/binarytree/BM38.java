package nowcoder.BM.binarytree;

public class BM38 {
    public int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        if (root == null) {// 子树什么都没有->没找到
            return -1;
        }
        if (root.val == o1 || root.val == o2) {// 找到
            return root.val;
        }
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left >= 0 && right >= 0) {// 两边子树都找到->在root两侧
            return root.val;
        } else if (left >= 0) {// 都在左子树
            return left;
        } else {// 都在右子树
            return right;
        }
    }
}
