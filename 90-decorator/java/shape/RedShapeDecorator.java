// ConcreteDecorator，具体装饰角色
public class RedShapeDecorator extends ShapeDecorator {
    protected RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);     
    }
     
    @Override
    public void draw() {
        System.out.println("Begin decorate with red");
        decoratedShape.draw();         
        setRedBorder(decoratedShape);
        System.out.println("decorate with red End");
    }
        
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
