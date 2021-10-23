package 数据结构;

public class Queen8 {
    //定义皇后数量
    int max = 8;
    //定义数组array存放结果
    int[] array = new int[max];
   static int counts=0;

    public static void main(String[] args) {
              Queen8 queen8=new Queen8();
              queen8.check(0);
        System.out.println("一共有"+counts+"种方法");

    }

    //编写一个方法，放置第n个皇后
    private void check(int n) {
        if (n == max) {
            counts++;
            print();
            return;

        }
        for (int i = 0; i < max; i++) {
            array[n]=i;
            //判断第n个皇后到第i列是否冲突
            if (judge(n)) {
                check(n + 1);
            }
            //如果冲突，继续放到下一列

        }
    }

    //判断是否冲突
    private boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {//判断第n个皇后是否和前面n-个皇后是否在同一列同一斜线
                return false;
            }
        }
        return true;
    }

    //定义一个方法，输出皇后位置
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
