package API;

import EndPoints.SettlementRefund;
import EndPoints.StoreSubTransaction;
import EndPoints.SubTransactionRefund;
import Utilities.Constant;

import java.util.ArrayList;
import java.util.List;
public class SettlementRefundApi {

    public SettlementRefund setRefund(String referenceNumber) {
        SubTransactionRefund sub = new SubTransactionRefund(referenceNumber, Constant.Amount);

        List<SubTransactionRefund> subList = new ArrayList<>();
        subList.add(sub);

        return new SettlementRefund(subList);
        }
    }

