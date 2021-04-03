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
import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.locks.Condition;
import static labs.practice4.Rating.NOT_RATED;


public abstract class Product {
    public static final BigDecimal DISCOUNT_RATE= BigDecimal.valueOf(0.1);
    private  final int id;
    private final String name;
    private final BigDecimal price;
    //private Condition condition;



    private Rating rating;

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Product (){
        this(0, "no name", BigDecimal.ZERO);

    }

    public Product(int id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = NOT_RATED;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    // Discount 10%
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }

  public Rating getRating() {
      return rating;
  }

  public abstract Product applyRating(Rating newRating);

    public LocalDate getBestBefore(){ // best before today
        return LocalDate.now();
    }

    public String toString(){
        return "Products{ "+ "id= "+ id +", name "+name+ ", price = "+price+ "}";
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
