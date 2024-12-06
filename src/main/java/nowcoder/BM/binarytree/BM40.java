package nowcoder.BM.binarytree;

import java.util.Arrays;

public class BM40 {
    public TreeNode reConstructBinaryTree(int[] preOrder, int[] vinOrder) {
        if (preOrder.length == 0 || vinOrder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preOrder[0]);
        for (int i = 0; i < preOrder.length; i++) {
            if (vinOrder[i] == preOrder[0]) {
                // copyOfRange左闭右开
                root.left = reConstructBinaryTree(Arrays.copyOfRange(preOrder, 1, i + 1), Arrays.copyOfRange(vinOrder, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(preOrder, i + 1, preOrder.length), Arrays.copyOfRange(vinOrder, i + 1, vinOrder.length));
                break;
            }
        }
        return root;
    }
}
