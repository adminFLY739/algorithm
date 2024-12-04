package nowcoder.BM.binarytree;

public class BM33 {
    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }
        TreeNode temp = Mirror(pRoot.left);
        pRoot.left = Mirror(pRoot.right);
        pRoot.right = temp;
        return pRoot;
    }
}
