package com.rashid.hackersolution;   
    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class HackerrankSolution18 {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();            
            String ans="";
            if(n%2==1){
              ans = "Weird";
            }
            else{
                 if(n%2==0){
                 if(n>=2 && n<=5)    
                     ans = "Not Weird";
                 if(n>=6 && n<=20)    
                     ans = "Weird";
                     
              ans = "Not Weird";
            }
            
               //Complete the code
                
            }
            System.out.println(ans);
            
        }
    }
