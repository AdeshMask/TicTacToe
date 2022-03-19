package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    static String board[];
    static String turn;
    static String winner = null;


    static void takeInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("First turn is User...enter slot no to place X");
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
                continue;
            }
        }
        System.out.println("no free space available");
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
        turn = "X";
        System.out.println("TicTacToe");
        for (int a = 0; a < 9; a++) {
            board[a] =String.valueOf(a+1);
        }
       // System.out.println("First turn is User...enter slot no to place X");
        board();
        takeInput();
    }
}