package labs.practice4;

import java.math.BigDecimal;

public class Shop {
    public static void main(String [] args){
        Product p1 = new Product(101,"Tea",BigDecimal.valueOf(1.99));
        Product p2 = new Product(102,"Coffee",BigDecimal.valueOf(2.99), Rating.NOT_RATED);
        Product p3 = new Product(103,"Cake",BigDecimal.valueOf(2.99));
        Product p4 = new Product();
        System.out.println(p1.getId()+" "+ p1.getName()+" "+p1.getPrice()+" available discount is "+ p1.getDiscount());
        System.out.println(p2.getId()+" "+ p2.getName()+" "+p2.getPrice()+" available discount is "+ p2.getDiscount());
        System.out.println(p3.getId()+" "+ p3.getName()+" "+p3.getPrice()+" available discount is "+ p3.getDiscount());

    }
}
