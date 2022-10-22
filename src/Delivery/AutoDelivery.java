package Delivery;

public class AutoDelivery implements Delivery {
    @Override
    public void delivery() {
        System.out.println("Заказ доставлен автомобилем");
    }
}
