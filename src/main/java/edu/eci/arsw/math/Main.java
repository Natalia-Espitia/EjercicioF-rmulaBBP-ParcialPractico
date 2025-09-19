/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.math;

import java.util.Arrays;

/**
 *
 * @author hcadavid
 */
public class Main {

    public static void main(String[] args) {
        PiDigits piDigits = new PiDigits();

        PiDigitThread thread1 = new PiDigitThread(piDigits, 0, 10, 5);
        PiDigitThread thread2 = new PiDigitThread(piDigits, 10, 100, 5);
        PiDigitThread thread3 = new PiDigitThread(piDigits, 10, 1000, 5);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    final static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<hexChars.length;i=i+2){
            //sb.append(hexChars[i]);
            sb.append(hexChars[i+1]);            
        }
        return sb.toString();
    }

}
