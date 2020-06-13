package StatePattern.States;

public class StateOne extends State {

    @Override
    public void functionOne() {
        System.out.println(this.getClass() + " :functionOne()");
    }
}
