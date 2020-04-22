// ConcreteComponent，具体构件，或者基础构件
public class Circle implements Shape {

    @Override 
    public void draw() {
        System.out.println("Shape---Circle");
    }
}
