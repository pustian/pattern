public class SimpleFactory {
    public static Coffee createInstance(CoffeeType coffeeType) {
        switch(coffeeType) {
            case AMERICANO:
                return new Americano();
            case CAPPUCCINO:
                return new Cappuccino();
            case LATTE:
                return new Latte();
            default:
                throw new RuntimeException("Unkown Type");
        }
    }

    // 也可以用反射

}
