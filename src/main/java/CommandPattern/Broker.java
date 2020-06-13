package CommandPattern;

import CommandPattern.Orders.*;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private final List<Order> orders;

    public Broker(){
        orders = new ArrayList<>();
    }
    public void takeOrder(Order o){
        orders.add(o);
    }

    public void placeOrders(){
        for(Order o : orders){
            o.execute();
        }
        orders.clear();
    }
}
