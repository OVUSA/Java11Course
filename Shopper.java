class Shopper extends Thread {
	 
	 static int cookieCount = 0;
	  public void run() {
		 pencil.lock();
		  for ( int i =0; i < 10;i++) {
			  cookieCount++;
			  System.out.println(Thread.currentThread().getName()+ " is thinking");
			  pencil.unlock();
		  }
	  }

}

