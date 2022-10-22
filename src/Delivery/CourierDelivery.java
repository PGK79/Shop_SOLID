package Delivery;

public class CourierDelivery implements Delivery {
    @Override
    public void delivery() {
        System.out.println("Заказ доставлен курьером");
    }
}
