package com.async.gaming;

import javax.swing.*;

public class GameFrame extends JFrame {

    public GameFrame(){
        setSize(1500,950);
        setResizable(false);
        setVisible(true);
        setTitle("Run For It");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GameFrame();
    }
}
