package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    private final List<Observer> observers = new ArrayList<>();
    private int stockAmount;
    public Product(String name, int stockAmount) {
        this.name = name;
        this.stockAmount = stockAmount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }



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
