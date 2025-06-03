public class Reservation {
    private int arriveDate;
    private int customizedPrice;
    private String status;

    public Reservation(int arriveDate, int customizedPrice, String status) {
        this.arriveDate = arriveDate;
        this.customizedPrice = customizedPrice;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Arrive Date: " + arriveDate + ", Price: " + customizedPrice + ", Status: " + status;
    }
}
