package Payments;

public class TerminalPaymentService implements Money, CreditCardPayment {
    @Override
    public void payCreditCard() {
        System.out.println("Вы оплатили картой");
    }

    @Override
    public void payMoney() {
        System.out.println("Вы оплатили наличными");
    }
}
