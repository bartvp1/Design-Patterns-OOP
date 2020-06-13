package StategyPattern.Strategies;

public class StrategyCash implements Strategy{
    @Override
    public void pay() {
        System.out.println("Paying with cash");
    }

}
