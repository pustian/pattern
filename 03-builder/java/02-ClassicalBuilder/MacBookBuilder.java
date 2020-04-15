public class MacBookBuilder extends Builder {
    private Computer mComputer = new MacBook();
    @Override
    void buildBoard(String board) { mComputer.setBoard(board); }
     
    @Override
    void buildDisplay(String display) { mComputer.setDisplay(display); } 
             
    @Override
    void buildOS() { mComputer.setOS(); }

    @Override
    Computer build() { return mComputer; }
}
