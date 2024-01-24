package client;

import java.util.Scanner;

import drinks.Beverage;
import drinks.Coffee;
import drinks.Tea;

/**
 * Demonstration of polymorphic drinks.
 * 
 * @author Willow Sapphire
 * @version 01/24/2024
 */
public class App
{
    /**
     * Order a drink.
     * 
     * @param args unused.
     */
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        Beverage drink = null;
        do {
            System.out.println("What would you like to drink?");
            System.out.println("1) Coffee");
            System.out.println("2) Tea");
            String input = kb.nextLine();
            try
            {
                int choice = Integer.parseInt(input);
                switch (choice)
                {
                    case 1:
                        drink = new Coffee();
                        break;
                    case 2:
                        drink = new Tea();
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid menu selection");
                }
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("Please select a number from the menu.");
            }
        } while (drink == null);
        kb.close();
        
        drink.brew();
        System.out.printf("Here is your %s\n", drink);
    }
}
