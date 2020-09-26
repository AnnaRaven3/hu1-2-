/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.grieskirchen.pos.aschmidinger18.erstehausuebung2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author annas
 */
public class EratosthenesPrimeSieve {

    /**
     * @param args the command line arguments
     */
    
    static int[] primeA = null;
    static int[] evenA = null;
        
    static List<Integer> primes = new ArrayList<>();
    static List<Integer> evens = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Obergrenze:");
        int ausw = Integer.parseInt(scanner.nextLine());
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(ausw);
        
        ep.primesList();
        ep.evenList();
        ep.printResults();
        
    }
    
    public EratosthenesPrimeSieve(int grenze) {
        primeA = new int[grenze];
        evenA = new int[grenze];

    }
    
    public boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        if (p == 2) {
            return true;
        }

        for (int i = 2; i < p; i++) {

            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public void primesList() {
    for (int i = 0; i < primeA.length; i++) {
            primeA[i] = i;
        }
        for (int i = 0; i < primeA.length; i++) {
            if (isPrime(primeA[i]) == false) {
                primeA[i] = -1;
            }
        }
        for (int i = 0; i < primeA.length; i++) {
            if (primeA[i] != -1) {
                primes.add(primeA[i]);
            }
        }
    }
    
    public boolean isEven(int p) {
        if (p <= 2) {
            return false;
        }

        if (p % 2 == 0) {
            return true;
        }
        return false;
    }
    
     public void evenList() {
         
     }
     
     public void printResults() {
         
     }
    
}
