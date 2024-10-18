package src;
import java.util.Date;

class Payment {
    private int paymentId;
    private double amount;
    private String paymentMethod;
    private Date paymentDate;

    // Constructor
    public Payment(int paymentId, double amount, String paymentMethod, Date paymentDate) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

   
    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

   
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

  
    @Override
    public String toString() {
        return "Payment ID: " + paymentId +
               "\nAmount: $" + amount +
               "\nPayment Method: " + paymentMethod +
               "\nPayment Date: " + paymentDate;
    }
}
