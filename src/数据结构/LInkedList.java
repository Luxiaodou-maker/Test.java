package 数据结构;

import java.util.Stack;

public class LInkedList {


    public static void main(String[] args) {
        //进行测试
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        //创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //加入
//        singleLinkedList.addNode(hero1);
//        singleLinkedList.addNode(hero2);
//        singleLinkedList.addNode(hero3);
//        singleLinkedList.addNode(hero4);
        //第二种加入方法
        singleLinkedList.add2(hero1);
        singleLinkedList.add2(hero4);
        singleLinkedList.add2(hero2);
        singleLinkedList.add2(hero3);
        singleLinkedList.list();
        System.out.println();
        //修改结点
        HeroNode newheronode = new HeroNode(2, "小卢", "玉麒麟——————");
        singleLinkedList.update(newheronode);
        //显示
        singleLinkedList.list();
        System.out.println();
        //删除一个节点
        singleLinkedList.deletenode(1);
        singleLinkedList.list();
        //有效节点个数
        System.out.println(getlength(singleLinkedList.getHead()));
        //得到倒数的节点
        HeroNode res = find(singleLinkedList.getHead(), 1);
        System.out.println(res);

        //测试反转链表
        System.out.println("原来的是");
        singleLinkedList.list();
        System.out.println("逆序打印");
        rePrint(singleLinkedList.getHead());
        System.out.println("反转后是");
        reverseList(singleLinkedList.getHead());
        singleLinkedList.list();
    }

    //获取单链表的结点个数
    public static int getlength(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode cur = head.next;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        return length;
    }
    //实现逆序打印
    public static  void rePrint(HeroNode head){
        if(head.next==null){
            return;
        }
        //创建一个栈，将各个结点压入栈
        Stack<HeroNode> stack=new Stack<HeroNode>();
        HeroNode cur=head.next;
        //将链表所有节点压入栈
        while (cur!=null){
            stack.push(cur);
            cur = cur.next;
        }
        //pop出栈
        while (stack.size()>0){
            System.out.println(stack.pop());
        }
    }

    //将单链表进行反转
    public static void reverseList(HeroNode head) {
        //如果当前链表为空或者只有一个结点，无需反转，直接返回
        if (head.next == null || head.next.next == null) {
            return;
        }
        //定义一个辅助指针，帮助遍历原来的
        HeroNode cur = head.next;
        HeroNode next = null;
        HeroNode reserveHead = new HeroNode(0, " ", " ");
        //遍历原来的链表，每遍历一个结点将其取出放到reserhead的最前端
        while (cur != null) {
            next = cur.next;
            cur.next = reserveHead.next;
            reserveHead.next = cur;
            cur = next;
        }
        head.next = reserveHead.next;
    }

    //查找单链表中倒数第k个结点
    public static HeroNode find(HeroNode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getlength(head);
        if (index <= 0 || index > size) {
            return null;
        }
        HeroNode cur = head.next;
        for (int i = 0; i < size - index; i++) {
            cur = cur.next;
        }
        return cur;
    }
}

//定义一个结点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;//指向下一个结点

    //构造器
    public HeroNode(int hNo, String hName, String hNickName) {
        this.no = hNo;
        this.name = hName;
        this.nickname = hNickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname +
                '}';
    }
}

//定义一个SingleLinkedList管理英雄
class SingleLinkedList {
    //初始化头结点
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单向链表
    //不考虑编号的顺序时
    //1.找到当前链表的最后节点
    //将最后这个结点的next指向新的结点
    public void addNode(HeroNode node) {
        //head不能动，需要一个辅助遍历
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null)
                break;
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表最后
        //将最后这个结点的next指向新的结点
        temp.next = node;

    }

    public void add2(HeroNode node) {
        //因为是单链表，找的temp要位于添加位置的前一个结点
        HeroNode temp = head;
        boolean flag = false;//flag标志添加的编号是否存在，默认为false
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no)//找到位置
            {
                break;
            } else if (temp.next.no == node.no)//编号存在
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag
        if (flag) {
            System.out.printf("准备插入的英雄的编号%d已经存在,不能加入\n", node.no);
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    //修改结点的信息，根据编号来修改,no不能改
    public void update(HeroNode newnode) {
        // 判断是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的结点，根据nO编号
        //定义一个辅助变量
        HeroNode temp = head.next;
        boolean flag = false;//表示是否找到该节点
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == newnode.no) {
                //找到结点
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = newnode.name;
            temp.nickname = newnode.nickname;
        } else {
            System.out.println("没有找到结点");
        }
    }

    //删除结点
    public void deletenode(int no) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("要删除的节点不存在");
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
        HeroNode temp = head.next;
        while (true) {
            //判断链表是否到最后
            if (temp == null) {
                break;
            }
            //输出结点信息
            System.out.println(temp);
            //将temp后移
            temp = temp.next;
        }
    }
}
