/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.rolldices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class RollDices {

    public static int rollDices() {
        Random random = new Random();
        return random.nextInt(6) + 1;

    }

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        int lives = 5, dice1, dice2;
        String player_name;

        System.out.println(":::: WELCOME TO ROLL DICE ::::");
        System.out.println("Your player name");
        player_name = data.nextLine();
        System.out.println(" \n Press any key to roll dices !!!");

        dice1 = rollDices();
        dice2 = rollDices();

        System.out.println("Player name: " + player_name);
        System.out.println("Player lives: " + lives);
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);

        int total_launch = 0;
        int even_sum = 0;
        int odd_sum = 0;
        int equal_dices = 0;
        int consecutive_equal = 0;

        int sum = dice1 + dice2;

        if (sum % 2 == 0) {
            even_sum++;
        } else {
            odd_sum++;
            lives--;
        }

        if (dice1 == 6 && dice2 == 6) {
            lives++;
        }

        if (dice1 == dice2) {
            equal_dices++;
            consecutive_equal = 1;
        }

        boolean status = true;

        while (lives > 0 && status) {
            System.out.println("\n Press ENTER to roll dices...");
            data.nextLine();

            total_launch++;

            dice1 = rollDices();
            dice2 = rollDices();

            sum = dice1 + dice2;

            System.out.println("\nLaunch #" + total_launch);
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Sum: " + sum);

            if (sum % 2 == 0) {
                even_sum++;
                System.out.println("Even sum");
            } else {
                odd_sum++;
                lives--;
                System.out.println("Odd sum - You lose one life");
            }
            if (dice1 == 6 && dice2 == 6) {
                lives++;
                System.out.println("Double six! You gain one life");
            }
            if (dice1 == dice2) {

                equal_dices++;
                consecutive_equal++;

                System.out.println("Equal dices consecutively: " + consecutive_equal);

                if (consecutive_equal == 3) {
                    System.out.println("\nYOU WIN");
                    status = false;
                }

            } else {
                consecutive_equal = 0;
            }

            System.out.println("Lives: " + lives);
        }
        if (lives == 0) {
            System.out.println("\nGAME OVER");
        }

        System.out.println("\n===== FINAL REPORT =====");
        System.out.println("Player: " + player_name);
        System.out.println("Total launches: " + total_launch);
        System.out.println("Even sums: " + even_sum);
        System.out.println("Odd sums: " + odd_sum);
        System.out.println("Equal dices: " + equal_dices);

        data.close();

    }

}

