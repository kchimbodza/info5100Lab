/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package musicapp;

import java.io.File;
import java.util.concurrent.CountDownLatch;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Admin
 */
public class Thread2 extends Thread {
   private static final String[] TONES = {
        "do.wav", "re.wav", "mi.wav", "fa.wav", 
        "sol.wav", "la.wav", "si.wav", "do-octave.wav"
    };

    private CountDownLatch startLatch;
    private CountDownLatch doneLatch;

    public Thread2(CountDownLatch startLatch, CountDownLatch doneLatch) {
        this.startLatch = startLatch;
        this.doneLatch = doneLatch;
    }

    @Override
    public void run() {
        try {
            startLatch.await();
            
            // Wait 1000ms before starting to create proper rhythm
            Thread.sleep(850);
            
            playTone(TONES[1]);  // re (starts at 1200ms)
            Thread.sleep(850);    // wait for mi to finish
            
            playTone(TONES[3]);  // fa (starts at 875ms)
            Thread.sleep(850);    // wait for sol to finish
            
            playTone(TONES[5]);  // la (starts at 1575ms)
            Thread.sleep(850);    // wait for si to finish
            
            // Final note slightly earlier for harmony
      playToneWithDuration(TONES[7], 600);  // do-octave (starts at 2275ms)

            doneLatch.countDown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void playTone(String filename) {
        playToneWithDuration(filename, 500);
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
