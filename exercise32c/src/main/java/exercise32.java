/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Jenna Busch
 */

import java.util.Scanner;
import java.util.Random;

public class exercise32 {

    public static void main(String[] args) {



        //create a scanner
        Scanner input = new Scanner(System.in);
        int play = 1;

        while(play == 1)
        {
            System.out.println("Let's play Guess the Number!\n");
            System.out.println("Enter the difficulty level (1, 2, or 3):");
            String l = input.next();
            int level = -1;
            while(!l.matches("[0-9]+$"))
            {
                System.out.println("That is not a number stupid idiot head cmon now.");
                l = input.next();
            }
            level = Integer.parseInt(l);
            int secretNum;

            if(level == 1)
            {
                secretNum = (int)(Math.random() * 10);
            }
            else if(level == 2)
            {
                secretNum = (int)(Math.random() * 100);
            }
            else if(level == 3)
            {
                secretNum = (int)(Math.random() * 1000);
            }
            else
            {
                System.out.println("Please enter a valid level and try again.");
                return;
            }

            System.out.println("I have my number. What's your guess?");
            int playerGuess = 0;
            int guessCount = 0;


            guessCount = 0;
            while(true)
            {
                String player = input.next();
                guessCount++;
                if(player.matches("[0-9]+$"))
                {
                    System.out.println("valid guess");
                    playerGuess = Integer.parseInt(player);
                }
                else
                {
                    System.out.println("invalid guess");
                    continue;
                }

                if(playerGuess<secretNum)
                {
                    System.out.println("Too low. Guess again:");
                }
                else if(playerGuess>secretNum)
                {
                    System.out.println("Too high. Guess again:");
                }
                else if(playerGuess == secretNum)
                {
                    System.out.println("You got it in "+guessCount+" guesses!");
                    break;
                }
            }

            System.out.println("Do you wish to play again? (Y/N)");
            String toPlay = input.next();
            if(toPlay.equals("Y"))
            {
                play = 1;
            }
            else
            {
                play = 0;
            }
        }

    }
}




