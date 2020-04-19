public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }
    @Override
    public void execute() {
        receiver.bakeChickenWing();
    }

    public String toString() {
        return "bakeChickenWingCommand";
    }
}
