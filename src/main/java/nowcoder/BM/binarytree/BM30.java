package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM30 {
    private List<TreeNode> lists = new ArrayList<>();

    public TreeNode Convert(TreeNode pRootOfTree) {
        lists = inOrder(pRootOfTree);
        TreeNode treeNode = lists.get(0);
        for (int i = 1; i < lists.size() - 1; i++) {
            treeNode.right = lists.get(i);
            treeNode.right.left = treeNode;
            treeNode = treeNode.right;
        }
        treeNode.left = lists.get(lists.size() - 1);
        return treeNode;
    }

    public List<TreeNode> inOrder(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        inOrder(pRootOfTree.left);
        lists.add(pRootOfTree);
        inOrder(pRootOfTree.right);
        return lists;
    }
}
