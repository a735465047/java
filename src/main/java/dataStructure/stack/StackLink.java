package dataStructure.stack;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
public class StackLink {
    Node top;//栈顶元素
    int size;//

    public StackLink() {
        top = null;
    }

    public boolean push(int e) {
        top = new Node(e, top);
        return true;

    }

    public Node pop() {
        if (size == 0) {
            throw new RuntimeException("null stack");
        } else {
            Node node = top;//指针移动一位
            top = top.next;
            size--;
            return node;//取出栈顶节点
        }

    }

    public Node peek() {
        if (isEmpty()) {
            throw new RuntimeException("null stack");
        } else
            return top;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        //        return size == 0 ? true : false;
        return size == 0;
    }
}
