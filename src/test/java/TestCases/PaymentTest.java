package TestCases;

import API.PaymentApi;
import API.PaymentRefundApi;
import Configuration.Config;
import EndPoints.PaymentInit;
import Utilities.BaseTest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;
import static org.testng.AssertJUnit.assertEquals;


public class PaymentTest {
    public static String referenceNumber;
    // Store the request object
    PaymentInit paymentRequest = new PaymentInit();

    @org.testng.annotations.Test(priority = 1)
    public void testPayment() {
        PaymentApi paymentApi  = new PaymentApi();
        Response response = BaseTest.postWithAuth(Config.BaseUrl +Config.PaymentInit,paymentApi.payment());
        response.then().log().all();
        assertEquals(202, response.getStatusCode());
        // Print the reference number
        System.out.println("Reference Number Sent: " + paymentRequest.getReferenceNumber());
        // Store the reference number
        referenceNumber = paymentRequest.getReferenceNumber();
    }
    @org.testng.annotations.Test(priority = 2)
    public void testPaymentCheck() throws InterruptedException {
        Thread.sleep(25000);
        Response response = BaseTest.GetWithAuth(Config.BaseUrl +Config.PaymentCheck + referenceNumber);
        //response.then().log().all();
        assertEquals(200, response.getStatusCode());
    }
  /*  @org.testng.annotations.Test(priority = 3)
    public void testPaymentRefund(){
        PaymentRefundApi refundApi = new PaymentRefundApi();
        Response response = BaseTest.postWithAuth(Config.BaseUrl + Config.PaymentRefund,refundApi.refund());
        response.then().log().all();
        assertEquals(202, response.getStatusCode());
    }*/
}
