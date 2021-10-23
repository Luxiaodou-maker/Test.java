package 数据结构;

public class DoubleLinkedList {
    public static void main(String[] args) {
        System.out.println("双向链表的测试");
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");

        //创建一个双向链表
        DoubleList doubleList = new DoubleList();
//        doubleList.addNode(hero1);
//        doubleList.addNode(hero2);
//        doubleList.addNode(hero3);
//        doubleList.addNode(hero4);
//
//        doubleList.list();

        //第二种添加方式
        doubleList.add2(hero4);
        doubleList.add2(hero2);
        doubleList.add2(hero1);
        doubleList.add2(hero3);
        System.out.println("第二种顺序添加");
        doubleList.list();

        //修改
        HeroNode2 newnode = new HeroNode2(4, "公孙胜", "入云龙");
        doubleList.update(newnode);
        System.out.println("修改后的情况");
        doubleList.list();

        //删除
        doubleList.deletenode(3);
        System.out.println("删除后的情况");
        doubleList.list();
    }
}

//创建一个双向链表的类'
class DoubleList {
    //初始化一个头结点，不存放具体数据
    private HeroNode2 head = new HeroNode2(0, " ", " ");

    //返回头结点
    public HeroNode2 getHead() {
        return head;
    }

    //遍历双向链表
    public void list() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //头结点不能动
        HeroNode2 temp = head.next;
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

    //添加结点到双向链表中
    public void addNode(HeroNode2 node) {
        //head不能动，需要一个辅助遍历
        HeroNode2 temp = head;
        //遍历链表，找到最后
        while (true) {
            if (temp.next == null)
                break;
            //如果没有找到最后，将temp后移
            temp = temp.next;
        }
        //当退出while循环时，temp就指向了链表最后
        //将最后这个结点的next指向新的结点
        //形成一个双向链表
        temp.next = node;
        node.pre = temp;
    }

    //第二种添加方式
    public void add2(HeroNode2 node) {
        //因为是单链表，找的temp要位于添加位置的前一个结点
        HeroNode2 temp = head;
        boolean flag = false;//flag标志添加的编号是否存在，默认为false
        boolean flag1=false;
        while (true) {
            if (temp.no > node.no)//找到位置
            {
                break;
            }
            if (temp.next == null) {
                flag1=true;
                break;
            }
            else if (temp.next.no == node.no)//编号存在
            {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //判断flag
        if (flag) {
            System.out.printf("准备插入的英雄的编号%d已经存在,不能加入\n", node.no);
        } else if(flag1){
            temp.next=node;
            node.pre=temp;
        }
        else {
            node.next=temp;
            temp.pre.next=node;
            node.pre=temp.pre;
            temp.pre=node;
        }
    }

    //修改数据
    public void update(HeroNode2 newnode) {
        // 判断是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的结点，根据nO编号
        //定义一个辅助变量
        HeroNode2 temp = head.next;
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
    //双向链表可以自我删除
    public void deletenode(int no) {
        //判断当前链表是否为空
        if (head.next == null) {
            System.out.println("链表尾空，不能删除");
            return;
        }
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            //若果是最后一个节点就不需要执行这句话，否则会出现空指针异常
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }

        } else {
            System.out.println("要删除的节点不存在");
        }
    }

}

//定义Hero结点
class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next;//指向下一个结点
    public HeroNode2 pre;//指向前一个结点

    //构造器
    public HeroNode2(int hNo, String hName, String hNickName) {
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
