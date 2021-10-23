package 数据结构;

public class MatchList {


    public static void main(String[] args) {
        Node num1 = new Node(1);
        Node num2 = new Node(3);
        Node num3 = new Node(4);
        Node num4 = new Node(6);
        Node num5 = new Node(8);
        Node num6 = new Node(1);
        Node num7 = new Node(2);
        Node num8 = new Node(4);
        Node num9 = new Node(5);
        Node num10 = new Node(6);
        //创建链表
        singleList listA = new singleList();
        singleList listB = new singleList();
        singleList listC = new singleList();
        //将数字添加到链表中
        listA.add2(num1);
        listA.add2(num3);
        listA.add2(num2);
        listA.add2(num4);
        listA.add2(num5);
        listB.add2(num6);
        listB.add2(num8);
        listB.add2(num7);
        listB.add2(num9);
        listB.add2(num10);
        listA.list();
        System.out.println();
        listB.list();
       int book1[]= Match(listA.getHead(),listB.getHead());
        for (int i = 1; i <20 ; i++) {
            if(book1[i]==1){
                Node num=new Node(i);
                listB.add2(num);
            }
        }
        listB.list();

    }

    //合并A B
    public static int []Match(Node head1, Node head2) {
        int book[] = new int[20];//标记数组
        //以B为基准
        Node temp1 = head1;
        Node temp2 = head2;
        while (true) {
            book[temp1.num] = 1;
            if (temp1.next == null) {
                break;
            }

            temp1 = temp1.next;
        }
        while (true) {
            if (temp2.next == null) {
                break;
            }
            book[temp2.num] = 1;
            temp2 = temp2.next;
        }
        return book;

    }
}


class Node {
    public int num;//数字
    public Node next;//下一个结点

    public Node(int num) {
        this.num = num;
    }
}

class singleList {
    //初始化头结点
    private Node head = new Node(0);

    public Node getHead() {
        return head;
    }

    //添加数字到单链表
    public void add(Node node) {
        Node temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void add2(Node node) {
        //因为是单链表，找的temp要位于添加位置的前一个结点
        Node temp = head;
        boolean flag = false;//flag标志添加的编号是否存在，默认为false
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.num > node.num)//找到位置
            {
                break;
            } else if (temp.next.num == node.num)//编号存在
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag
        if (flag) {
            System.out.printf("准备插入的数%d已经存在,不能加入\n", node.num);
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    //显示链表【遍历】
    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //头结点不能动
        Node temp = head.next;
        while (true) {
            //判断链表是否到最后
            if (temp == null) {
                break;
            }
            //输出结点信息
            System.out.println(temp.num);
            //将temp后移
            temp = temp.next;
        }


    }
}
