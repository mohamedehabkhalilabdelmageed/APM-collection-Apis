package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({
        "SubTransactionReferenceNumber",
        "amount"
})
public class SubTransactionRefund {
        @JsonProperty("SubTransactionReferenceNumber")
        private String subTransactionReferenceNumber ;
        @JsonProperty("amount")
        private double amount ;
        public SubTransactionRefund (String reference, double amount) {
            this.subTransactionReferenceNumber = reference;
            this.amount = amount;
        }

        public String getSubTransactionReferenceNumber() {
            return subTransactionReferenceNumber;
        }

        public void setSubTransactionReferenceNumber(String subTransactionReferenceNumber) {
            this.subTransactionReferenceNumber = subTransactionReferenceNumber;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

    }

