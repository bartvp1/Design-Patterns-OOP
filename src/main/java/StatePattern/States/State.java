package StatePattern.States;
interface StateInterface {
    void genericMethod();
}
public abstract class State implements StateInterface {
    final String INVALID_ACTION = "Invalid action";

    public void genericMethod(){
        System.out.println(this.getClass());
    }

    public void functionOne() {
        System.out.println(INVALID_ACTION);
    }

    public void functionTwo() {
        System.out.println(INVALID_ACTION);
    }

    public void functionThree() {
        System.out.println(INVALID_ACTION);
    }
}
