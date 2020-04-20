import java.util.HashMap;

public abstract class Expression {
    // 解析公式和数值, key是参数, value 是具体数值
    public abstract int intercepter(HashMap<String, Integer> var) ;
}
