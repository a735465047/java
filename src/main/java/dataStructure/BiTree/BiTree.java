package dataStructure.BiTree;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
/*二叉排序树的定义
 */
public class BiTree {
    public TreeNode root;
    int size;

    public boolean addTreeNode(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
            return true;
        }
        TreeNode currentNode = root;
        TreeNode parentNode;
        while (true) {
            parentNode = currentNode;// 保存父节点
            // 插入的数据比父节点小
            if (currentNode.value > data) {
                currentNode = currentNode.lefNode;
                // 当前父节点的左子节点为空
                if (null == currentNode) {
                    parentNode.lefNode = node;
                    node.parent = parentNode;
                    System.out.println("数据成功插入到二叉查找树中");
                    size++;
                    return true;
                }
                // 插入的数据比父节点大
            } else if (currentNode.value < data) {
                currentNode = currentNode.rightNode;
                // 当前父节点的右子节点为空
                if (null == currentNode) {
                    parentNode.rightNode = node;
                    node.parent = parentNode;
                    System.out.println("数据成功插入到二叉查找树中");
                    size++;
                    return true;
                }
            } else {
                System.out.println("输入数据与节点的数据相同");
                return false;
            }
        }

    }

    /*
    查找值为data的节点。
     */
    public TreeNode findNode(int data) {
        if (null == root) {
            return null;
        }
        TreeNode current = root;
        while (current != null) {
            if (current.value == data) {
                return current;
            } else if (current.value > data) {
                current = current.lefNode;
            } else {
                current = current.rightNode;
            }
        }
        return null;
    }

    /*
    递归前序遍历,根左右
     */
    public static void preOrderMethd(TreeNode node) {
        if (null != node) {
            System.out.print(node.value);
            if (null != node.lefNode) {
                preOrderMethd(node.lefNode);
            }
            if (null != node.rightNode) {
                preOrderMethd(node.rightNode);
            }
        }
    }

    /*
    递归中序遍历，左根右
     */
    public static void midOrderMethd(TreeNode node) {
        if (null != node) {

            if (null != node.lefNode) {
                midOrderMethd(node.lefNode);
            }
            System.out.print(node.value);
            if (null != node.rightNode) {
                midOrderMethd(node.rightNode);
            }
        }
    }

    /*
 递归后序遍历，左右根
  */
    public static void afterOrderMethd(TreeNode node) {
        if (null != node) {

            if (null != node.lefNode) {
                afterOrderMethd(node.lefNode);
            }

            if (null != node.rightNode) {
                afterOrderMethd(node.rightNode);
            }
            System.out.print(node.value);
        }
    }

    public static void main(String[] args) {
        BiTree biTree = new BiTree();

        biTree.addTreeNode(1);
        biTree.addTreeNode(4);
        biTree.addTreeNode(2);
        biTree.addTreeNode(3);
        biTree.addTreeNode(8);
        biTree.addTreeNode(6);
        BiTree.preOrderMethd(biTree.root);
        System.out.println();
        BiTree.afterOrderMethd(biTree.root);
        System.out.println();
        BiTree.midOrderMethd(biTree.root);
    }

}
