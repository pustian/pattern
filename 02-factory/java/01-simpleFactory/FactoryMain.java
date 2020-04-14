public class FactoryMain {
    public static void main(String[] args) {
        Coffee coffee = null;
        coffee = SimpleFactory.createInstance(CoffeeType.LATTE);
        System.out.println("CoffeeType.LATTE " +  coffee.getName() );
        coffee = SimpleFactory.createInstance(CoffeeType.AMERICANO);
        System.out.println("CoffeeType.AMERICANO  " + coffee.getName() );
        coffee = SimpleFactory.createInstance(CoffeeType.CAPPUCCINO);
        System.out.println("CoffeeType.CAPPUCCINO " +  coffee.getName() );
    }
}
