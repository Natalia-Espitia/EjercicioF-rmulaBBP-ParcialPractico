package edu.eci.arsw.math;

public class Thread {

    PiDigits piDigits;

    public Thread(PiDigits piDigits) {
        this.piDigits = piDigits;
    }

    public void run() {
        System.out.println(PiDigits.getDigits(0, 10));
        System.out.println(PiDigits.getDigits(1, 100));
        System.out.println(PiDigits.getDigits(1, 1000000));
    }

    
    
}
  