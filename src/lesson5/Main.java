package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Main {
    public static final int CARS_COUNT = 4;
    public static CyclicBarrier cb;
    public static CountDownLatch cd;
    public static Semaphore smp;
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        Race race = new Race(new Road(60),new Tunnel(),new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
        }
        cb = new CyclicBarrier(4);
        cd = new CountDownLatch(2);
        smp = new Semaphore(2);

        for (int i = 0; i < cars.length; i++) {
            new Thread(cars[i]).start();
        }
    }

}

