package Products;

import java.util.Objects;

public class Product {
    private String name;
    private int price;
    private String manufacturer;

    public Product(String name, int price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String toString() {
        return "" + name + ". Цена: " + price + " рублей " + "Изготовлено: "
                + manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Product product = (Product) obj;
        return name.equals(product.name)// Без проверки на null, т.к. все объекты имеют заполненные поля при создании
                && (price == product.price || (price != 0 && price == product.getPrice())// товар может быть разной цены
                && (manufacturer.equals(product.manufacturer)
                || (manufacturer.equals(product.getManufacturer()))));
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, manufacturer);
    }
}
