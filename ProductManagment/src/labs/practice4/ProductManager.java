package labs.practice4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductManager {

    public Product createProduct(int id, String name, BigDecimal price,Rating rating, LocalDate bestBefore){
             return new Food(id, name,price, rating,bestBefore);
    }
    public Product createProduct(int id, String name, BigDecimal price, LocalDate bestBefore){
        return new Drink(id, name,price, bestBefore);
    }
    public void printProducts(Comparator<Product> sorter){
        List<Product> productList = new ArrayList<Product>(products.keySey());
        productList.sort(sorter);
        StringBulider txt = new StringBuiler();
    }
}
