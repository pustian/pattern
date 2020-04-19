import java.util.HashMap;
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int intercepter(HashMap<String, Integer> var) {
        return super.left.intercepter(var) - super.right.intercepter(var);
    }
}
