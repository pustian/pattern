import java.util.HashMap;
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int intercepter(HashMap<String, Integer> var) {
        return super.left.intercepter(var) + super.right.intercepter(var);
    }
}
