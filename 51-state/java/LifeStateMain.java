public class LifeStateMain {
    public static void main(String[] args) {
        Context context = new Context();
        // curr close
        context.setLifeState(new CloseState() );
        System.out.println("\ncurr close,  close --> open --> close -->open ");
        /// close --> open --> close -->open
        context.open();
        context.close();
        context.open();
        /// curr open
        /// open --> close -->run
        System.out.println("\ncurr open,  open --> close -->run");
        context.close();
        context.run();

        /// curr run
        /// run --> stop  --> run
        System.out.println("\ncurr run,  run --> stop  --> run");
        context.stop();
        context.run();

        /// curr run
        /// run --> stop  --> open
        System.out.println("\ncurr run,  run --> stop  --> open");
        context.stop();
        context.open();
    }
}
