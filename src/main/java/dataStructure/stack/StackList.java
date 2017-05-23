package dataStructure.stack;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
public class StackList {
    int[] stackArray = null;
    int top = -1;
    int maxSize = 0;

    public StackList(int num) {
        if (num > 0) {
            maxSize = num;
            stackArray = new int[num];
        } else
            maxSize = 100;
    }

    public int size() {
        return top + 1;
    }

    public boolean push(int i) {
        if (top == maxSize - 1) {
            throw new RuntimeException("栈满了");
        } else {
            stackArray[++top] = i;//注意是++top 而不是top++
            return true;
        }

    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("null stack");
        } else {
            top = top--;
            return stackArray[top + 1];
        }
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("栈空");
        } else
            return stackArray[top];
    }

    public static void main(String[] args) {
        StackList stackList = new StackList(100);
        for (int i = 0; i < 10; i++) {
            stackList.push(i);
        }
        System.out.print(stackList.size());
    }
}
