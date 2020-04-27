public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
	Caretaker careTaker = new Caretaker();
	originator.setState("state #1");
	originator.setState("state #2");
	careTaker.add(originator.saveStateToMemento());
	originator.setState("state #3");
	careTaker.add(originator.saveStateToMemento());
	originator.setState("state #4");
	
	System.out.println("Current state:" + originator.getState() );
	System.out.println("Memento size " + careTaker.mementoSize() );
        originator.getStateFromMemento(careTaker.get(0));
	System.out.println("First state:" + originator.getState() );
        originator.getStateFromMemento(careTaker.get(1));
	System.out.println("Second state:" + originator.getState() );
    }
}
