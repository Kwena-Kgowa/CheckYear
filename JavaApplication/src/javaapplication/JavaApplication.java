/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author Kwena Martin
 */
public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter year you were born > ");
        int year = reader.nextInt();
        int age = GetAge(year);
        if(age<0)
            System.out.println("This is an invlaid year");
        else
            System.out.println("You are "+age+" years old");
    }
    
    public static int GetAge(int year)
    {
        return (Year.now().getValue()-year);
    }
}
