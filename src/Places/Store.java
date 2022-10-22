package Places;

import Products.ListProducts;
import Products.Product;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> generalListGoods = new ArrayList();

    public Store() {
        generalListGoods = ListProducts.warehouseFilling();// наполняем склад (для демонстрации работы)
    }

    public void goodsInStock() {
        System.out.println("На складе имеются: ");
        int num = 1;
        for (Product good : generalListGoods) {
            System.out.println(num + "." + good.getName() + "\n Изготовитель: "
                    + good.getManufacturer());
            num++;
        }
    }

    public void setGeneralListGoods(String goodName, int goodPrice, String goodManufacturer) {
        if (generalListGoods.contains(new Product(goodName, goodPrice, goodManufacturer))) {
            System.out.println("Данный товар есть на складе");
        } else {
            generalListGoods.add(new Product(goodName, goodPrice, goodManufacturer));
        }
    }

    public List<Product> getGeneralListGoods() {
        return generalListGoods;
    }

    public String toString() {
        return "" + generalListGoods;
    }
}
