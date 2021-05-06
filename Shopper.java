import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.*;
class Shopper extends Thread {
	 
	 static int cookieCount = 0;
	 private static synchronized void addCookie() {
		cookieCount++;
	 }
	  public void run() {
		 
		  for ( int i =0; i < 5;i++) {
			addCookie();
		  }
		 
		 
	  }

}



