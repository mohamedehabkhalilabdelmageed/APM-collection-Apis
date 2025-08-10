package Configuration;

public class Config {
   public static final String BaseUrl = "http://213.136.70.104:80";
   public static final String GenerateMerchantToken = "/auth/token";
   public static final String PaymentInit = "/payment/init";
   public static final String PaymentCheck = "/payment/check/";
   public static final String PaymentRefund = "/payment/refund";
   public static final String StoreTransaction = "/api/v1/settlement/preparation";
   public static final String ConfirmTransaction = "/api/v1/settlement/execution";
   public static final String CheckSettlementTransaction = "/api/v1/settlement/check/";
   public static final String settlementRefund = "/api/v1/settlement/refund";

}