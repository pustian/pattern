public class BuilderTest {
    public static void main(String []args) {
        RobustPerson jack = new RobustPerson.Builder(1, "Jack")
            .age(18).gender("male").height(1.70).weight(65).build();
        System.out.println(jack);

        System.out.println("Jack keeps eating too much...");
        System.out.println(jack.toBuilder().weight(80).build());
    }
}
