package labs.practice4;
/**
 * {@code Product} class represents properties and behaviors of
 * product objects in the Product Manager System.
 *
 * Each product has an id,name, price, discount.
 *
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.locks.Condition;
import static labs.practice4.Rating.NOT_RATED;


public class Product {
    public static final BigDecimal DISCOUNT_RATE= BigDecimal.valueOf(0.1);
    private int id;
    private String name;
    private BigDecimal price;
    //private Condition condition;



    private Rating rating;

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product (){

    }

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = NOT_RATED;

    }



    public void addCaution(String caution) {
        this.caution = caution;
    }

    private String caution;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    // Discount 10%
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

  public Rating getRating() {
      return rating;
  }

}
