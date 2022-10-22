import Consol.ConsolDelivery;
import Consol.ConsolPayment;
import Consol.ConsolSundry;
import Places.Shop;
import Places.Store;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Shop shop = new Shop();
        shop.setName("1000 мелочей для дома");

        Scanner scanner = new Scanner(System.in);

        ConsolSundry.greetings(shop, scanner, store);
        ConsolSundry.space();
        ConsolPayment.PaymentMethod(scanner);
        ConsolSundry.space();
        ConsolDelivery.deliveryDecision(scanner, shop, store);

        scanner.close();
    }
}