package No2Exam;

public class Lader {
    static double above;//定义梯形上底
    static double bottom;//定义梯形下底
    static double height;//定义梯形高
    public Lader(double above,double bottom,double height){//构造函数
        this.above=above;
        this.bottom=bottom;
        this.height=height;
    }
    public static double calculateArea(){
        return ((above+bottom)*height/2.0);
    }
}
