public class ChargeHo {
    private int date;
    private int units;
    private int quantity;

    public ChargeHo(int date, int units, int quantity) {
        this.date = date;
        this.units = units;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Units: " + units + ", Quantity: " + quantity;
    }
}
