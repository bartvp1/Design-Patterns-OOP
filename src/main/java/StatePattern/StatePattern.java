package StatePattern;

import StatePattern.States.*;

public class StatePattern {

    public static void main(String[] args){
        State s = new StateOne();
        s.genericMethod();
        s.functionOne();
        s.functionTwo();
        s.functionThree();

        System.out.println("--");

        s = new StateTwo();
        s.genericMethod();
        s.functionOne();
        s.functionTwo();
        s.functionThree();
    }
}
