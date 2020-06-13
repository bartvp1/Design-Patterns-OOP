package StatePattern.States;

public class StateThree extends State{
    @Override
    public void functionThree() {
        System.out.println(this.getClass() + " :functionThree()");
    }
}
