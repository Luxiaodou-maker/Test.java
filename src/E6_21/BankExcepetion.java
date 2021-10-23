package E6_21;

public class BankExcepetion extends Exception{
    String message="输入数据不合规定";
    public String warnMess(){
        return message;
    }
}
