package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "paymentProviderID",
        "amount",
        "currency",
        "referenceNumber",
        "userIdentifier",
        "paymentMethod",
        "userIdentifierType",
        "payerMessage",
        "payeeNotes"
})
public class PaymentInit {

    @JsonProperty("paymentProviderID")
   private int paymentProviderID ;
    @JsonProperty("amount")
    private double amount ;
    @JsonProperty("currency")
    private String currency ;
    @JsonProperty("referenceNumber")
    private static String referenceNumber ;
    @JsonProperty("userIdentifier")
    private String userIdentifier ;
    @JsonProperty("paymentMethod")
    private String paymentMethod ;

    @JsonProperty("userIdentifierType")
    private  String userIdentifierType ;
    @JsonProperty("payerMessage")
    private String payerMessage ;
    @JsonProperty("payeeNotes")
    private String PayeeNotes ;

    public int getPaymentProviderID() {
        return paymentProviderID;
    }

    public void setPaymentProviderID(int paymentProviderID) {
        this.paymentProviderID = paymentProviderID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public String getUserIdentifier() {
        return userIdentifier;
    }

    public void setUserIdentifier(String userIdentifier) {
        this.userIdentifier = userIdentifier;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getUserIdentifierType() {
        return userIdentifierType;
    }

    public void setUserIdentifierType(String userIdentifierType) {
        this.userIdentifierType = userIdentifierType;
    }

    public String getPayerMessage() {
        return payerMessage;
    }

    public void setPayerMessage(String payerMessage) {
        this.payerMessage = payerMessage;
    }

    public String getPayeeNotes() {
        return PayeeNotes;
    }

    public void setPayeeNotes(String payeeNotes) {
        PayeeNotes = payeeNotes;
    }
}
