package com.bridgelabz;

import java.util.Scanner;

public class Main {

    static String board[];
    static String turn;
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
            board[a] = String.valueOf(a + 1);
        }
        board();
    }
}
