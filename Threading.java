/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Dalih Rusmana
 */
public class Threading implements Runnable {
    int angka;
    String namaThread;
    
    public Threading(String nama){
        angka = 0;
        namaThread = nama;
    }
    
    public void run(){
        try {
            do {
                Thread.sleep(1000);
                System.out.println("di "+namaThread+", angka ke-"+angka);
                angka++;
            } while (angka<10);
        } catch (InterruptedException e) {
            System.out.println("error!");
        }
    }
}
