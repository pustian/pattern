public class PrototypeTest {
    public static void main(String[] args) {
        Basketball basketball = new Basketball("LeBron James"); 
        Football football = new Football("Lionel Messi"); 
        
        SportManager manager = new SportManager(); 
        manager.register("basketball", basketball); 
        manager.register("football", football);

        Sport sportFirst = manager.create("basketball");
        Sport sportSecond = manager.create("basketball"); 
        
        Sport sportThird = manager.create("football"); 
        Sport sportForth = manager.create("football");

        sportFirst.showMessage();
        sportSecond.showMessage();
        sportThird.showMessage();
        sportForth.showMessage();
        System.out.println("sportFirst ==  sportSecond ---" + (sportFirst ==  sportSecond) );
        System.out.println("sportForth ==  sportThird  ---" + (sportForth ==  sportThird ) );

    }
}
