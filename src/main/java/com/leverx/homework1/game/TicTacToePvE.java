package com.leverx.homework1.game;

import java.util.Random;
import java.util.Scanner;

public class TicTacToePvE {

    private static String[][] board = new String[3][3];
    private static int row, column;
    public static Scanner scan = new Scanner(System.in);
    public static String currentTurn = "X";


    public void startGamePvE() {
        welcome();
        initializeBoard();
        printBoard();

        while ((!checkWin()) && (!checkDraw())) {
            playerMove();
            if (checkWin()) {
                System.out.println("The winner is " + currentTurn);
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
            }
            printBoard();
            System.out.println("\nComputer is moving:");
            computerMove();
            if (checkWin()) {
                System.out.println("The winner is " + currentTurn);
                break;
            }
            if (checkDraw()) {
                System.out.println("Draw");
            }
            printBoard();
        }
    }


    public static String turn() {
        if (currentTurn == "X") {
            currentTurn = "O";
        } else {
            currentTurn = "X";
        }
        return currentTurn;
    }

    private static void welcome() {
        System.out.println("Tic Tac Toe");
        System.out.println("Please enter your coordinates for your location row (1-3) column (1-3):");
    }

    public static void initializeBoard() { // initialize tic tac toe
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = "-";
            }
        }
    }

    public static void printBoard() {

        for (String[] strings : board) {
            System.out.println();
            for (int j = 0; j < board.length; j++) {
                if (j == 0) {
                    System.out.print("| ");
                }
                System.out.print(strings[j] + " | ");
            }
        }
    }

    public static void playerMove() {
        System.out.println("\nPlease enter your position. Row and column: ");
        row = scan.nextInt() - 1;
        column = scan.nextInt() - 1;
        if (board[row][column] == "-") {
            board[row][column] = turn();
        } else {
            System.out.println("Invalid entry. Please go again");
            row = scan.nextInt() - 1;
            column = scan.nextInt() - 1;
            board[row][column] = turn();
        }
    }

    public static void computerMove() {
        Random computerMove = new Random();
        row = computerMove.nextInt(3);
        column = computerMove.nextInt(3);
        while (board[row][column] != "-") {
            row = computerMove.nextInt(3);
            column = computerMove.nextInt(3);
        }
        board[row][column] = turn();
    }

    public static boolean checkWin() {
        return (checkDiagonalWin() || checkHorizontalWin() || checkVerticalWin());
    }

    public static boolean checkDiagonalWin() {
        if ((board[0][0] == board[1][1]) && (board[0][0] == board[2][2]) && (board[1][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][1]) && (board[0][2] == board[2][0]) && (board[1][1] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkHorizontalWin() {
        if ((board[0][0] == board[0][1]) && (board[0][0] == board[0][2]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[1][0] == board[1][1]) && (board[1][0] == board[1][2]) && (board[1][0] != "-")) {
            return true;
        }
        if ((board[2][0] == board[2][1]) && (board[2][0] == board[2][2]) && (board[2][0] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkVerticalWin() {
        if ((board[0][0] == board[1][0]) && (board[0][0] == board[2][0]) && (board[0][0] != "-")) {
            return true;
        }
        if ((board[0][1] == board[1][1]) && (board[0][1] == board[2][1]) && (board[0][1] != "-")) {
            return true;
        }
        if ((board[0][2] == board[1][2]) && (board[0][2] == board[2][2]) && (board[0][2] != "-")) {
            return true;
        }
        return false;
    }

    public static boolean checkDraw() {
        for (String[] strings : board) {
            for (int j = 0; j < board.length; j++) {
                if (strings[j] == "-") {
                    return false;
                }
            }
        }
        return true;
    }
}
