package StategyPattern.Strategies;

public interface Strategy {
    void pay();

    static Strategy StrategyCard() {
        return new StrategyCard();
    }

    static Strategy StrategyCash() {
        return new StrategyCash();
    }
}
