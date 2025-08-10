package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "OriginalTransactionReference",
        "amount",
        "TransactionReference"
})
public class PaymentRefund {
    @JsonProperty("OriginalTransactionReference")
    private String originalTransactionReference ;
    @JsonProperty("amount")
    private double amount ;
    @JsonProperty("TransactionReference")
    private String transactionReference ;

    public String getOriginalTransactionReference() {
        return originalTransactionReference;
    }

    public void setOriginalTransactionReference(String originalTransactionReference) {
        this.originalTransactionReference = originalTransactionReference;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }
}

