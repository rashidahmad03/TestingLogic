package com.rashid.hackersolution;   
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerrankSolution68 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
    BigInteger a1= new BigInteger(n);
        boolean d=a1.isProbablePrime(0);
        
if(d==true)System.out.println("prime");
        scanner.close();
    }
}
