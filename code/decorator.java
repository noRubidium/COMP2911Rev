public interface Component {
    public void doSomething();
}

public class ConcreteComponent implements Component{
    public void doSomething();
}

public class Decorator implements Component{
    private Component component;
    
    public void doSomething();
}

public class ConcreteDecoratorExtendingState extends Decorator{
    public void doSomething();
}

public class ConcreteDecoratorExtendingFunctionality extends Decorator{
    public void doSomething(){
        super.doSomething();
        doAdditional();
    }
    private void doAdditional();
}

