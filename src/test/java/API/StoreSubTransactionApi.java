package API;

import EndPoints.PaymentInit;
import EndPoints.StoreSubTransaction;
import Utilities.Constant;
import Utilities.DataFaker;

import java.util.ArrayList;
import java.util.List;

public class StoreSubTransactionApi {
    PaymentInit payment = new PaymentInit();
    public List<StoreSubTransaction> store(){
        List<StoreSubTransaction> list = new ArrayList<>();
        StoreSubTransaction store = new StoreSubTransaction();
        store.setMainTransactionReference(payment.getReferenceNumber());
        store.setSubMerchantID(Constant.subMerchantId);
        store.setPaymentProviderID(Constant.PaymentProviderID);
        store.setReferenceNumber(DataFaker.generateRandomGUID());
        store.setAmount(Constant.Amount);
        list.add(store);
        return list;
    }


}
