package Consol;

import Delivery.*;
import Places.Shop;
import Places.Store;

import java.util.Scanner;

public class ConsolDelivery {
    public static void deliveryDecision(Scanner scanner, Shop shop, Store store) {
        System.out.println("Желаете заказать доставку");
        System.out.println("1. Да, доставьте товар - введите Да или 1");
        System.out.println("2. Нет, оставьте товар себе - введите Нет или 2");
        System.out.println("3. Вернуться в главное меню - введите Меню или 3");

        String inputText = scanner.nextLine();
        if (inputText.equals("Да") || (inputText.equals("да") || inputText.equals("1"))) {
            howDelivery(scanner);
        } else if (inputText.equals("Нет") || (inputText.equals("нет") || inputText.equals("2"))) {
            ConsolSundry.exit();
        } else if (inputText.equals("Меню") || (inputText.equals("меню") || inputText.equals("3"))) {
            ConsolSundry.greetings(shop, scanner, store);
        } else {
            System.out.println("Введено не корректное значение");
            ConsolSundry.space();
            deliveryDecision(scanner, shop, store);
        }
    }

    public static void howDelivery(Scanner scanner) {
        System.out.println("Доставить курьером (Введите 1) или требуется автодоставка(Введите 2)");
        String inputText = scanner.nextLine();
        if (inputText.equals("1")) {
            Delivery devCourier = new CourierDelivery();
            devCourier.delivery();
        } else if (inputText.equals("2")) {
            Delivery devAuto = new AutoDelivery();
            devAuto.delivery();
        } else {
            System.out.println("Введено не корректное значение");
            ConsolSundry.space();
            howDelivery(scanner);
        }
    }
}
