package 数据结构;

import java.util.Scanner;

public class ArrayQue {
    public static void main(String[] args) {
      ArrayQueue arrayQueue= new ArrayQueue(3);
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
                    arrayQueue.showQue();
                    break;
                case 'a':
                    System.out.println("输入一个数");
                    int value=scanner.nextInt();
                    arrayQueue.addQue(value);
                    break;
                case 'g':
                    try {
                        int res=arrayQueue.getQue();
                        System.out.printf("取出的数据是%d\n",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                case 'h':
                    try {
                        int res=arrayQueue.headQue();
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
class ArrayQueue{
    private int MaxSize;//表示数组最大容量
    private int front;//队列头
    private int rear;
    private int []arr;//该数组用于存储数据

    //创建队列的构造器
    public ArrayQueue(int arrMaxSize){
        MaxSize=arrMaxSize;
        arr=new int[MaxSize];
        front=-1;
        rear=-1;
    }
    //判断队列是否满
    public boolean isFull(){
        return rear==MaxSize-1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }
    //添加数据
    public void addQue(int n){
      //判断队列是否满
      if (isFull()){
            System.out.println("队列已经满了");
            return;
        }
      rear++;
      arr[rear]=n;
    }
    //获取队列数据
    public int getQue(){
        //判断队列是否为空
        if(isEmpty()){
            //通过抛出异常
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列所有数据
    public  void showQue(){
        //遍历
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }
    }
    //显示队列的头数据
    public  int headQue(){
        if(isEmpty()){
            throw new RuntimeException("队列空");
        }
        return arr[front+1];
    }

}
