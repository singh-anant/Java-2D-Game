package com.async.gaming;

import javax.swing.*;

public class GameFrame extends JFrame {
GameBoard gameBoard;
    public GameFrame(){
        gameBoard=new GameBoard();
        setSize(1500,950);
        setResizable(false);
        setVisible(true);
        setTitle("Run For It");
        setLocationRelativeTo(null);
        add(gameBoard);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GameFrame();
    }
}
