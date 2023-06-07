/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eh155
 */
public class Checkout {

    //details of a debit card
    private double cardNumber;
    private double cardPin;

    public Checkout() {

    }

    //asking the user their information for payment 
    public void checkout() {
        //asking the user to enter their payment details
        Scanner scan = new Scanner(System.in);
        System.out.println("Pay by card? 'Y' to continue. If Not, Payment cannot proceed.");
        String answer = scan.nextLine();
        //if their answer is equal to Y , it will proceed to ask the questions
        if (answer.equals("Y") || answer.equals("y")) {
            try {
                System.out.println("Cards Number:");
                cardNumber = scan.nextDouble();
                System.out.println("Cards Pin:");
                cardPin = scan.nextDouble();
                System.out.println("Thank you for ordering. Your payment has been processed & your food will arive shortly!");
                //no letters in card information - therefore will ask user to try again
            } catch (InputMismatchException ex) {
                scan.next();
                System.out.println("Sorry, You have entered an invalid Number. Please ensure that there is no letters in your input. Retry payment:");
                checkout();
            }
        } else {
            //if user cannot enter Y , they will be unsucessful
            System.out.println("Payment was unsucessful");
        }

    }
    
    //tester
//    public static void main(String[] args) {
//        Checkout co = new Checkout();
//        co.checkout();
//    }
//    

}
