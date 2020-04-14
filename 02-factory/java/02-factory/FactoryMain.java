public class FactoryMain {
    public static void main(String[] args) {
        CoffeeFactory coffeeFacotry = null;
        coffeeFacotry = new ChinaCoffeeFactory();
        System.out.println("ChinaCoffeeFactory" );
        for(Coffee coffee: coffeeFacotry.createCoffee() ) {
            System.out.println(coffee.getName() );
        }
        
        coffeeFacotry = new AmericaCoffeeFactory();
        System.out.println("AmericaCoffeeFactory" );
        for(Coffee coffee: coffeeFacotry.createCoffee() ) {
            System.out.println(coffee.getName() );
        }
    }
}
