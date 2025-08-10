package API;

import EndPoints.PaymentInit;
import EndPoints.PaymentRefund;
import Utilities.Constant;
import Utilities.DataFaker;

public class PaymentRefundApi {
    PaymentInit payment = new PaymentInit();
    public PaymentRefund refund (){
        PaymentRefund refund = new PaymentRefund();
        refund.setOriginalTransactionReference(payment.getReferenceNumber());
        refund.setAmount(Constant.Amount);
        refund.setTransactionReference(DataFaker.generateRandomGUID());
        return refund;
    }
}
