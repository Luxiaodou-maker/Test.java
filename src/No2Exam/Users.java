package No2Exam;

public class Users {
    private String name;
    private String key;
    public Users(){

    }
    public  Users(String name){//构造函数得到用户姓名
        this.name=name;
    }

    public String getName() {//输出名字
        return name;
    }

    public void setKey(String key){//用户输入口令
        this.key=key;
    }
    public String getKey() {//输出口令
        return key;
    }
    public void upDate(String name){//更新名字
        this.name=name;
    }
}
