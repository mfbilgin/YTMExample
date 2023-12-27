package observerPattern;

public class Main {
    public static void main(String[] args) {
        Magazine magazine = new Magazine("ABC",0);
        Magazine magazine2 = new Magazine("DEF",0);


        Newspaper newspaper = new Newspaper("GHI");

        Customer customer = new Customer("user@domain.com");
        Customer customer2 = new Customer("user2@domain.com");

        // Attach customers to magazines
        magazine.attach(customer);
        magazine.attach(customer2);
        magazine2.attach(customer);
        System.out.println("--------------------");
        // Publish new issues
        magazine.publishNewIssue();
        magazine2.publishNewIssue();
      // Detach customers from magazines
        magazine.detach(customer);

        // Publish new issues
        magazine.publishNewIssue();


        // Attach customers to newspaper
        newspaper.attach(customer);
        newspaper.attach(customer2);

        // Publish new newspaper
        newspaper.publishNewspaper();

        // Detach customers from newspaper
        newspaper.detach(customer);
        // Publish new newspaper
        newspaper.publishNewspaper();
    }
}
