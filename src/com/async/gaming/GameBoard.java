package com.async.gaming;

import com.async.gaming.sprite.EnemyRock;
import com.async.gaming.sprite.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GameBoard extends JPanel {
    BufferedImage backGroundImage;
    Player player;
    EnemyRock[] enemyRocks =new EnemyRock[5];
    Timer timer;
    public GameBoard(){
      setSize(1500,920);
      loadBackGroundImage();
        loadMultipleRocks();
      player=new Player();
      gameLoop();
    }

    public void loadMultipleRocks(){
        int x=400;
        int gap=300;
        for (int i = 0; i < enemyRocks.length; i++) {
            enemyRocks[i]=new EnemyRock(x);
            x+=gap;
        }
    }

    private void loadBackGroundImage(){
        try {
            backGroundImage=ImageIO.read(GameBoard.class.getResource("bg2.jpg"));
        }
        catch (IOException ioException){
            System.out.println("Not Found");
            System.exit(1);
            ioException.printStackTrace();
        }
    }

    private void gameLoop(){
//        Repaint is going to call paintComponent() function
        timer=new Timer(50,(e)->repaint());
        timer.start();
    }

    private void printRockEnemies(Graphics pen){
   for(EnemyRock enemyRock :enemyRocks)
       enemyRock.drawElement(pen);
    }
    @Override
    public void paintComponent(Graphics pen){
//        All painting logic will be written here
        super.paintComponent(pen);//cleaning up everything
        pen.drawImage(backGroundImage,0,0,1500,920,null);
        player.drawElement(pen);
        printRockEnemies(pen);
//        enemyRock.drawElement(pen);
    }
}
