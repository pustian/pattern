public class ChinaCoffeeFactory extends CoffeeFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Latte(), new Cappuccino()};
    }
}
