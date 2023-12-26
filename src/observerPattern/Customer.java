package observerPattern;

public class Customer implements Observer
{
    private final String email;

    public Customer(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Mail " + email +" adresine gönderildi" + ": " + message + "\n");
    }
}
