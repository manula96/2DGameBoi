package com.fanatic.jgame;

import javax.swing.*;

public class Window extends JFrame {

    public Window(){

        setTitle("Game Boi");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(new GamePanel(1280,722));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
