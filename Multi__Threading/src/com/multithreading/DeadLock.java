package com.multithreading;

class DeadLock {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("Thread 1: Locked A");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (lockB) {
                    System.out.println("Thread 1: Locked B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lockB) {
                System.out.println("Thread 2: Locked B");
                try { Thread.sleep(100); } catch (Exception e) {}
                synchronized (lockA) {
                    System.out.println("Thread 2: Locked A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}