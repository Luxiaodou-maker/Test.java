package Last;

import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String,String>envMap=System.getenv();//getenv是获取环境变量的方法,可存于Map,键值对应一个值
        for (String name:envMap.keySet()) {//遍历Map的方法
            System.out.println(name+"--->"+envMap.get(name));
        }
    }
}
