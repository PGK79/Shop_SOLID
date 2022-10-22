package Places;

import Consol.ConsolSundry;
import Products.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    private String name;
    private List<Product> goods = new ArrayList();

    public Shop() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void goodsForSale(Store store) { // Только товары, которые есть на складе
        ConsolSundry.space();
        System.out.println("Для Вас в нашем магазине имеются: ");
        int num = 1;
        goods = store.getGeneralListGoods();
        for (Product good : goods) {
            System.out.println(num + ". " + good);
            num++;
        }
    }

    public void buy(Scanner scanner, List<Product> productList) {
        int[] numberOfProducts = new int[goods.size()];
        int[] buffer = new int[goods.size()];
        while (true) {
            System.out.println("Выберите товар и количество или введите `end`");
            String input = scanner.nextLine();
            int itog = 0;
            if ("end".equals(input) || "END".equals(input) || "утв".equals(input)) {
                System.out.println("Ваша корзина:");
                System.out.println("Наименование товара   " + "Количество   " + "  Цена/за.единицу"
                        + "    Общая стоимость");
                for (int i = 0; i < goods.size(); i++) {
                    if (buffer[i] == 0) {
                        continue;
                    }

                    System.out.printf("%-25s %-13d %d %-15s %d %s\n", productList.get(i).getName(),
                            buffer[i], productList.get(i).getPrice(), "руб/шт",
                            buffer[i] * productList.get(i).getPrice(), "руб");
                    itog += buffer[i] * productList.get(i).getPrice();
                }
                System.out.println("\n                                                      Итого "
                        + itog + " рублей");
                break;
            }
            try {
                String[] pieces = input.split(" ");
                int number = Integer.parseInt(pieces[0]) - 1;
                int count = Integer.parseInt(pieces[1]);
                numberOfProducts[number] = count;
                int buf = numberOfProducts[number];
                buffer[number] += buf;
            } catch (Exception e) {
                System.out.println("Введите два числа: Номер товара Количество товара");
                ConsolSundry.space();
                continue;

            }
        }
    }

    public String toString() {
        return "Магазин " + name;
    }
}