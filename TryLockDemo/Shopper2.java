package TryLockDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper2 extends Thread{
    private int itemsToAdd = 0;
    private static int itemsOnNotepad = 0;
    private static Lock pencil = new ReentrantLock();
    private String name;

     public Shopper2(String name){this.name = name;}
     public void run(){
         while(itemsOnNotepad<=20){
             if((itemsToAdd>0) && pencil.tryLock()){// add item(s) to shared notepad
                 try{

                     itemsOnNotepad +=itemsToAdd;
                     System.out.println(this.getName()+ " added "+ itemsToAdd+ "items(s) to notepad.");
                     itemsToAdd = 0;
                     Thread.sleep(300);
                 }catch (InterruptedException e ){
                     e.printStackTrace();
                 }finally{
                     pencil.unlock();
                 }
             }else {// look for other things to buy
                 try{
                     Thread.sleep(100);
                     itemsToAdd++;
                     System.out.println(this.getName()+" found something to buy.");
                 }catch(InterruptedException e ){
                     e.printStackTrace();
                 }
             }
         }
     }
     static class TryLockDemo{
         public static void main(String[] args) throws InterruptedException {
             Thread barron = new Shopper2("Barron");
             Thread olya = new Shopper2("Olya");
             long start = System.currentTimeMillis();
             barron.start();
             olya.start();
             barron.join();
             olya.join();
             long finish = System.currentTimeMillis();
             System.out.print("Elapsed time "+ (float)(finish -start)/1000 +" seconds");



         }
     }





}
