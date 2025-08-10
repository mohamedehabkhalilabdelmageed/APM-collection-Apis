package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({
        "subTransactionsReferenceNumbers"
})
public class ConfirmSubTransaction {
    @JsonProperty
    private List<String> subTransactionsReferenceNumbers;

    public List<String>  getSubTransactionsReferenceNumbers() {
        return subTransactionsReferenceNumbers;
    }

    public void setSubTransactionsReferenceNumbers(List<String>  subTransactionsReferenceNumbers) {
        this.subTransactionsReferenceNumbers = subTransactionsReferenceNumbers;
    }
}
