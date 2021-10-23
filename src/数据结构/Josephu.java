package 数据结构;

public class Josephu {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.add(5);//加入5个
        circleSingleLinkedList.show();
        circleSingleLinkedList.count(1,2,5);
    }
}

//创建环形单向链表
class CircleSingleLinkedList {
    //创建一个first结点
    private Person first = new Person(-1);

    //添加
    public void add(int nums) {
        //判断
        if (nums < 1) {
            System.out.println("输入的值不正确");
            return;
        }
        Person curperson = null;
        for (int i = 1; i <= nums; i++) {
            //根据编号，创建节点
            Person person = new Person(i);
            if (i == 1) {
                first = person;
                first.setNext(first);//构成环状
                curperson = first;
            } else {
                curperson.setNext(person);
                person.setNext(first);
                curperson = person;
            }
        }

    }

    //遍历
    public void show() {
        if (first == null) {
            System.out.println("链表为空");
            return;
        }
        Person curPerson = first;
        while (true) {
            System.out.printf("小孩的编号%d\n", curPerson.getNo());
            if (curPerson.getNext() == first) {//遍历
                break;
            }
            curPerson = curPerson.getNext();
        }
    }

    //根据用户的输入，计算小孩出圈数据
//    startNo表示从第几个小孩开始数，countnum表示数几下,nums表示有多少个小孩在圈中
    public void count(int startNo, int countNum, int nums) {
        //先对数据进行校验
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("数据输入有误，请重新输入");
            return;
        }
        //创建建一个辅助指针
        Person helper = first;
        //指向环形链表的最后一个结点
        while (true) {
            if (helper.getNext() == first) {//指向了最后一个
                break;
            }
            helper = helper.getNext();
        }
        //小孩报数前，先让first和helper移动k-1次
        for (int j = 0; j <startNo-1 ; j++) {
            first=first.getNext();
            helper=helper.getNext();
        }
        //小孩报数时,first和helper同时移动m次
        while (true){
            if(helper==first){//说明值有一个结点
                break;
            }
            for (int j = 0; j <countNum-1 ; j++) {
                first=first.getNext();
                helper=helper.getNext();
            }
            //这时first指向的结点就是出圈
            System.out.printf("小孩%d出圈\n",first.getNo());
            //让小孩出圈
            first=first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后一个小孩的编号是%d",first.getNo());
    }
}

//创建Person类,表示一个节点
class Person {
    private int no;//编号
    private Person next;//指向下一个结点

    public Person(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNext(Person next) {
        this.next = next;
    }

    public Person getNext() {
        return next;
    }


}
