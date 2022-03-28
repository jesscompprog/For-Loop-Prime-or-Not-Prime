/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

/**
 *
 * @author Jess
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Jess Prime or Not Prime");
        boolean isPrime = true;
        
        for (int i = 2; i < 100; i++) {
                                                        
             for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                    
                }
                
             }
             if(isPrime){
                 System.out.println(i + " is a Prime");
            } else {
                System.out.println(i + " is Not Prime");
            }
            isPrime = true;
             }
             
             
        }
        
    }
    

            
        
            
        
   
    

