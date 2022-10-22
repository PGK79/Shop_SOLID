package Consol;

import Payments.InternetPaymentService;
import Payments.TerminalPaymentService;

import java.util.Scanner;

public class ConsolPayment {
    public static void PaymentMethod(Scanner scanner) {
        System.out.println("Желаете оплатить как интернет заказ (Введите 1) или в терминале магазина(Введите 2)");
        String inputText = scanner.nextLine();
        System.out.println("Оплата будет: ");
        if (inputText.equals("1")) {
            InternetPaymentService internetPay = new InternetPaymentService();
            System.out.println("1. Картой (Введите 1)");
            System.out.println("2. Наличными (Введите 2)");
            System.out.println("3. С номера телефона (Введите 3)");

            inputText = scanner.nextLine();
            if (inputText.equals("1")) {
                internetPay.payCreditCard();
            } else if (inputText.equals("2")) {
                internetPay.payMoney();
            } else if (inputText.equals("3")) {
                internetPay.payPhoneNumber();
            } else {
                System.out.println("Введено не корректное значение");
                ConsolSundry.space();
                System.out.println("За невнимательность оплата наличными");
                internetPay.payMoney();
            }

        } else if (inputText.equals("2")) {
            TerminalPaymentService terminalPay = new TerminalPaymentService();
            System.out.println("1. Картой (Введите 1)");
            System.out.println("2. Наличными (Введите 2)");

            inputText = scanner.nextLine();
            if (inputText.equals("1")) {
                terminalPay.payCreditCard();
            } else if (inputText.equals("2")) {
                terminalPay.payMoney();
            } else {
                System.out.println("Введено не корректное значение");
                ConsolSundry.space();
                System.out.println("За невнимательность оплата наличными");
                terminalPay.payMoney();
            }
        } else {
            System.out.println("Введено не корректное значение");
            ConsolSundry.space();
            PaymentMethod(scanner);
        }
    }
}
