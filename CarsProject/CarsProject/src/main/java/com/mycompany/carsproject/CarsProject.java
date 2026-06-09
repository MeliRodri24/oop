/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carsproject;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author ciudadela de pasto
 */
public class CarsProject {
    
    public static void mainMenu(){                
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Users 
                           [2]. Cities 
                           [3]. Brands 
                           [4]. Vehicles 
                           [5]. Exit 
                           .::: Press an option: """);
    }         
    public static void UsersMainMenu(){   
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Create/register users 
                           [2]. List users 
                           [3]. Search user 
                           [4]. Update user 
                           [5]. Delete user 
                           [6]. Back to main menu 
                           .::: Press an option: """);
    }      
    public static void CitiesMainMenu(){
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Create/register city 
                           [2]. List cities 
                           [3]. Search city 
                           [4]. Update city 
                           [5]. Delete city 
                           [6]. Back to main menu 
                           .::: Press an option: """);
        
    }
    public static void BrandsMainMenu(){
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Create/register brands 
                           [2]. List brands 
                           [3]. Search brand 
                           [4]. Update brand 
                           [5]. Delete brand 
                           [6]. Back to main menu 
                           .::: Press an option: """);
    }
    public static void VehiclesMainMenu(){
        System.out.println("""
                           ::: MAIN MENU :::
                           [1]. Create/register vehicle 
                           [2]. List vehicles 
                           [3]. Search vehicle 
                           [4]. Update vehicle 
                           [5]. Delete vehicle 
                           [6]. Back to main menu 
                           .::: Press an option: """);
    }
            
    public static void main(String[] args) {

        ArrayList<Users> users = new ArrayList<>();
        Scanner data = new Scanner(System.in);
        
        boolean menu_status = true;
        boolean users_menu_status;

        int opt;

        while (menu_status) {

            mainMenu();
            
            
            opt = Integer.parseInt(data.nextLine());

            switch (opt) {

                case 1 -> {
                    users_menu_status = true;

                    while (users_menu_status) {
 
                        UsersMainMenu();
                        
                        String entrada = data.nextLine();
                        opt = Integer.parseInt(entrada);

                        switch (opt) {

                            case 1 -> {
                                System.out.println("\n::: CREATE NEW USER :::");
                               
                                
                                    System.out.print("ID: ");
                                    int id = Integer.parseInt(data.nextLine());

                                    System.out.print("First Name: ");
                                    String first_name = data.nextLine();

                                   System.out.print("Last Name: ");
                                   String last_name = data.nextLine();

                                   System.out.print("Email: ");
                                   String email = data.nextLine();

                                   System.out.print("Mobile Phone: ");
                                   String mobile_phone = data.nextLine();

                                   System.out.print("Address: ");
                                   String address = data.nextLine();

                                   System.out.print("Age: ");
                                   int age = Integer.parseInt(data.nextLine());

                                   System.out.print("Identification Number: ");
                                   String identNumber = data.nextLine();

                                    System.out.print("Birth Date (YYYY-MM-DD): ");
                                    LocalDate birthDate =
                                    LocalDate.parse(data.nextLine());

                                    System.out.print("City ID: ");
                                    int cityId =
                                    Integer.parseInt(data.nextLine());

                                    System.out.print("Status: ");
                                    String status = data.nextLine();

                                    Users user = new Users(
                                    id,
                                    first_name,
                                    last_name,
                                    email,
                                    mobile_phone,
                                    address,
                                    age,
                                    identNumber,
                                    birthDate,
                                    cityId,
                                    status
                                    );



                                users.add(user);
                                System.out.println("Total users: " + users.size());   
                                System.out.println("\nUser registered successfully.");
                                
                                break;
                            }
             
                            case 2 -> {
                                
                                
                            
                            System.out.println("\n::: USERS LIST :::");

                            System.out.println("Cantidad usuarios: " + users.size());

                            for (int i = 0; i < users.size(); i++) {

                                 System.out.println("Usuario #" + (i + 1));

                                 Users u = users.get(i); 

                                 System.out.println("Nombre: " + u.getFirstName());
                                 System.out.println("Apellido: " + u.getLastName());
                                 System.out.println("Correo: " + u.getEmail());

                                 System.out.println("----------------");
                            }

                                 break;
                            }    
                            case 3 ->{
                                   System.out.print("Enter identification number: ");
                                   String searchId = data.nextLine();

                                   boolean found = false;

                                   for (Users u : users) {

                                       if (u.getIdentNumber().equals(searchId)) {

                                       u.listUsers();
                                       found = true;
                                       break;
                                       }
                                    }

                                    if (!found) {
                                        System.out.println("User not found.");
                                    }

                                    break;
                            }
                            
                            case 4 -> {
                                           
                                System.out.print("Enter identification number: ");
                                String updateId = data.nextLine();

                                boolean updated = false;

                                for (Users u : users) {

                                    if (u.getIdentNumber().equals(updateId)) {

                                        updated = true;

                                        System.out.println("\n::: UPDATE USER :::");
                                        System.out.println("[1]. First Name");
                                        System.out.println("[2]. Last Name");
                                        System.out.println("[3]. Email");
                                        System.out.println("[4]. Mobile Phone");
                                        System.out.println("[5]. Address");
                                        System.out.print("Select an option: ");

                                        int updateOption = data.nextInt();
                                        data.nextLine();

                                    switch (updateOption) {

                                        case 1:
                                            System.out.print("New First Name: ");
                                            String newFirstName = data.nextLine();
                                            u.setFirstName(newFirstName);
                                            System.out.println("First Name updated successfully.");
                                            break;

                                        case 2:
                                            System.out.print("New Last Name: ");
                                            String newLastName = data.nextLine();
                                            u.setLastName(newLastName);
                                            System.out.println("Last Name updated successfully.");
                                            break;

                                        case 3:
                                            System.out.print("New Email: ");
                                            String newEmail = data.nextLine();
                                            u.setEmail(newEmail);
                                            System.out.println("Email updated successfully.");
                                            break;

                                        case 4:
                                            System.out.print("New Mobile Phone: ");
                                            String newPhone = data.nextLine();
                                            u.setMobilePhone(newPhone);
                                            System.out.println("Mobile Phone updated successfully.");
                                            break;

                                        case 5:
                                            System.out.print("New Address: ");
                                            String newAddress = data.nextLine();
                                            u.setAddress(newAddress);
                                            System.out.println("Address updated successfully.");
                                            break;

                                        default:
                                                System.out.println("Invalid option.");
                                                break;
                                    }

                                        break;
                                       }
                                  }

                                    if (!updated) {
                                    System.out.println("User not found.");
                                    }

                                     break;              
                            }
                            case 5 ->{
                                System.out.print("Enter identification number: ");
                                String deleteId = data.nextLine();

                                boolean deleted = false;

                                for(int i = 0; i < users.size(); i++){

                                    if(users.get(i).getIdentNumber().equals(deleteId)){

                                        users.remove(i);

                                        System.out.println("User deleted.");
                                        deleted = true;
                                        break;
                                    }

                                }

                               if(!deleted){
                                    System.out.println("User not found.");
                                }

    
                                break;
                            }
                            case 6 ->{
                                users_menu_status = false;
                                System.out.println("Returning to main menu...");
                                break;
                            }
                            default ->{
                                System.out.println("Invalid option.");
                                break;
                            }
                        }
                        
                    }
                }

                case 2 ->{
                    System.out.println("Cities module"); 
                    break;
                }
                case 3 ->{
                    System.out.println("Brands module"); 
                    break;
                }    
                case 4 ->{
                    System.out.println("Vehicles module"); 
                    break;
                }    
                case 5 -> {
                    System.out.println("Bye, bye");
                    menu_status = false;
                }

                default ->{
                    System.out.println("Invalid option. Try again.");
                    break;
                }    
} 

} 

data.close();

} 

} 

             
        