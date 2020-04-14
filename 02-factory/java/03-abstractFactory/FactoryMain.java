public class FactoryMain {
    public static void main(String[] args) {
        AbstractDrinkFactory facotry = null;
        facotry = new ChinaFactory();
        System.out.println("ChinaCoffeeFactory" );
        for(Coffee coffee: facotry.createCoffee() ) {
            System.out.println(coffee.getName() );
        }
        for(Juice juice: facotry.createJuice() ) {
            System.out.println(juice.getSource() );
        }
        
        facotry = new AmericaFactory();
        System.out.println("AmericaCoffeeFactory" );
        for(Coffee coffee: facotry.createCoffee() ) {
            System.out.println(coffee.getName() );
        }
        for(Juice juice: facotry.createJuice() ) {
            System.out.println(juice.getSource() );
        }
    }
}
