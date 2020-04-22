import java.util.*;
public class Composite extends Component {
    //首先来一个存储的集合
    private List<Component> list = new ArrayList<Component>();
    
    @Override
    public void addComposite(Component c){
        list.add(c);
    }
    @Override
    public void removeComposite(Component c){
        list.remove(c);
    }
    @Override
    public Component getComposite(int c){
        Component c1 =list.get(c);
        return c1;
    }

    @Override
    public void operation(){
        System.out.println("Operation begin");
        for(Object obj:list){
            ((Component)obj).operation();
        }
        System.out.println("Operation end");
    }
 
    
}
