package 数据结构;

import java.util.Scanner;

public class CircleArrayQue {
    public static void main(String[] args) {
        //创建一个环形队列
        CircleArray circleArray= new CircleArray (4);
        char key=' ';
        Scanner scanner=new Scanner(System.in);
        boolean loop=true;
        //输出菜单
        while (loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出队列");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列的头数据");
            key=scanner.next().charAt(0);//接受一个字符
            switch (key){
                case 's':
                   circleArray.showQue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value=scanner.nextInt();
                    circleArray.addQue(value);
                    break;
                case 'g':
                    try {
                        int res=circleArray.getQue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 'h':
                    try {
                        int res=circleArray.headQue();
                        System.out.printf("队列头的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:
                    break;
            }

        }
        System.out.println("程序退出");
    }
}
class CircleArray{
    private int MaxSize;//表示数组最大容量
    private int front;//队列头
    private int rear;
    private int []arr;//该数组用于存储数据
    public CircleArray(int maxSize){
        MaxSize=maxSize;
        arr=new int [MaxSize];
    }
    //判断队列是否满
    public boolean isFull(){
        return (rear+1)%MaxSize==front;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }
    //添加数据
    public void addQue(int n){
        if (isFull()){
            System.out.println("队列满了，不能添加数据");
            return;
        }
        arr[rear]=n;
        rear=(rear+1)%MaxSize;
    }
    //获取队列数据
    public int getQue(){
        //判断队列是否为空
        if(isEmpty()){
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }
        int value=arr[front];
        front=(front+1)%MaxSize;
        return value;
}
    //显示队列所有数据
    public  void showQue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        //从front开始遍历
        for (int i = front; i <front+size() ; i++) {
            System.out.printf("arr[%d]=%d\n",i%MaxSize,arr[i%MaxSize]);
        }
    }
    //求出当前队列有效数据
    public int size(){
        return (rear+MaxSize-front)%MaxSize;
    }
    //显示队列的头数据
    public  int headQue(){
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        return arr[front];
    }

    public void setMaxSize(int maxSize) {
        MaxSize = maxSize;
    }
}
