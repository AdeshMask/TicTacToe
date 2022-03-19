package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static String board[];
    static String turn;
    static String winner = null;
//===================================================================
    static void takeInput(){
        int toss = (int) Math.floor(Math.random() * 2);
        System.out.print("After Making toss ");
        if (toss < .5){
            System.out.println("Head .... User(X) will Play first");
            turn = "X";
        }
        else {
            System.out.println("Tail .... Computer(O) will Play first");
            turn = "O";
        }
        while (winner == null) {
            Scanner in = new Scanner(System.in);
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
                winner=checkWinner();
            }
            else {
                System.out.println("Slot already taken; re-enter slot number:");
            }
        }
        if (winner.equalsIgnoreCase("Tie")) {
            System.out.println(
                    "It's a Tie! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner + "'s have won! Thanks for playing.");
        }

    }

//=========================================================================================
    static String checkWinner()
    {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            }

            else if (line.equals("OOO")) {
                return "O";
            }
        }
        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "Tie";
            }
        }
        System.out.println("Change the Turn to " +turn);
        return null;
    }
    //==================================================================================//
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
//======================================================================================
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