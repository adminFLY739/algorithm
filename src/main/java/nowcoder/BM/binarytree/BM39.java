package nowcoder.BM.binarytree;

import java.util.*;

public class BM39 {
//    String Serialize(TreeNode root) {
//        if (root == null) {
//            return "{}";
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        List<TreeNode> list = new ArrayList<>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            list.add(node);
//            if (node.left != null) {
//                queue.add(node.left);
//            } else {
//
//            }
//            if (node.right != null) {
//                queue.add(node.right);
//            }
//        }
//        StringBuilder sb = new StringBuilder();
//        for (TreeNode node : list) {
//            sb.append(node.val);
//        }
//        return sb.toString();
//    }
//    TreeNode Deserialize(String str) {
//
//    }
    // todo
    int INF = 0x3f3f3f3f;
    TreeNode emptyNode = new TreeNode(INF);
    public String Serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        // 使用队列进行层序遍历，起始先将 root 放入队列
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        while (!d.isEmpty()) {
            // 每次从队列中取出元素进行「拼接」，包括「正常节点」和「叶子节点对应的首位空节点」
            TreeNode poll = d.pollFirst();
            sb.append(poll.val + "_");
            // 如果取出的节点不为「占位节点」，则继续往下拓展，同时防止「占位节点」不继续往下拓展
            if (!poll.equals(emptyNode)) {
                d.addLast(poll.left != null ? poll.left : emptyNode);
                d.addLast(poll.right != null ? poll.right : emptyNode);
            }
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) return null;
        String[] ss = data.split("_");
        int n = ss.length;
        TreeNode root = new TreeNode(Integer.parseInt(ss[0]));
        Deque<TreeNode> d = new ArrayDeque<>();
        d.addLast(root);
        for (int i = 1; i < n - 1; i += 2) {
            TreeNode poll = d.pollFirst();
            int a = Integer.parseInt(ss[i]), b = Integer.parseInt(ss[i + 1]);
            if (a != INF) {
                poll.left = new TreeNode(a);
                d.addLast(poll.left);
            }
            if (b != INF) {
                poll.right = new TreeNode(b);
                d.addLast(poll.right);
            }
        }
        return root;
    }
}
