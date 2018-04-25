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
public class MainThread {
    public static void main (String args[]) {
        Threading TM = new Threading("Thread Dalih");
        Threading2 TM2 = new Threading2 ("Thread Aldhi");
        Thread thread1 = new Thread(TM);
        Thread thread2 = new Thread(TM2);
        thread1.start(); thread2.start();
        
        
        
    }
    
}
