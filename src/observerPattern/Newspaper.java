package observerPattern;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Newspaper {
    private String name;
    private Date publishDate;
    private final List<Observer> observers = new ArrayList<>();

    public Newspaper(String name) {
        this.name = name;
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

    public void publishNewspaper(){
        publishDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String message = name + " gazetesinin " + formatter.format(publishDate) + ". tarihli basımı yayımlandı. Okumak için tıklayınız: *Link.";
        notifyObservers(message);
    }
}
