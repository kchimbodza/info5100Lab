package musicapp;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Thread1 extends Thread {
     private static final String[] TONES = {
        "do.wav", "re.wav", "mi.wav", "fa.wav", 
        "sol.wav", "la.wav", "si.wav", "do-octave.wav"
    };

    private CountDownLatch startLatch;
    private CountDownLatch doneLatch;

    public Thread1(CountDownLatch startLatch, CountDownLatch doneLatch) {
        this.startLatch = startLatch;
        this.doneLatch = doneLatch;
    }

    @Override
    public void run() {
         try {
        startLatch.await();

        // Play odd-numbered notes with precise timing
        playTone(TONES[0]);  // do (starts at 0ms, duration 1200ms)
        playTone(TONES[2]);  // mi (starts at 1200ms, duration 1200ms)
        playTone(TONES[4]);  // sol (starts at 2400ms, duration 1200ms)
        playTone(TONES[6]);  // si (starts at 3600ms, duration 1200ms)
        playToneWithDuration(TONES[7], 100);  // do-octave (starts at 4800ms, duration 100ms)

        doneLatch.countDown();
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}

    private void playTone(String filename) {
        playToneWithDuration(filename, 1200);
    }

    private void playToneWithDuration(String filename, int duration) {
        try {
            File audioFile = new File("src/musicapp/tones/" + filename);
            if (!audioFile.exists()) {
                System.err.println("File not found: " + audioFile.getPath());
                return;
            }
            
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(audioFile));
            clip.start();
            Thread.sleep(duration);
            clip.close();
        } catch (Exception e) {
            System.err.println("Error playing " + filename + ": " + e.getMessage());
        }
    }
}
