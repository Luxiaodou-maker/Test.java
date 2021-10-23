package AA;

public class Student {private String id;
    private String name;
    private String age;
    private String result;
    public Student(){}//构造函数
    public Student(String id,String name,String age,String result){
        this.id=id;
        this.name=name;
        this.age=age;
        this.result=result;
    }
    public String getId(){//输出ID
        return id;
    }

    public void setId(String id) {//输入ID
        this.id = id;
    }
    public String getName(){//输出名字
        return name;
    }

    public void setName(String name) {//输入名字
        this.name = name;
    }//输出名字
    public String getAge(){//输出年龄
        return age;
    }

    public void setAge(String age) {//输入年龄
        this.age = age;
    }
    public String getResult(){
        return result;
    }

    public void setResult(String result) {//输出成绩=
        this.result = result;
    }
}
