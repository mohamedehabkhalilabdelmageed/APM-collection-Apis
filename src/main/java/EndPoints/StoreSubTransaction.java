package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({
        "MainTransactionReferenceNumber",
        "subMerchantID",
        "paymentProviderID",
        "referenceNumber",
        "amount"
})

public class StoreSubTransaction {
 @JsonProperty("MainTransactionReferenceNumber")
    private String mainTransactionReference;
 @JsonProperty("subMerchantID")
    private int subMerchantID;
 @JsonProperty("paymentProviderID")
    private int paymentProviderID;
 @JsonProperty("referenceNumber")
    private String referenceNumber;
 @JsonProperty("amount")
    private double amount;

    public String getMainTransactionReference() {
        return mainTransactionReference;
    }

    public void setMainTransactionReference(String mainTransactionReference) {
        this.mainTransactionReference = mainTransactionReference;
    }

    public int getSubMerchantID() {
        return subMerchantID;
    }

    public void setSubMerchantID(int subMerchantID) {
        this.subMerchantID = subMerchantID;
    }

    public int getPaymentProviderID() {
        return paymentProviderID;
    }

    public void setPaymentProviderID(int paymentProviderID) {
        this.paymentProviderID = paymentProviderID;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
