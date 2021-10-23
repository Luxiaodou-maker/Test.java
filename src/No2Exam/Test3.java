package No2Exam;

    public class Test3 {
        public static void main(String[] args) {
            Bettery bettery1=new Bettery(100);//定义电池一
            Bettery bettery2=new Bettery(100);//定义电池二
            System.out.println("两节电池总电量"+(bettery1.energy+bettery2.energy)/2);
            FMHeadset fmHeadset=new FMHeadset();//定义耳机类
            System.out.println("现在 开始10次开机");
            for (int i = 0; i <20; i++) {//经历十次开机
                fmHeadset.open(bettery1,bettery2);
            }
            System.out.println("十次开机后的电量是："+(bettery1.energy+bettery2.energy)/2);

        }
    }
