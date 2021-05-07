package TryLockDemo;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher extends Thread{
    private Lock firstChopstick,secondChopstick;
    private static int sushiCount = 50;
    String name;

    public Philosopher(String name, Lock fistChopstick,Lock secondChopstick){
        this.name = name;
        this.firstChopstick = fistChopstick;
        this.secondChopstick = secondChopstick;

    }
    public void run(){
        while(sushiCount > 0){ // eat sushi until it is all gone

            //pick up chopstick
            firstChopstick.lock();
            secondChopstick.lock();

            try {
                // take piece of sushi
                if (sushiCount > 0) {
                    sushiCount--;
                    System.out.println(this.name + " took a piece!Sushi remaining: " + sushiCount);
                }

                if (sushiCount == 10)
                    System.out.println(1 / 0);



            }finally {
                // put down chopsticks
                secondChopstick.unlock();
                firstChopstick.unlock();
            }
            }

    }
}
class DeadLockDemo{
    public static void main (String [] args){
        Lock chopstickA = new ReentrantLock();
        Lock chopstickB = new ReentrantLock();
        Lock chopstickC = new ReentrantLock();
        new Philosopher("Barron",chopstickA,chopstickB).start();
        new Philosopher("Olya",chopstickB,chopstickC).start();
        new Philosopher("Steve",chopstickA,chopstickC).start();


    }
}
