public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        ShapeDecorator shapeDecorator = new RedShapeDecorator(circle);
        shapeDecorator.draw();

        shapeDecorator = new RedShapeDecorator(new Rectangle() );
    }
}
