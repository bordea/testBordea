package Enum;

class BillingAccount{
    enum PaymentTypes {
        PREPAID, POSTPAID, NEW
    }
    private String billingNumber;
    private String paymentType;
    public BillingAccount() {
        billingNumber = "1";
        paymentType = PaymentTypes.POSTPAID.toString();
    }

    public static class EnumThree {
        public static void main(String[] args) {
            System.out.println(new BillingAccount());
            System.out.println(BillingAccount.PaymentTypes.NEW);     // asa se acceseaza pentru private
        }
    }

    public String toString() {
        return "paymentType= " + paymentType;

    }
}


