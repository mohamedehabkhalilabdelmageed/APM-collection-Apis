package TestCases;

import API.ConfirmSubTransactionApi;
import API.SettlementRefundApi;
import API.StoreSubTransactionApi;
import Configuration.Config;
import EndPoints.ConfirmSubTransaction;
import EndPoints.PaymentInit;
import EndPoints.StoreSubTransaction;
import Utilities.BaseTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SettlementTest {
    public static String referenceNumber;

    @org.testng.annotations.Test(priority = 1)
    public void testStoreTransaction(){
        StoreSubTransactionApi storeSubTransactionApi = new StoreSubTransactionApi();
        Response response = BaseTest.postWithAuth(Config.BaseUrl + Config.StoreTransaction,storeSubTransactionApi.store());
        response.then().log().all().statusCode(201);
        referenceNumber = response.jsonPath().getString("[0].referenceNumber");
    }
    @org.testng.annotations.Test(priority = 2)
    public void testConfirmStoredTransaction() throws JsonProcessingException {
        ConfirmSubTransactionApi confirmSubTransactionApi = new ConfirmSubTransactionApi();
        Response response = BaseTest.postWithAuth(Config.BaseUrl + Config.ConfirmTransaction, confirmSubTransactionApi.confirm(referenceNumber));
        response.then().log().all().statusCode(200);
    }
    /*
    @org.testng.annotations.Test(priority = 3)
    public void testSettlementCheck() throws InterruptedException {
        Thread.sleep(35000);
        Response response = BaseTest.GetWithAuth(Config.BaseUrl +Config.CheckSettlementTransaction + referenceNumber);
        response.then().log().all();
        assertEquals(200, response.getStatusCode());
    }*/
    @org.testng.annotations.Test(priority = 3)
    public void testSettlementRefund() throws InterruptedException {
        Thread.sleep(40000);
        SettlementRefundApi settlementRefundApi = new SettlementRefundApi();
        Response response = BaseTest.postWithAuth(Config.BaseUrl +Config.settlementRefund, settlementRefundApi.setRefund(referenceNumber));
        response.then().log().all();
        assertEquals(202, response.getStatusCode());
    }

}
