public abstract class Command {
    protected Barbecuer receiver;
    // multi thread /private

    public Command(Barbecuer barbecuer) { 
        receiver = barbecuer; 
    }

    public abstract void execute() ;
}
