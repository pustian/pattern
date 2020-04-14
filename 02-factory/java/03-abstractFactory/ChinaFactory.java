public class ChinaFactory extends AbstractDrinkFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Latte(), new Cappuccino()};
    }

    @Override
    public Juice[] createJuice() {
        return new Juice[]{new AppleJuice(), new OrangeJuice()};
    }
}
