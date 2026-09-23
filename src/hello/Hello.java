/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;
import java.util.Scanner;

/**
 * changes on Sept 23
 * @author chris
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Enter a string:");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        char[] letters = word.toCharArray();
        char[] reverseLetters = new char[word.length()];
        
        int counter = word.length() - 1;
        
        for (char l : letters) {
            reverseLetters[counter] = l;
            counter--;
        }
        
        System.out.println(reverseLetters);
        input.close();
    }
    
}
