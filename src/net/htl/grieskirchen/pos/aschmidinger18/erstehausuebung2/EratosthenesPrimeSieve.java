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
    
    static int[] primeArray = null;
    static int[] evenArray = null;
        
    static List<Integer> primes = new ArrayList<>();
    static List<Integer> evens = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        System.out.println("Obergrenze:");
        int ausw = Integer.parseInt(scanner.nextLine());
        EratosthenesPrimeSieve ep = new EratosthenesPrimeSieve(ausw);

    }
    
    public EratosthenesPrimeSieve(int grenze) {
        primeArray = new int[grenze];
        evenArray = new int[grenze];

    }
    
    public boolean isPrime(int p) {
        return true;
    }
    
    public void primesList() {
    
    }
    
    public boolean isEven(int p) {
        return true;
    }
    
     public void evenList() {
         
     }
     
     public void printResults() {
         
     }
    
}
