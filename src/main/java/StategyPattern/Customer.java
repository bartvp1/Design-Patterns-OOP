package StategyPattern;

import StategyPattern.Strategies.Strategy;

public class Customer {

    Strategy strategy;

    public void setStrategy(Strategy s){
        strategy = s;
    }

    public void pay(){
        strategy.pay();
    }
}
