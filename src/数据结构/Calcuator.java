package 数据结构;

public class Calcuator {
    public static void main(String[] args) {
        String expression = "70+2*6-4";
        //创建两个栈，分别是数字栈和符号栈
        Stack2 numStack = new Stack2(20);
        Stack2 operStack = new Stack2(20);
        int index = 0;
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
        char ch = ' ';
        String keepNum = "";//用于拼接多位数
        while (true) {
            ch = expression.substring(index, index + 1).charAt(0);//开始位置，取一个
            //判断
            if (operStack.isOper(ch)) {//运算符
                //判断符号栈是否为空
                if (!operStack.isEmpty()) {
                    //处理,比较优先级
                    if (operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);

                        //把运算结果入数栈
                        numStack.push(res);
                        //把当前符号入符号栈
                        operStack.push(ch);
                    } else {
                        operStack.push(ch);

                    }

                } else {
                    //如果为空直接入符号栈
                    operStack.push(ch);
                }
            } else {
                //numStack.push(ch - 48);
                //处理多位数
                keepNum += ch;
                if (index == expression.length() - 1) {
                    numStack.push(Integer.parseInt(keepNum));
                } else {
                    //判断下一个字符是不是数字
                    //如果ch是最后一位直接入数栈
                    if (operStack.isOper(expression.substring(index+1 , index + 2).charAt(0)))
                    {
                        numStack.push(Integer.parseInt(keepNum));
                        keepNum = "";
                    }
                }
            }

            //判断是否扫描完
            index++;
            if ((index >= expression.length())) {
                break;
            }
        }

        //最后的运算
        while (true) {
            //如果符号栈为空，计算最后结果
            if (operStack.isEmpty()) {
                break;
            } else {
                num1 = numStack.pop();
                num2 = numStack.pop();
                oper = operStack.pop();
                res = numStack.cal(num1, num2, oper);
                numStack.push(res);//最后结果入栈
            }
        }
        int fres = numStack.pop();
        System.out.printf("表达式%s=%d", expression, fres);
    }
}

//先创建一个栈
class Stack2 {
    private int maxsize;
    private int[] stack;
    private int top = -1;//top表示栈顶，初始化为-1

    public Stack2(int maxsize) {
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
        for (int i = top; i >= 0; i--) {
            System.out.printf("stack[%d]=%d\n", i, stack[i]);
        }
    }

    //返回运算符优先级，优先级用数字表示
    //数字越大优先级越高
    public int priority(int oper) {//目前表达式只有+ - * /
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    //判断是否是运算符
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    //计算方法
    public int cal(int num1, int num2, int oper) {
        int res = 0;//用于存放结果
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;//注意顺序
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }

    //返回栈顶值
    public int peek() {
        return stack[top];
    }

}

