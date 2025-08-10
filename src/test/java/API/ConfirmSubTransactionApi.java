package API;

import EndPoints.ConfirmSubTransaction;
import EndPoints.StoreSubTransaction;
import Utilities.DataFaker;

import java.util.Collections;

public class ConfirmSubTransactionApi {
    public ConfirmSubTransaction confirm(String referenceNumber){
        ConfirmSubTransaction confirm = new ConfirmSubTransaction();
       // confirm.setSubTransactionsReferenceNumbers(store.getReferenceNumber());
        confirm.setSubTransactionsReferenceNumbers(
                Collections.singletonList(referenceNumber)
        );
        return confirm;
    }
}
