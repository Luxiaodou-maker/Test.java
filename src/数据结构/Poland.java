package 数据结构;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Poland {
    public static void main(String[] args) {
        //中缀表达式转化为后缀表达式


        String suffixExpression = "1+((2+3)*4)-5";
        List<String> infixexpreesionlist = toInfixExpressionList(suffixExpression);

        System.out.println("对应的中缀表达式是"+infixexpreesionlist);
        List<String>suff=parse(infixexpreesionlist);
        System.out.println("后缀表达式是"+suff);
        System.out.printf("表达式=%d",cal(suff));
//        List<String> rpnList = getListString(suffixExpression);
//        System.out.println(rpnList);
//        int res = cal(rpnList);
//        System.out.println(res);
    }

    //将中缀表达式转化为list
    public static List<String> toInfixExpressionList(String s) {
        //定义一个List,存放中缀表达式对应的内容
        List<String> ls = new ArrayList<String>();
        int i = 0;
        String str;//对多位数进行拼接
        char c;
        do {
            if ((c = s.charAt(i)) < 48 || (c = s.charAt(i)) > 57) {
                ls.add("" + c);
                i++;
            } else {
                str = "";
                while (i < s.length() && (c = s.charAt(i)) >= 48 && (c = s.charAt(i)) <= 57) {
                    str += c;
                    i++;
                }
                ls.add(str);
            }
        } while (i < s.length());
        return ls;
    }

    //将中缀表达式转化为后缀表达式
    public static List<String> parse(List<String> ls) {
        //定义两个栈
        Stack<String> s1 = new Stack<String>();//符号栈
        List<String> s2 = new ArrayList<String>();
        for (String item : ls
        ) {
            //如果是一个数，加入s2
            if (item.matches("\\d+")) {
                s2.add(item);
            } else if (item.equals("(")) {
                s1.push(item);
            } else if (item.equals(")")) {
                while (!s1.peek().equals("(")) {
                    s2.add(s1.pop());
                }
                s1.pop();//消除（;
            } else {
                //当item的优先级小于s1栈顶运算符，将s1栈顶运算符弹出并加入到s2，再次从第一部比较i开始
                while (s1.size() != 0 &&Operration.getValue(s1.peek())>=Operration.getValue(item)){
                    s2.add(s1.pop());
                }
                s1.push(item);
            }
        }
        while (s1.size()!=0){
            s2.add(s1.pop());
        }
        return s2;
    }

    public static List<String> getListString(String suffixExpression) {
        String[] sqlit = suffixExpression.split(" ");
        List<String> list = new ArrayList<String>();
        for (String ele : sqlit
        ) {
            list.add(ele);
        }
        return list;
    }

    //完成运算
    public static int cal(List<String> ls) {
        //创建一个栈
        Stack<String> stack = new Stack<String>();
        //遍历
        for (String item : ls
        ) {
            //使用正则表达式判断
            if (item.matches("\\d+")) {//匹配的是多位数
                //入栈
                stack.push(item);
            } else {
                //pop出两个数，再运算,再入栈
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int res = 0;
                if (item.equals("+")) {
                    res = num1 + num2;
                } else if (item.equals("-")) {
                    res = num1 - num2;
                } else if (item.equals("*")) {
                    res = num1 * num2;
                } else if (item.equals("/")) {
                    res = num1 / num2;
                } else {
                    throw new RuntimeException("运算符有误");
                }
                //把res入栈
                stack.push("" + res);
            }
        }
        return Integer.parseInt(stack.pop());
    }
}

//返回运算符优先级
class Operration {
    private static int ADD = 1;
    private static int SUB = 1;
    private static int MUL = 2;
    private static int DIV = 2;

    //返回优先级数字
    public  static int getValue(String oper){
        int res=0;
        switch (oper){
            case "+":
                res=ADD;
                break;
            case "-":
                res=SUB;
                break;
            case "*":
                res=MUL;
                break;
            case "/":
                res=DIV;
                break;
            default:
                System.out.println("不存在该运算符");
                break;
        }
        return res;
    }
}
