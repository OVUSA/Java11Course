
public class DataRaceDemo{
	
	 public static void main(String []args) throws InterruptedException{
		 Thread barron = new Shopper();
		 Thread olya = new Shopper();
		 barron.start();
		 olya.start();
		 barron.join();
		 olya.join();
		 System.out.println("We should buy "+ Shopper.cookieCount + "cookies");
		 
	 }
 }

