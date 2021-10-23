package AA;

import java.util.ArrayList;
import java.util.Scanner;

public class System1 {


        public static void main(String[] args) {
            ArrayList<Student> array=new ArrayList<Student>();
            while(true){
                System.out.println("-----------欢迎来到学生管理系统--------------");
                System.out.println("-----      1.查看所有学生       ------------");
                System.out.println("-----      2.添加学生           ------------");
                System.out.println("-----      3.删除学生           ------------");
                System.out.println("-----      4.修改学生           ------------");
                System.out.println("-----      5.退出               ------------");
                System.out.println("--------------------------------------------");
                System.out.println("请输入你的选择：");
                Scanner sc=new Scanner(System.in);
                String choice=sc.nextLine();
                switch (choice){
                    case "1":
                        //查看所有学生
                        findAllstudent(array);
                        System.out.println();
                        break;
                    case "2":
                        //添加学生
                        addStudent(array);
                        System.out.println();
                        break;
                    case "3":
                        //删除学生
                        deleteStudent(array);
                        System.out.println();
                        break;
                    case "4":
                        //修改学生
                        updateStudent(array);
                        System.out.println();
                        break;
                    case "5":

                    default:
                        System.out.println("                                感谢使用");
                        System.exit(0);
                        break;
                }
            }
        }
        //查找所有学生
        public static void findAllstudent(ArrayList<Student>array){
            if(array.size()==0){
                System.out.println("无学生信息，请重新选择");
                return;
            }
            System.out.println();
            System.out.println("学号\t\t\t\t姓名\t\t\t\t年龄\t\t\t\t成绩");
            System.out.println("------------------------------------------------");
            for (int i = 0; i <array.size() ; i++) {
                Student s=array.get(i);
                System.out.println(s.getId()+"\t\t\t\t"+s.getName()+"\t\t\t\t"+s.getAge()+"\t\t\t\t"+s.getResult());
            }
            System.out.println("------------------------------------------------------------------------------------");
        }
        //添加学生
        public static void addStudent(ArrayList<Student>array){
            Scanner in=new Scanner(System.in);
            String id="";
            while (true){
                System.out.println("输入学号");
                id=in.nextLine();
                boolean flag=false;
                for (int i = 0; i <array.size(); i++) {
                    Student s=array.get(i);
                    if(id.equals(s.getId())){
                        flag=true;
                        break;
                    }
                }
                if(flag){
                    System.out.println("学号被占用，请重新输入");
                }
                else{
                    break;//跳出while
                }

            }
            System.out.print("输入姓名：");
            String name=in.nextLine();
            System.out.print("输入年龄：");
            String age=in.nextLine();
            System.out.print("输入成绩：");
            String result=in.nextLine();
            Student s=new Student(id,name,age,result);
            array.add(s);
            System.out.println("添加学生成功");
        }
        //删除学生
        public static void deleteStudent(ArrayList<Student>array){
            //根据学号删除
            Scanner in=new Scanner(System.in);
            System.out.println("输入要删除的学生的学号");
            String id=in.nextLine();
            int index=-1;
            for (int i = 0; i <array.size() ; i++) {
                Student s=array.get(i);
                if(id.equals(s.getId())){
                    index=i;
                    break;
                }
                if(index==-1){
                    System.out.println("该学生信息不存在，是否继续当前操作（Yes or No");
                    String choice=in.nextLine();
                    if(choice.equalsIgnoreCase("Yes")){
                        deleteStudent(array);
                    }else if(choice.equalsIgnoreCase("No")){
                        return;
                    }
                    else
                    {
                        array.remove(index);
                        System.out.println("删除学生成功");
                    }
                }
            }
        }
        public static void  updateStudent(ArrayList<Student>array){
            //输入学号看学生是否操作存在
            Scanner in= new Scanner(System.in);
            System.out.println("输入需要更新信息学生的学号：");
            String id=in.nextLine();
            int index=-1;
            for (int i = 0; i <array.size() ; i++) {
                Student s=array.get(i);
                if(id.equals(s.getId())){
                    index=i;
                    break;
                }
            }
            if(index==-1){
                System.out.println("该学生信息不存在，是否继续当前操作（Yes or No");
                String choice=in.nextLine();
                if(choice.equalsIgnoreCase("Yes")){
                    updateStudent(array);
                }
                else if(choice.equalsIgnoreCase("No")){
                    return;
                }
                else
                {
                    System.out.println("输入信息有误，返回主界面");
                }
            }
            else{
                Student s=array.get(index);
                boolean flag=true;
                System.out.println("----选择更新学生信息选项");
                System.out.println("----      1.姓名    --");
                System.out.println("----      2.年龄    --");
                System.out.println("----      3.成绩    --");
                System.out.println("----      4.返回主界面  --");
                while (flag){
                    System.out.println("请输入你的选择：");
                    Scanner sc=new Scanner(System.in);
                    String choice=sc.nextLine();
                    switch (choice){
                        case "1":
                            System.out.println("请修改姓名：");
                            String name=in.nextLine();
                        case "2":
                            System.out.println("请输入修改年龄：");
                            String age=sc.nextLine();
                            System.out.println("继续更新操作（Yes or No)");
                            String b=in.nextLine();
                            if(b.equalsIgnoreCase("Yes")){
                                break;
                            }
                            else if(b.equalsIgnoreCase("No")){
                                array.set(index,s);
                                System.out.println("更新操作完成，返回主界面");
                                return;
                            }
                            else {
                                System.out.println("输入信息有误，返回主界面");
                                return;
                            }
                        case "3":
                            System.out.println("请输入修改成绩：");
                            String result=sc.nextLine();
                            System.out.println("继续更新操作（Yes or No)");
                            String c=in.nextLine();
                            if(c.equalsIgnoreCase("Yes")){
                                break;
                            }
                            else if(c.equalsIgnoreCase("No")){
                                array.set(index,s);
                                System.out.println("更新操作完成，返回主界面");
                                return;
                            }
                            else {
                                System.out.println("输入信息有误，返回主界面");
                                return;
                            }
                        case "4":
                            array.set(index,s);
                            System.out.println("修改信息完成");
                            return;
                        default:
                            System.out.println("输入信息有误，返回主界面");
                            return;
                    }
                }
            }
        }
    }


