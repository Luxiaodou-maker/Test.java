package test;
//包裹类型  .操作
public class Pacal {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('1'));
        String name="Hellola",str1="name",str2=" ";
        char a[]={'a','b','l'};
        System.out.println(name.length());//字符串的长度和数组的长度不同，数组运用.length，字符串用length()
        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(a.length);
        //访问字符串里的字符
        System.out.println(name.charAt(1));
        //字符串不可以用for each循环 数组可以可以枚举的可用
        for (char k:a) //数组用了for each循环
        {
            System.out.println(k);
        }
        String s1="0123A56389汉字";
        System.out.println(s1.substring(2));//得到子串 23456789汉字
        System.out.println(s1.substring(2,4));// 23  到4之前
        System.out.println(s1.indexOf('3'));
        System.out.println(s1.indexOf("A56"));
        //所有对字符串的操作都不会改变原本的字符串，
        String s2="abcd";
        s2.toUpperCase();
        System.out.println(s2);//abcd
        String s3=s2.toUpperCase();//创造一个新的字符串，这才是正确使用方法
        System.out.println(s3);
    }
}
