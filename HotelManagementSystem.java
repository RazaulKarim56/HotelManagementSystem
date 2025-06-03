import java.util.*;

public class HotelManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<CustomerHo> customers = new ArrayList<>();
        List<Reservation> reservations = new ArrayList<>();
        List<Room> rooms = new ArrayList<>();
        List<PaymentHo> payments = new ArrayList<>();
        List<ChargeHo> charges = new ArrayList<>();
        List<Services> services = new ArrayList<>();

        System.out.print("Enter number of customers: ");
        int c = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < c; i++) {
            System.out.println("Customer " + (i+1));
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Email: "); String email = sc.nextLine();
            System.out.print("Discount: "); float discount = sc.nextFloat(); sc.nextLine();
            customers.add(new CustomerHo(id, name, email, discount));
        }

        System.out.print("\nEnter number of reservations: ");
        int r = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < r; i++) {
            System.out.println("Reservation " + (i+1));
            System.out.print("Arrive Date: "); int date = sc.nextInt(); sc.nextLine();
            System.out.print("Price: "); int price = sc.nextInt(); sc.nextLine();
            System.out.print("Status: "); String status = sc.nextLine();
            reservations.add(new Reservation(date, price, status));
        }

        System.out.print("\nEnter number of rooms: ");
        int rm = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < rm; i++) {
            System.out.println("Room " + (i+1));
            System.out.print("Room No: "); int roomNo = sc.nextInt();
            System.out.print("Floor: "); int floor = sc.nextInt();
            System.out.print("Capacity: "); int cap = sc.nextInt(); sc.nextLine();
            rooms.add(new Room(roomNo, floor, cap));
        }

        System.out.print("\nEnter number of payments: ");
        int p = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < p; i++) {
            System.out.println("Payment " + (i+1));
            System.out.print("Type: "); String type = sc.nextLine();
            System.out.print("Description: "); String desc = sc.nextLine();
            payments.add(new PaymentHo(type, desc));
        }

        System.out.print("\nEnter number of charges: ");
        int ch = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < ch; i++) {
            System.out.println("Charge " + (i+1));
            System.out.print("Date: "); int date = sc.nextInt();
            System.out.print("Units: "); int units = sc.nextInt();
            System.out.print("Quantity: "); int qty = sc.nextInt(); sc.nextLine();
            charges.add(new ChargeHo(date, units, qty));
        }

        System.out.print("\nEnter number of services: ");
        int s = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < s; i++) {
            System.out.println("Service " + (i+1));
            System.out.print("ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("Description: "); String d = sc.nextLine();
            System.out.print("Menu: "); String menu = sc.nextLine();
            System.out.print("Unit Price: "); int up = sc.nextInt(); sc.nextLine();
            services.add(new Services(id, d, menu, up));
        }

        System.out.println("\n--- All Data ---");
        customers.forEach(System.out::println);
        reservations.forEach(System.out::println);
        rooms.forEach(System.out::println);
        payments.forEach(System.out::println);
        charges.forEach(System.out::println);
        services.forEach(System.out::println);
    }
}
