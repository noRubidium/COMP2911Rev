public class Aggregate{
    Iterator createIterator();
}
public class ConcreteAggregate extends Aggregate{
    Iterator createIterator(){
        return new ConcreteIterator(this);
    }
}

public class Iterator{
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}

public class ConcreteIterator extends Iterator{
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}
