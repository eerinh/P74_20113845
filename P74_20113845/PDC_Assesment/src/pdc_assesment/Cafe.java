/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author eh155
 */
public class Cafe {

    //new object of type Inventory
    Inventory inventory = Inventory.getInstance();

    //adding the cafe item , food or drink, to the inventory 
    public Cafe() {
        inventory.addCafeItem(new Food(9.00, "Chicken and lettuce", "Chicken Sandwhich", Temperature.COLD) {
            @Override
            public double getGrams() {
                return 4;
            }
        });
        inventory.addCafeItem(new Food(10.00, "Bacon and egg", "Pie", Temperature.WARM) {
            @Override
            public double getGrams() {
                return 5;
            }
        });
        inventory.addCafeItem(new Food(7.00, "Cake", "Red Velvet Cake", Temperature.WARM) {
            @Override
            public double getGrams() {
                return 3;
            }
        });

        inventory.addCafeItem(new Drink(4.00, "Small Hot Chocolate", "Small Hot Chocolate", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.SMALL;
            }
        });

        inventory.addCafeItem(new Drink(5.00, "Medium Hot Chocolate", "Medium Hot Chocolate", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.MEDIUM;
            }
        });
        inventory.addCafeItem(new Drink(6.00, "Large Coffee", "Large Coffee", Temperature.HOT) {
            @Override
            public Drink.CupSize getCupSize() {
                return Drink.CupSize.LARGE;
            }
        });
    }

//    //Printing out the items that are available at the cafe 
//    public void printItem() {
//        //using loop to print out the items in a number list with their prices 
//        int inOrder = 1;
//        for (CafeItem c : this.inventory.getCafeItem()) {
//            System.out.println(inOrder + ". " + c.getName() + " $" + c.getPrice());
//            inOrder++;
//        }
//    }
}
//
//    //main method
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Cafe cafe = new Cafe();
//        Customer customer;
//        Checkout checkout = new Checkout();
//
//        //reading the file to the output screen
//        System.out.println(FileUtility.readMotd());
//
//        //Start of the program 
//        String userInput = " ";
//        System.out.println("************* Welcome to the cafe ***************");
//        System.out.println(FileUtility.readHours());
//
//        System.out.println("To view the food and drink menu, enter anyting to proceed. If you would like to leave the cafe now please enter 'X' or 'x'. Please be aware we only accept Bank Cards.");
//        userInput = scan.nextLine();
//        if (userInput.equals("X") || userInput.equals("x")) {
//            System.out.println("Thank You for stopping by! Exiting the Program");
//            System.exit(0);
//
//        }
//        //prints menu
//        System.out.println(" ");
//        System.out.println("---Food and Drink Menu--- ");
//        cafe.printItem();
//
//        //asks if they want to order
//        System.out.println(" ");
//        System.out.println("Would you like to Place an order? Press anything to continue. Else, enter 'X' or 'x' to exit the cafe");
//        String decision = scan.nextLine();
//
//        //stop running the programme is user enters X or x.
//        if (decision.equals("X") || decision.equals("x")) {
//            System.out.println("Thank You for stopping by! Exiting the Program");
//            System.exit(0);
//        }
//
//        // ask user for name
//        System.out.println("What is your name for the order?");
//        String name = scan.nextLine();
//        // generate random number for table number
//        int tableNumber = (int) (Math.random() * 15);
//        System.out.println(" ");
//        System.out.println(name + " your table number is " + tableNumber);
//        //creating a new customer
//        customer = new Customer(name, tableNumber);
//
//        //creating a new file
//        try {
//            File file = new File("customer.txt");
//            file.createNewFile();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//        //writing to the file 
//        try {
//            FileWriter fw = new FileWriter("customer.txt");
//            fw.write("Customers name: " + customer.getName() + " & their Table order number: " + customer.getTableNumber());
//            System.out.println("Thanks " + customer.getName() + "! This has been added to our system!");
//            fw.close();
//        } catch (IOException e) {
//            e.getStackTrace();
//        }
//
//        //giving the user the option to view the menu before ordering. 
//        boolean viewMenu = true;
//        Cart cart = new Cart();
//
//        while (viewMenu) {
//            //asking the question 
//            System.out.println("Press 'M' to view the menu again or anything else to continue placing your order:");
//            String menu = scan.nextLine();
//            //reprinting the menu if they enter M
//            if (menu.equals("M")) {
//                System.out.println("---Food and Drink Menu--- ");
//                cafe.printItem();
//               // dont want the menu
//            } else {
//                boolean ordering = true;
//                while (ordering) {
//                    //continuting on with the order if they dont want to see the menu
//                    viewMenu = false;
//                    try {
//                        System.out.println("Enter the number of what you would like to order (Numbers Only). Enter only one number at a time please.");
//                        int itemOrder = scan.nextInt();
//                        CafeItem item = null;
//                        //getting the items from the inventory list 
//                        switch (itemOrder) {
//                            case 1:
//                                item = cafe.inventory.getCafeItem().get(0);
//                                break;
//                            case 2:
//                                item = cafe.inventory.getCafeItem().get(1);
//                                break;
//                            case 3:
//                                item = cafe.inventory.getCafeItem().get(2);
//                                break;
//                            case 4:
//                                item = cafe.inventory.getCafeItem().get(3);
//                                break;
//                            case 5:
//                                item = cafe.inventory.getCafeItem().get(4);
//                                break;
//                            case 6:
//                                item = cafe.inventory.getCafeItem().get(5);
//                                break;
//                            default:
//                                System.out.println("Not a valid input. Please Try again - Numbers Only.");
//                                continue;
//                        }
//                    }
//
////                        //adding the item user has selected to the cart and printing their order if not equal to null
////                        if (item != null) {
////                            cart.addToCart(item);
////                            System.out.println(item.getName() + " has been added to your order. This is $" + item.getPrice());
////                        }
////                    // instead inputmismatchexception given , it will allow the user to input again
////                    } catch (InputMismatchException ex) {
////                        System.out.println("It appears you have entered a character that is not an integer. Please try again. ");
////                        scan.next();
////                    }
////
////                
////                
////                //ask the user if they want to add more to their cart or proceed to checkout
////                System.out.println("Would you like to buy anything else? ('C' for continue to purchase), enter anything else to proceed to view your order. ");
////                scan.nextLine();
////                String more = scan.nextLine();
////                if (more.equals("C")) {
////                    continue;
////                } else {
////                    ordering = false;
////                    System.out.println("Thank you for your order!");
////                    System.out.println("");
////                }
////                
////                //show the user their order, table number, items purchases and prices 
////                double totalCost = 0.0;
////                System.out.println(customer.getName() + " your table number is " + customer.getTableNumber() + " and this is what you have ordered:");
////                for (CafeItem c : cart.getCafeItem()) {
////                    System.out.println("- " + c.getName() + " $" + c.getPrice());
////                    totalCost += c.getPrice();
////                }
////                System.out.println("Your total cost will be: $" + totalCost);
////                //creating a new file
////                try {
////                    File file = new File("totalcost.txt");
////                    file.createNewFile();
////                } catch (IOException e) {
////                    e.getStackTrace();
////                }
////                //writing to the file the customers name and their total cost 
////                try {
////                    FileWriter fw = new FileWriter("totalcost.txt");
////                    fw.write(customer.getName() + ". Total Cost: $" + (int) totalCost);
////                    fw.close();
////                } catch (IOException e) {
////                    e.getStackTrace();
////                }
////                ;
//                //printing out how the user has to pay
//              //  checkout.checkout();
//            }
//        }
//    }
//}
//}
