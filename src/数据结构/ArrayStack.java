package 数据结构;

import java.util.Scanner;

public class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        String key = " ";
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);

        while (loop) {
            System.out.println("show,显示");
            System.out.println("exit,退出");
            System.out.println("push，入栈");
            System.out.println("pop,出栈");
            System.out.println("输入你的选择");
            key = scanner.next();
            switch (key) {
                case "s":
                    stack.list();
                    break;
                case "push":
                    System.out.println("输入一个数");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case "pop":
                    try {
                        int res = stack.pop();
                        System.out.printf("出栈的数据是%d\n", res);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                case "exit":
                    scanner.close();
                    loop = false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出");
    }
}

class Stack {
    private int maxsize;
    private int[] stack;
    private int top = -1;//top表示栈顶，初始化为-1

    public Stack(int maxsize) {
        this.maxsize = maxsize;
        stack = new int[this.maxsize];
    }

    //栈满
    public boolean isFull() {
        return top == maxsize - 1;
    }

    //栈空
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空");
        }
        int value = stack[top];
        top--;
        return value;
    }

    //遍历栈
    public void list() {
        if (isEmpty()) {
            System.out.println("栈空，没有数据");
            return;
        }
        for (int i = top; i >=0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }
}
