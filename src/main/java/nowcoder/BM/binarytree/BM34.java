package nowcoder.BM.binarytree;

public class BM34 {
    int pre = Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
//        if (root == null) {
//            return false;
//        }
//        if (root.left == null && root.right == null) {
//            return true;
//        }
//        if (root.left != null && root.right != null && root.left.val < root.val && root.val < root.right.val) {
//            return isValidBST(root.left) && isValidBST(root.right);
//        }
//        return false;
        if(root == null){
            return true;
        }
        boolean left = isValidBST(root.left);
        if(root.val < pre){
            return false;
        }
        pre = root.val;
        boolean right = isValidBST(root.right);
        return left && right;
    }
}
