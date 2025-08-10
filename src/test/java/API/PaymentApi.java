package API;

import EndPoints.PaymentInit;
import Utilities.Constant;
import Utilities.DataFaker;

public class PaymentApi {
    Constant constant=new Constant();

    public PaymentInit payment () {
        PaymentInit payment = new PaymentInit();
        payment.setPaymentProviderID(Constant.PaymentProviderID);
        payment.setAmount(Constant.Amount);
        payment.setCurrency(Constant.Currency);
        payment.setReferenceNumber(DataFaker.generateRandomGUID());
        payment.setUserIdentifier(Constant.UserIdentifier);
        payment.setPaymentMethod(Constant.PaymentMethod);
        payment.setUserIdentifierType(Constant.UserIdentifierType);
        payment.setPayerMessage(Constant.PayerMessage);
        payment.setPayeeNotes(Constant.PayeeNotes);
        return payment;
    }
}
