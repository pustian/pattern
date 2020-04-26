public class PhoneImpl implements Phone {
    @Override
    public void dial() {
        System.out.println("+++ phone dial +++");
    }

    @Override
    public void close() {
        System.out.println("+++ phone close +++");
    }

    @Override 
    public void charge() {
        System.out.println("+++ phone charge +++");
    }
}
