package Consol;

import Places.Shop;
import Places.Store;

import java.util.Scanner;

public class ConsolEmployee {
    public static void employee(Scanner scanner, Store store, Shop shop) {
        System.out.println("Выберите действие");
        System.out.println("1. Посмотреть перечень товаров на складе - введите Посмотреть или 1");
        System.out.println("2. Добавить товар на склад - введите Добавить или 2");
        System.out.println("3. Вернуться в главное меню - введите Меню или 3");

        String inputText = scanner.nextLine();
        if (inputText.equals("Посмотреть") || (inputText.equals("посмотреть") || inputText.equals("1"))) {
            store.goodsInStock();
            ConsolSundry.space();
            employee(scanner, store, shop);
        } else if (inputText.equals("Добавить") || (inputText.equals("добавить") || inputText.equals("2"))) {
            addingProduct(scanner, store);
            ConsolSundry.space();
            employee(scanner, store, shop);
        } else if (inputText.equals("Меню") || (inputText.equals("меню") || inputText.equals("3"))) {
            ConsolSundry.greetings(shop, scanner, store);
        } else {
            System.out.println("Введено не корректное значение");
            ConsolSundry.space();
            employee(scanner, store, shop);
        }
    }

    public static void addingProduct(Scanner scanner, Store store) {
        System.out.println("Введите название товара");
        String goodName = scanner.nextLine();

        System.out.println("Введите цену товара");
        String goodPrice = scanner.nextLine();
        int goodPriceNum = 0;
        try {
            goodPriceNum = Integer.parseInt(goodPrice);
        } catch (Exception e) {
            System.out.println("Не корректное число");
        }

        System.out.println("Введите производителя товара");
        String goodManufacturer = scanner.nextLine();

        store.setGeneralListGoods(goodName, goodPriceNum, goodManufacturer);
    }
}
