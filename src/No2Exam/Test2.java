package No2Exam;

import java.util.Scanner;

public class Test2 {//以输入两个人的信息为例
    public static void main(String[] args) {
       String name1,name2;
       String key1,key2;
       String temp1,temp2;
        System.out.println("请输入第一个人的名字：");//输入用户名
        Scanner in=new Scanner(System.in);
        name1=in.nextLine();
        Users user1=new Users(name1);
        System.out.println("请输入您的口令");
        key1=in.nextLine();
        user1.setKey(key1);//设置口令
        System.out.println("第一个用户的信息是：");//显示用户信息
        System.out.println("用户名\t\t\t口令");
        System.out.println("----------------");
        System.out.println(user1.getName()+"\t\t\t"+user1.getKey());
        System.out.println("输入您要修改的名字：");//更改名字
        temp1=in.nextLine();
        user1.upDate(temp1);
        System.out.println("第一个用户的信息是：");//显示更换后用户信息
        System.out.println("用户名\t\t\t口令");
        System.out.println("----------------");
        System.out.println(user1.getName()+"\t\t\t"+user1.getKey());

        System.out.println("请输入第二个人的名字：");//输入用户名
        Scanner reader=new Scanner(System.in);
        name2=reader.nextLine();
        Users user2=new Users(name2);
        System.out.println("请输入您的口令");
        key2=reader.nextLine();
        user2.setKey(key2);//设置口令
        System.out.println("第一个用户的信息是：");//显示用户信息
        System.out.println("用户名\t\t\t口令");
        System.out.println("----------------");
        System.out.println(user2.getName()+"\t\t\t"+user2.getKey());
        System.out.println("输入您要修改的名字：");//更改名字
        temp2=reader.nextLine();
        user2.upDate(temp2);
        System.out.println("第二个用户的信息是：");//显示更换后用户信息
        System.out.println("用户名\t\t\t口令");
        System.out.println("----------------");
        System.out.println(user2.getName()+"\t\t\t"+user2.getKey());
    }
}
