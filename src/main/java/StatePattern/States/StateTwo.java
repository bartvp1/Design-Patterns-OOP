package StatePattern.States;

public class StateTwo extends State {
    @Override
    public void functionTwo() {
        System.out.println(this.getClass() + " :functionTwo()");
    }
}
