package com.async.gaming;

import com.async.gaming.sprite.EnemyRock;
import com.async.gaming.sprite.Player;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GameBoard extends JPanel {
    BufferedImage backGroundImage;
    Player player;
    EnemyRock[] enemyRocks =new EnemyRock[3];
    Timer timer;
    public GameBoard(){
      setSize(1500,920);
      loadBackGroundImage();
        loadMultipleRocks();
      player=new Player();
      gameLoop();
      bindEvents();
      setFocusable(true);
    }

    public void loadMultipleRocks(){
        int x=400;
        int gap=350;
        int speed=5;
        for (int i = 0; i < enemyRocks.length; i++) {
            enemyRocks[i]=new EnemyRock(x,speed);
            x+=gap;
            speed+=5;
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
   for(EnemyRock enemyRock :enemyRocks){
       enemyRock.drawElement(pen);
       enemyRock.moveImage();
   }
    }

   private void bindEvents(){
       addKeyListener(new KeyListener() {
           @Override
           public void keyTyped(KeyEvent e) {

           }

           @Override
           public void keyPressed(KeyEvent e) {
               if(e.getKeyCode()==KeyEvent.VK_LEFT){
                   player.setSpeed(-5);
//                   System.out.println("left");
               }
               else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                   player.setSpeed(5);
//                   System.out.println("right");

               }
           }

           @Override
           public void keyReleased(KeyEvent e) {

           }
       });

    }

    private void gameOver(Graphics pen){
        if(player.reachedEnd()){
            pen.setFont(new Font("times",Font.BOLD,40));
            pen.setColor(Color.GREEN);
            pen.drawString("YOU HAVE WON",1500/2,900/2);
            timer.stop();
            return;
        }

        for (EnemyRock enemyRock :
                enemyRocks) {
            if(isCollided(enemyRock)){
                pen.setFont(new Font("times",Font.BOLD,40));
                pen.setColor(Color.RED);
                pen.drawString("GAME IS OVER",1500/2,900/2);
                timer.stop();
            }
        }
    }

    private boolean isCollided(EnemyRock enemyRock){
        int xDistance=Math.abs(player.getX()-enemyRock.getX());
        int yDistance=Math.abs(player.getY()-enemyRock.getY());
        int maxHeight=Math.max(player.getH(),enemyRock.getH());
        int maxWidth=Math.max(player.getW(),enemyRock.getW());
        return xDistance<=maxWidth-163 && yDistance<=maxHeight-163;
    }
    @Override
    public void paintComponent(Graphics pen){
//        All painting logic will be written here
        super.paintComponent(pen);//cleaning up everything
        pen.drawImage(backGroundImage,0,0,1500,920,null);
        player.drawElement(pen);
        player.moveImage();
        printRockEnemies(pen);
        gameOver(pen);
//        enemyRock.drawElement(pen);
    }
}
