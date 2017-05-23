package dataStructure.BiTree;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
/*
树节点的定义
 */
public class TreeNode {
    int value;
    //节点的父节点
    TreeNode parent;
    //节点的左子节点
    TreeNode lefNode;
    //节点的右子节点
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }
}
