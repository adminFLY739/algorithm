package nowcoder.BM.binarytree;

import java.util.ArrayList;
import java.util.List;

public class BM30 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        List<TreeNode> lists = inOrder(pRootOfTree, new ArrayList<>());
        TreeNode treeNode = lists.get(0);
        TreeNode head = treeNode;
        for (int i = 1; i < lists.size(); i++) {
            TreeNode temp = lists.get(i);
            treeNode.right = temp;
            temp.left = treeNode;
            treeNode = temp;
        }
        return head;
    }

    public List<TreeNode> inOrder(TreeNode pRootOfTree, List<TreeNode> lists) {
        if (pRootOfTree == null) {
            return null;
        }
        inOrder(pRootOfTree.left, lists);
        lists.add(pRootOfTree);
        inOrder(pRootOfTree.right, lists);
        return lists;
    }
}
