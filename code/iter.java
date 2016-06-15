public class ConcreteAggregate{
    Iterator createIterator(){
        return new ConcreteIterator(this);
    }
}

public class ConcreteIterator{
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}

public class Iterator{
    public Object first();
    public Object next();
    public boolean isDone();
    public Object currentItem();
}
