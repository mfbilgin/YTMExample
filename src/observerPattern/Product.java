package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private int stockAmount = 0;
    public Product(String name) {
        this.name = name;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    String name;
    private final List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String message){
        for(Observer observer : observers){
            observer.update(message);
        }
    }

    public void updateStock(int stockAmount){
        setStockAmount(stockAmount);
        String message = name + " is now in stock (" + getStockAmount() + ")";
        notifyObservers(message);
    }

}
