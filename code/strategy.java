public class Context {
    private Strategy strategy;
}

public interface Strategy {
    public void behaviorInterface();
}

public class MyStrategy implements Strategy{
    public void behaviorInterface();
}
