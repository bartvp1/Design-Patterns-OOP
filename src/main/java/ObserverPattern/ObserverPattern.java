package ObserverPattern;

public class ObserverPattern {

    public static void main(String[] args){
        ObserverInstance piet = new ObserverInstance("piet");
        ObserverInstance klaas = new ObserverInstance("klaas");
        Observable henk = new ObservableInstance("henk");

        henk.addObserver(piet);
        henk.addObserver(klaas);
        henk.notifyObservers();
    }
}
