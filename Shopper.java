class Shopper extends Thread {
	 
	 static int cookieCount = 0;
	  public void run() {
		 for ( int i =0; i < 5;i++) {
			  pencil.lock();
			  cookieCount++;
			  pencil.unlock();
			  System.out.println(Thread.currentThread().getName()+ " is thinking");
			  try {
			  Thread.sleep(500);
			  }catch(InterruptedException e) {e.printStackTrace();}
			 
		  }
	  }

}

