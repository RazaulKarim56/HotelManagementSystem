public class PaymentHo {
    private String paymentType;
    private String description;

    public PaymentHo(String paymentType, String description) {
        this.paymentType = paymentType;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment Type: " + paymentType + ", Description: " + description;
    }
}
