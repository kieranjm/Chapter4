/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chapter40;

import java.util.Scanner;

/**
 *
 * @author 0787461
 */
public class WordCounter {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.io);
        
        System.out.println("Please enter a word: ");
        
        String word = keyboard.nextLine();
        
        System.out.println("Please enter a character: ");
        char character = keyboard.next().charAt(0);
        
        int lengthOfWord = word.length();
        
        int numberOfTimesCharacterPresent = 0;
        
        for (int i = 0; i< lengthOfWord; i++) {
            if (word.charAt(i) == character) {
                numberOfTimesCharacterPresent++;
            }
        }
        System.out.print("Your character was present " + numberOfTimesCharacterPresent + " times.");
    }
           
    
}
