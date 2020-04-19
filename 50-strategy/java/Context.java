public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
        // System.out.println(strategy.getClass());
    }

    public Context(String strategyType) {
        switch(strategyType ) {
            case "+":
                strategy = new OperationAdd();
                break;
            case "-":
                strategy = new OperationSub();
                break;
            case "*":
                strategy = new OperationMul();
                break;
            default:
                strategy = null;
                throw new RuntimeException("Strategy unknown");
        }
        // System.out.println(strategy.getClass());
    }

    public int executeStrategy(int num1, int num2) {
        System.out.println("Strategy method");
        strategy.print();
        return strategy.doOperation(num1, num2);
    }
}
