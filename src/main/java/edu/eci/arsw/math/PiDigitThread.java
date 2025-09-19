package edu.eci.arsw.math;

import java.util.Arrays;

public class PiDigitThread extends Thread {

    private int start;
    private int count;
    private int step;
    private PiDigits piDigits;

    public PiDigitThread(PiDigits piDigits, int start, int count, int step) {
        this.piDigits = piDigits;
        this.start = start;
        this.count = count;
        this.step = step;
    }


    @Override
    public void run() {
        byte[] resultBytes = piDigits.getDigits(start, count, step);
        String hexResult = Main.bytesToHex(resultBytes);
        System.out.println("Thread " + this.getName() + " calculated: " + hexResult);
    } 
}
  