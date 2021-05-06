class Calculator{
    PropogateException ex = new PropogateException();
    
     int power(int n, int p)throws Exception{
         int result=0;
         
         if ( n<0 ||p<0){
             ex.example();
         }
         else {
            result= (int)Math.pow(n,p);
         }
         return result;
     }
}
 
 
 class PropogateException {
     
     void example()throws Exception{
         throw new Exception("n and p should be non-negative");
     }
     
 }
