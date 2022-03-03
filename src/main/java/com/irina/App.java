package com.irina;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Scanner entrada= new Scanner(System.in);

        System.out.println("What is your name?");
        String name_user=entrada.nextLine();
        System.out.println("How old are you?");
        int age_user=entrada.nextInt();
        if (age_user >=18) {
            System.out.println("Welcome " + name_user + ", you have " + age_user + " you can pass.");
        } else {
            System.out.println("Welcome " + name_user + ", you have " + age_user + " you cannot pass.");
            
        }
        entrada.close();
        
    }
}
