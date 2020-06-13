package ObserverPattern;

public class ObserverInstance implements Observer{
    String name;

    ObserverInstance(String name){
        this.name = name;
    }

    @Override
    public void notify(String s) {
        System.out.println(s + " notified " + name);
    }
}
