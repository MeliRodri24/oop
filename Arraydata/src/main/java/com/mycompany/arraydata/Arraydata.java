/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydata;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Arraydata {

        public static void mainMenu() {
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Create/register users 
                           [2]. List users 
                           [3]. Search user 
                           [4]. Update user 
                           [5]. Delete user 
                           [6]. Exit 
                           .::: Press an option: """);
    }

    public static void main(String[] args) {

            try (Scanner data = new Scanner(System.in)) {
                ArrayList<String> identNumbers = new ArrayList<>();
                ArrayList<String> firstNames = new ArrayList<>();
                ArrayList<String> lastNames = new ArrayList<>();
                ArrayList<String> emails = new ArrayList<>();
                ArrayList<Integer> ages = new ArrayList<>();
                String firstname, lastname, email, ident_number;
                int age, opt;
                boolean menu_status = true;
                while (menu_status) {
                    
                    mainMenu();
                    opt = data.nextInt();
                    data.nextLine();
                    
                    switch (opt) {
                        
                        case 1 -> {
                            System.out.println("::: REGISTER NEW USER :::");
                            System.out.println("\nUser Nro.: " + (firstNames.size() + 1));
                            
                            System.out.print("Identification number: ");
                            ident_number = data.nextLine();
                            
                            System.out.print("First name: ");
                            firstname = data.nextLine();
                            
                            System.out.print("Last name: ");
                            lastname = data.nextLine();
                            
                            System.out.print("Email: ");
                            email = data.nextLine();
                            
                            System.out.print("Age: ");
                            age = data.nextInt();
                            data.nextLine();
                            
                            identNumbers.add(ident_number);
                            firstNames.add(firstname);
                            lastNames.add(lastname);
                            emails.add(email);
                            ages.add(age);
                            
                            System.out.println("\nUser has been registered successfully!");
                            System.out.println("\nPress Enter to return to main menu.");
                            data.nextLine();
                        }
                        
                        case 2 -> {
                            System.out.println("Total users: " + firstNames.size());
                            
                            if (firstNames.isEmpty()) {
                                
                                System.out.println("No users!");
                                
                            } else {
                                
                                for (int j = 0; j < firstNames.size(); j++) {
                                    
                                    System.out.println("User " + (j + 1) + ": "
                                            + identNumbers.get(j) + " | "
                                            + firstNames.get(j) + " | "
                                            + lastNames.get(j) + " | "
                                            + emails.get(j) + " | "
                                            + ages.get(j));
                                }
                            }
                            
                            System.out.println("\nPress Enter to return to main menu.");
                            data.nextLine();
                        }
                        
                        case 3 -> {
                            System.out.println("::: SEARCH USER :::");
                            System.out.print("Enter identification number: ");
                            ident_number = data.nextLine();
                            
                            boolean found = false;
                            
                            for (int j = 0; j < identNumbers.size(); j++) {
                                
                                if (identNumbers.get(j).equals(ident_number)) {
                                    
                                    System.out.println("\n::: USER FOUND :::");
                                    System.out.println("Identification: " + identNumbers.get(j));
                                    System.out.println("First Name: " + firstNames.get(j));
                                    System.out.println("Last Name: " + lastNames.get(j));
                                    System.out.println("Email: " + emails.get(j));
                                    System.out.println("Age: " + ages.get(j));
                                    
                                    found = true;
                                    break;
                                }
                            }
                            
                            if (!found) {
                                System.out.println("\nUser not found.");
                            }
                            
                            System.out.println("\nPress Enter to return to main menu.");
                            data.nextLine();
                        }
                        
                        case 4 -> {
                            System.out.println("::: UPDATE USER :::");
                            System.out.print("Enter identification number: ");
                            ident_number = data.nextLine();
                            
                            boolean updated = false;
                            
                            for (int j = 0; j < identNumbers.size(); j++) {
                                
                                if (identNumbers.get(j).equals(ident_number)) {
                                    
                                    System.out.println("\nUser found:");
                                    System.out.println("1. Identification Number");
                                    System.out.println("2. First Name");
                                    System.out.println("3. Last Name");
                                    System.out.println("4. Email");
                                    System.out.println("5. Age");
                                    
                                    System.out.print("What do you want to update? ");
                                    int optionUpdate = data.nextInt();
                                    data.nextLine();

                                    switch (optionUpdate) {
                                        
                                        case 1 -> {
                                            System.out.print("New Identification Number: ");
                                            identNumbers.set(j, data.nextLine());
                                            updated = true;
                                        }
                                        
                                        case 2 -> {
                                            System.out.print("New First Name: ");
                                            firstNames.set(j, data.nextLine());
                                            updated = true;
                                        }
                                        
                                        case 3 -> {
                                            System.out.print("New Last Name: ");
                                            lastNames.set(j, data.nextLine());
                                            updated = true;
                                        }
                                        
                                        case 4 -> {
                                            System.out.print("New Email: ");
                                            emails.set(j, data.nextLine());
                                            updated = true;
                                        }
                                        
                                        case 5 -> {
                                            System.out.print("New Age: ");
                                            ages.set(j, data.nextInt());
                                            data.nextLine();
                                            updated = true;
                                        }
                                        
                                        default -> System.out.println("Invalid option.");
                                    }
                                    
                                    if (updated) {
                                        System.out.println("\nUser updated successfully!");
                                    }
                                    
                                    break;
                                }
                            }
                            
                            if (!updated) {
                                System.out.println("\nUser not found or no changes were made.");
                            }
                            
                            System.out.println("\nPress Enter to return to main menu.");
                            data.nextLine();
                        }
                        
                        case 5 -> {
                            System.out.println("::: DELETE USER :::");
                            System.out.print("Enter identification number: ");
                            ident_number = data.nextLine();
                            
                            boolean deleted = false;
                            
                            for (int j = 0; j < identNumbers.size(); j++) {
                                
                                if (identNumbers.get(j).equals(ident_number)) {
                                    
                                    System.out.println("\nUser found:");
                                    System.out.println("Identification: " + identNumbers.get(j));
                                    System.out.println("First Name: " + firstNames.get(j));
                                    System.out.println("Last Name: " + lastNames.get(j));
                                    System.out.println("Email: " + emails.get(j));
                                    System.out.println("Age: " + ages.get(j));
                                    
                                    System.out.print("\nAre you sure you want to delete this user? (Y/N): ");
                                    String confirm = data.nextLine();
                                    
                                    if (confirm.equalsIgnoreCase("Y")) {
                                        
                                        identNumbers.remove(j);
                                        firstNames.remove(j);
                                        lastNames.remove(j);
                                        emails.remove(j);
                                        ages.remove(j);
                                        
                                        System.out.println("\nUser deleted successfully!");
                                        
                                    } else {
                                        
                                        System.out.println("\nDeletion canceled.");
                                    }
                                    
                                    deleted = true;
                                    break;
                                }
                            }
                            
                            if (!deleted) {
                                System.out.println("\nUser not found.");
                            }
                            
                            System.out.println("\nPress Enter to return to main menu.");
                            data.nextLine();
                        }
                        
                        case 6 -> {
                            System.out.println("Bye, bye!");
                            menu_status = false;
                        }
                        
                        default -> System.out.println("Invalid option. Try again.");
                    }
                }   }
    }
}
