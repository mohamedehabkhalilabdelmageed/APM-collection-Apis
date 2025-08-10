package EndPoints;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SettlementRefund {
    @JsonProperty("SubTransactions")
    private List<SubTransactionRefund> subTransactions;

    public SettlementRefund(List<SubTransactionRefund> subTransactions) {
        this.subTransactions = subTransactions;
    }

    public List<SubTransactionRefund> getSubTransactions() {
        return subTransactions;
    }

    public void setSubTransactions(List<SubTransactionRefund> subTransactions) {
        this.subTransactions = subTransactions;
    }
}
