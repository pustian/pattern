public abstract class Strategy {
    public abstract int doOperation(int num1, int num2);
    public void print() {
        System.out.println("Strategy class ===" + this.getClass() );
    }
}
