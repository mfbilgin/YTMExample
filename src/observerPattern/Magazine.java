package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private final String name;
    private int issue;
    private final List<Observer> observers = new ArrayList<>();

    public Magazine(String name, int issue) {
        this.name = name;
        this.issue = issue;
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

    public void publishNewIssue(){
        issue++;
        String message = name + " dergisinin " + issue + ". sayısı yayımlandı. Okumak için tıklayınız: *Link.";
        notifyObservers(message);
    }
}
