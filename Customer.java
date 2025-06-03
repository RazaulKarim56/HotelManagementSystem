public class Customer {
    String name;
    String password;

    public void createAccount() {
        System.out.println("Customer account created.");
    }

    public void login() {
        System.out.println("Customer logged in.");
    }

    public void searchBook() {
        System.out.println("Customer searching for book...");
    }

    public void issueBook() {
        System.out.println("Book issued to customer.");
    }

    public void returnBook() {
        System.out.println("Book returned by customer.");
    }

    public void logout() {
        System.out.println("Customer logged out.");
    }
}
