package Consol;

import Adviser.Adviser;
import Adviser.ProductAdviser;
import Places.Shop;
import Places.Store;
import Products.Product;
import java.util.List;
import java.util.Scanner;

public class ConsolSundry {
    public static void greetings(Shop shop, Scanner scanner, Store store) {
        System.out.println("\nДобро пожаловать в наш магазин " + shop.getName());
        System.out.println("Если Вы покупатель введите 1");
        System.out.println("Если Вы сотрудник введите 2");
        System.out.println("Если нужен совет введите 3");
        List<Product> productList = store.getGeneralListGoods();
        String inputText = scanner.nextLine();
        if (inputText.equals("1") || inputText.equals("2") || inputText.equals("3")) {
            switch (inputText) {
                case "1":
                    shop.goodsForSale(store);
                    space();
                    shop.buy(scanner, productList);
                    break;
                case "2":
                    ConsolEmployee.employee(scanner, store, shop);
                    break;
                case "3":
                    Adviser adviser = new ProductAdviser();
                    adviser.advise("Совет:\nСкупайте все.");
                    shop.goodsForSale(store);
                    space();
                    shop.buy(scanner, productList);
                    break;
            }
        } else {
            System.out.println("Не корректное число\n");
            greetings(shop, scanner, store);
        }
    }

    public static void exit() {
        ConsolSundry.space();
        System.out.println("Экипаж прощается с Вами. Счастливого полета.");
    }

    public static void space() {
        System.out.println("");
    }
}

