/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaapplication;

/**
 *
 * @author 24056977
 */
import java.util.Scanner;
public class JavaApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: "); //I did not use println() because I want the string to be next to the question
        String name = input.next().toUpperCase(); //I use next to read the first name entered 
        System.out.println("\nHello " + name);
    }
}
