package CommandPattern;

import CommandPattern.Orders.*;

public class CommandPattern {

    public static void main(String[] args){

        Broker broker = new Broker();
        broker.takeOrder(new BuyStock(new Stock("AAPL",2)));
        broker.takeOrder(new SellStock(new Stock("TSLA",2)));
        broker.placeOrders();

    }
}
