package labs.practice4;

import java.math.BigDecimal;

public class Shop {
    public static void main(String [] args){
        ProductManager pm = new ProductManager();
        Product p1 = pm.createProduct(101,"Tea",BigDecimal.valueOf(1.99),LocalDate.now().plusDays(1));
        Product p2 = pm.createProduct(102,"Coffee",BigDecimal.valueOf(2.99), LocalDate.now());
        Product p3 = pm.createProduct(103,"Cake",BigDecimal.valueOf(2.99),Rating.NOT_RATED, LocalDate.now().plusDays(2));
        Product p4 = pm.createProduct(110, "Cookie,",BigDecimal.valueOf(4.99),Rating.NOT_RATED, LocalDate.now().plusDays(2));
        Product p5 = pm.createProduct(104,"Chocolate",BigDecimal.valueOf(1.99),Rating.NOT_RATED,LocalDate.now().plusDays(2));
        Product p6 = pm.createProduct(104,"Chocolate",BigDecimal.valueOf(10.99), LocalDate.now());
        Product p7 = p5.applyRating(Rating.NOT_RATED);

        p3.getBestBefore();

        /*if (p3 instanceof Food){
            LocalDate bestBefore = ((Food)p3).getBestBefore();

        }*/

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);

    }
}
