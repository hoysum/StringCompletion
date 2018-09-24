package com.company;

import java.util.Scanner;

//The following code is supposed to ask the user their pet's name, breed and age. Add the 3 lines necessary to make this work...
public class StringCompletion {

        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);

            //declare variables
            String name;
            String breed;
            int age;




            //output
            System.out.print( "Greetings. What is your pet's name? " );
            name = keyboard.next(); 

            System.out.print( "What kind of animal is " + name + "? " );
            breed = keyboard.next();

            System.out.print( "How old is " + name + "? ");
            age = keyboard.nextInt();

            System.out.println( name + " is your " + breed + " and it is " + age );
        }
    }
