package StategyPattern;

import StategyPattern.Strategies.Strategy;

public class StrategyPattern {

    public static void main(String[] args){

        Customer c = new Customer();
        c.setStrategy(Strategy.StrategyCash());
        c.pay();

    }
}
