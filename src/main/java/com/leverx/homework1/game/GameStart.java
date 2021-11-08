package com.leverx.homework1.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameStart {

    public static void main(String[] args) throws IOException {
        TicTacToePvE ticTacToePvE = new TicTacToePvE();
        TicTacToePvP ticTacToePvP = new TicTacToePvP();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The game TicTacToe starts");
        System.out.println("Please choose who you want to play with: \n1.Computer\n2.Human");
        Integer choiceNumber = Integer.valueOf(reader.readLine());
        if (choiceNumber == 1) {
            ticTacToePvE.startGamePvE();
        }
        if (choiceNumber == 2) {
            ticTacToePvP.startGamePvP();
        }
        reader.close();


    }
}
