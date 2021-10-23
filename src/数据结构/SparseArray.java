package 数据结构;

public class SparseArray {
    public static void main(String[] args) {
        //创建一个原始的二维数组
        int chessAll[][]=new int[11][11];
        chessAll[1][2]=1;
        chessAll[2][3]=2;
        for (int[] row:chessAll
             ) {
            for (int data:row
                 ) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        //将二维数组转化为稀疏数组
        //先遍历数组，得到非0的数据个数
        int sum=0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                if (chessAll[i][j]!=0){
                    sum++;
                }
            }

        }
        //创建对应的稀疏数组
        int sparseArray[][]=new int[sum+1][3];
        //给稀疏数组赋值
        sparseArray[0][0]=11;
        sparseArray[0][1]=11;
        sparseArray[0][2]=sum;
        //遍历二维数组，非0值存放
        int count=0;
        for (int i = 0; i <11 ; i++) {
            for (int j = 0; j <11 ; j++) {
                if (chessAll[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=chessAll[i][j];
                }
            }

        }
        System.out.println();
        System.out.println("得到的稀疏数组是");
        for (int i = 0; i <sparseArray.length ; i++) {
            System.out.printf("%d\t%d\t%d\t",sparseArray[i][0],sparseArray[i][2],sparseArray[i][2]);
            System.out.println();
        }
        //稀疏数组还原为二维数组
        int chessArr2[][]=new int[sparseArray[0][0]][sparseArray[0][1]];
        //输出恢复后的数组
        for (int i = 1; i <sparseArray.length ; i++) {
            chessArr2[sparseArray[i][0]][sparseArray[i][1]]=sparseArray[i][2];
        }
        System.out.println("恢复后的的二维数组是：");
        System.out.println();
        for (int [] row:chessArr2
             ) {
            for (int item:row
                 ) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }

    }
}
