package Products;

import java.util.ArrayList;
import java.util.List;

// Для ускорения заполнения склада товарами.
public class ListProducts {
    public static List<Product> warehouseFilling() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Кисточка для пупка", 500, "Кисточковая фабрика"));
        products.add(new Product("Молоток", 150, "Молотковая фабрика"));
        products.add(new Product("Хлеб", 140, "Пекарня"));
        products.add(new Product("Молоко", 150, "Молочный комбинат"));
        products.add(new Product("Зонт", 500, "Фабрика зонтиков"));
        products.add(new Product("Шкаф", 900, "Мебельная фабрика"));
        products.add(new Product("Стул", 400, "Мебельная фабрика"));
        return products;
    }
}
