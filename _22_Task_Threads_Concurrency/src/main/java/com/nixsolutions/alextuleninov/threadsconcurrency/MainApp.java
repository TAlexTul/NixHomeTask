package com.nixsolutions.alextuleninov.threadsconcurrency;

public class MainApp {

    public static void main(String[] args) {

        DiningPhilosophers diningPhilosophers = new DiningPhilosophers();

        Runnable pickUpLeftFork = () -> System.out.println("picked up left fork by " + Thread.currentThread().getName());

        Runnable pickUpRightFork = () -> System.out.println("picked up right fork by " + Thread.currentThread().getName());

        Runnable eat = () -> System.out.println("eat by " + Thread.currentThread().getName());

        Runnable putDownLeftFork = () -> System.out.println("put down left fork by " + Thread.currentThread().getName());

        Runnable putDownRightFork = () -> System.out.println("put down right fork by " + Thread.currentThread().getName());

        while (true) {
            Thread f0 = new Thread(() -> {
                try {
                    diningPhilosophers.wantsToEat(0, pickUpLeftFork, pickUpRightFork, eat, putDownLeftFork, putDownRightFork);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "filo-0");
            f0.start();

            Thread f1 = new Thread(() -> {
                try {
                    diningPhilosophers.wantsToEat(1, pickUpLeftFork, pickUpRightFork, eat, putDownLeftFork, putDownRightFork);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "filo-1");
            f1.start();

            Thread f2 = new Thread(() -> {
                try {
                    diningPhilosophers.wantsToEat(2, pickUpLeftFork, pickUpRightFork, eat, putDownLeftFork, putDownRightFork);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "filo-2");
            f2.start();

            Thread f3 = new Thread(() -> {
                try {
                    diningPhilosophers.wantsToEat(3, pickUpLeftFork, pickUpRightFork, eat, putDownLeftFork, putDownRightFork);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "filo-3");
            f3.start();

            Thread f4 = new Thread(() -> {
                try {
                    diningPhilosophers.wantsToEat(0, pickUpLeftFork, pickUpRightFork, eat, putDownLeftFork, putDownRightFork);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "filo-4");
            f4.start();
        }

    }
}
