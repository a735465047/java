package dataStructure.LinkedList;

import java.util.Stack;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
public class LinkedList {
    //新建一个链表
    public static Node createLinkedList(int num) {
        Node head = new Node(0);
        Node tmp = head;//这个是一个关键,否则创建的就是一个节点，而不是链表,这里相当于指针tmp指向head。
        for (int i = 1; i < num; i++) {
            tmp.next = new Node(i);
            tmp = tmp.next;
        }
        return head;
    }

    //打印链表
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.value);
            head = head.next;
        }
    }

    //翻转链表
    public static Node revertLinkedList(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = head.next;
        }
        return pre;
    }

    //反向输出单链表,利用栈的特性，先进后出原则
    public static void reverLinkedForStack(Node head) {
        Stack<Node> stack = new Stack<Node>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while (stack != null) {
            System.out.print(stack.pop().value);
        }

    }

    //判断单链表是否有环
    public static boolean ifHasHoop(Node head) {
        if (head == null || head.next == null)
            return false;
        Node node1 = head;
        Node node2 = head;
        boolean flag = false;
        while (node2 != null && node1 != null) {
            node1 = node1.next;
            node2 = node2.next.next;
            if (node1 == node2) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    //合并两个有序列表
    public static Node mergeNodeList(Node head1, Node head2) {
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
        while (head1 != null) {
            if (head1.value > head2.value) {
                head2.next = mergeNodeList(head2.next, head1);
                return head2;
            } else {
                head1.next = mergeNodeList(head1.next, head2);
                return head1;
            }
        }
        return null;
    }

    //查找链表中位数
    public static Node getMiddle(Node head) {
        Node node1 = head;
        Node node2 = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (node2 != null && node2.next != null) {
            node2 = node2.next.next;
            node1 = node1.next;
        }
        return node1;
    }

    //获得链表长度
    public static int getListLength(Node node) {
        int i = 0;
        while (node.next != null) {
            i++;
            node = node.next;
        }
        return i + 1;
    }

    //获取倒数第k个节点
    public static Node getKNode(Node head, int k) {
        int length = getListLength(head);
        Node target = head;
        Node next = head;
        for (int i = 0; i < k; i++) {
            next = next.next;
        }
        while (next != null) {
            target = target.next;
            next = next.next;
        }
        return target;
    }

    public static void main(String[] args) {
        Node head = createLinkedList(10);
        printLinkedList(head);
    }
}
