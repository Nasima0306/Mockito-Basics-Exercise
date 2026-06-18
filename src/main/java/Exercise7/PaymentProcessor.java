package Exercise7;

public class PaymentProcessor {

    private PaymentService paymentService;

    public PaymentProcessor(PaymentService paymentService){

        this.paymentService = paymentService;

    }

    public void makePayment(){

        paymentService.processPayment();

    }
}
