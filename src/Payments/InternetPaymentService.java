package Payments;

public class InternetPaymentService implements Money, CreditCardPayment, PhoneNumberPayment {

    @Override
    public void payCreditCard() {
        System.out.println("Вы оплатили картой");
    }

    @Override
    public void payMoney() {
        System.out.println("Вы оплатили наличными");
    }

    @Override
    public void payPhoneNumber() {
        System.out.println("У Вас не оказалось денег на счету, курьер забрал Ваш телефон");
    }
}
