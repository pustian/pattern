public class BakeMuttonCommand extends Command {
    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }
    @Override
    public void execute() {
        receiver.bakeMutton();
    }

    public String toString() {
        return "bakeMuttonCommand";
    }
}
