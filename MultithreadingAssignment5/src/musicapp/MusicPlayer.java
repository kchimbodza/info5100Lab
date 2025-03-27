/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author Admin
 */
public class MusicPlayer {
   public static void main(String[] args) {
        try {
            // Synchronization latches
            CountDownLatch startLatch = new CountDownLatch(1);
            CountDownLatch doneLatch = new CountDownLatch(2);

            // Create and start threads
            Thread1 thread1 = new Thread1(startLatch, doneLatch);
            Thread2 thread2 = new Thread2(startLatch, doneLatch);

            thread1.start();
            thread2.start();

            // Release all threads to start simultaneously
            startLatch.countDown();

            // Wait for both threads to complete
            doneLatch.await();

            System.out.println("Musical sequence completed!");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Interrupted: " + e.getMessage());
        }
    }
}

