public class StrategyMain {
    public static void main(String[] args) {
        Context context = null;
        context = new Context(new OperationAdd() ) ;
        System.out.println("10+5=" + context.executeStrategy(10, 5) );
        context = new Context(new OperationSub() ) ;
        System.out.println("10-5=" + context.executeStrategy(10, 5) );
        context = new Context(new OperationMul() ) ;
        System.out.println("10*5=" + context.executeStrategy(10, 5) );

        System.out.println();

        context = new Context("+");
        System.out.println("10+5=" + context.executeStrategy(10, 5) );
        context = new Context("-");
        System.out.println("10-5=" + context.executeStrategy(10, 5) );
        context = new Context("*");
        System.out.println("10*5=" + context.executeStrategy(10, 5) );

    }
}
