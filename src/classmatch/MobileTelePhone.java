package classmatch;

public class MobileTelePhone {
    SIM sim;//类型
    void setSIM(SIM crad){//sim是一个SIM对象，在这里发生组合,拥有了同一个地址，可以在这里操控SIm
        sim=crad;//sim1/sim2将操作权限给sim,下面才可以调用，在sim上操作sim1/sim2
    }//关联关系
    long lookNumber(){
        return sim.getNumber();
    }

}
