package StategyPattern.Strategies;

public class StrategyCard implements Strategy {
    @Override
    public void pay() {
        System.out.println("Paying with card");
    }
}
