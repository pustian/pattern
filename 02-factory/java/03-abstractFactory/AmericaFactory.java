public class AmericaFactory extends AbstractDrinkFactory {
    @Override
    public Coffee[] createCoffee() {
        return new Coffee[]{new Americano()};
    }

    @Override
    public Juice[] createJuice() {
        return new Juice[]{new PeachJuice()};
    }
}
