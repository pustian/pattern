public class Memento {
    private String state;
    // 创建一个新的备忘录对象 
    public Memento(String state) {
        this.state = state;
    }
    // 发起者的状态恢复到备忘录状态
    public String getState() {
        return state;
    }
}
