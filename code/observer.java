public class Observable {
    private List<Observer> observers;
    
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notify(){
        for(Observer o: observers){
            o.update();
        }
    }
}

public class ConcreteObservable {
    private State state;
    
    public State getState();
    public void setState(State state);    
}

public class Observer {
    public void update();
}

public class ConcreteObservable extends Observer{
    private State observerState;
    
    public void update(){
        observerState = observable.getState();
        ...
    }
}
