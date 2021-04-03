package labs.practice4;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Drink extends Product{

     Drink(int id, String name, BigDecimal price, LocalDate bestBefore) {
        super(id, name, price);
        getBestBefore();
    }



    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17,30)))&&
                now.isBefore(LocalTime.of(18,30))
                ? super.getDiscount(): BigDecimal.ZERO;
    }

    @Override
    public Product applyRating(Rating newRating) {
        return new Drink(getId(),getName(),getPrice(),getBestBefore());
    }
}
