class Shopper extends Thread {
	 
	 static int cookieCount = 0;
	  public void run() {
		  for ( int i =0; i < 10;i++) {
			  cookieCount++;
			  
		  }
	  }

}

