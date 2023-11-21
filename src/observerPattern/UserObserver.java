package observerPattern;

public class UserObserver implements Observer
{
    private final String email;

    public UserObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println(message + " message sent to " + email);
    }
}
