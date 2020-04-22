// Decorator，装饰角色
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
     
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
        
    @Override
    public void draw() {
        System.out.println("Begin decorate");
        decoratedShape.draw();
        System.out.println("decorate End");
    }
}
