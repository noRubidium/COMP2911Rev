public interface Component {
    public void doOp();
}

public class Leaf implements Component{
    public void doOp();
}

public class Composite implements Component{
    private List<Component> components;
    
    public void doOp();
    
    public void addComponent(Component c);
    public void removeComponent(Component c);
    public Component getChild(int index);
}
