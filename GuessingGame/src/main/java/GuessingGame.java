//This program performs a guessing game.
//The computer guesses a number a maximum of five times.
//The user tells the computer higher, lower, or correct.
//Author: Travis Tithof 2/17/2020

import java.util.*;
public class GuessingGame 
{
    public static void main(String[] args)
    {
       int max = 100;           //maximum value of the range
       int min = 1;             //minimum value of the range
       int guesses = 1;         //number of guess attempts by the computer
       String response = " ";   //user's response
       char play = 'Y';         //user wants to play guessing game
       char ready = 'Y';        //user picked a number
       char lower = 'L';        //computer's guess is lower than user's number
       char higher = 'H';       //computer's guess is higher than the user's number
       char correct = 'C';      //computer's guess is correct
       Scanner inp = new Scanner(System.in);
       
       System.out.println("Welcome to the Backwards Guessing Game");
       System.out.print("Would you like to play? (Y or N): ");
       response = inp.next();
       play = response.charAt(0);
       
       while(play == 'Y')   //Game begins
       {
           System.out.println("Think of a number between 1 and 100");
           System.out.print("Do you have your number? (Y or N): ");
           response = inp.next();
           ready = response.charAt(0);
           
           while(ready == 'Y')
               {
                   while(guesses <= 5)
                   {
                       int random_int = (int)(Math.random() * (max - min + 1) + min);
                       System.out.println("I think the number is " + random_int);
                       System.out.print("How did I do? (higher, lower, or correct) ");
                       response = inp.next();
                       guesses = (guesses + 1);
                       
                       if("lower".equalsIgnoreCase(response))
                       {
                           min = (random_int + 1);
                       }
                       
                       else if("higher".equalsIgnoreCase(response))
                       {
                          max = (random_int - 1);         
                       }
                       
                       else if("correct".equalsIgnoreCase(response))
                       {
                           System.out.println("Yes! I won! I knew I would!");
                           System.exit(0);
                       }
                       
                   }
                   
                   if(guesses > 5)
                   {
                       System.out.println("I couldn't guess your number in 5 tries");
                       System.exit(0);
                    }
                                        
               }      
       }                
    }   
}

