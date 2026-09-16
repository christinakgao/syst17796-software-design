/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;
import java.util.Scanner;

/**
 *
 * @author chris
 */
public class StudentList {
    
    public static void main (String[] args) {
        Student[] list = new Student[6];

        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            System.out.print("Enter student number: ");
            String id = input.nextLine();
            list[i] = new Student(id, name);
        }
        
        input.close();
        
        for (Student s : list) {
            System.out.println(s);
        }
        
    }
}
