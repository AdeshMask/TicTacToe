package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static String board[];
    static String turn;
    static String winner = null;


    static void takeInput(){
        Scanner in = new Scanner(System.in);
        int toss = (int) Math.floor(Math.random() * 2);
        System.out.print("After Making toss ");
        if (toss < .5){
            System.out.println("User Play first");
            turn = "X";
        }
        else {
            System.out.println("Computer Play first");
            turn = "O";
        }
        while (winner == null) {
            System.out.println("Enter Slot number");
            int numInput = in.nextInt();;

            if (!(numInput > 0 && numInput <= 9)) {
                System.out.println("Invalid input; re-enter slot number:");
                continue;
            }

            if (board[numInput - 1].equals(String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                board();
            }
            else {
                System.out.println("Slot already taken; re-enter slot number:");
            }
        }
    }
    //Printing the TicTacToe Board.....
    static void board(){
        System.out.println("|-----------|");
        System.out.println("| "+board[0] + " | " +board[1] + " | " +board[2]+ " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        board = new String[9];
        System.out.println("TicTacToe");
        for (int a = 0; a < 9; a++) {
            board[a] =String.valueOf(a+1);
        }
        board();
        takeInput();
    }
}