// 具体享元类（ConcreteBook）
public class ConcreteBook implements Book {
    private String name;
    public ConcreteBook(String name) {
        this.name = name;
    }

    @Override
    public void borrow() {
        System.out.println("Borrow a book from library with name=" + name);
    }
}
