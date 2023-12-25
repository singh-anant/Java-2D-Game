package com.async.gaming;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class GameBoard extends JPanel {
    BufferedImage backGroundImage;
    public GameBoard(){
      setSize(1500,920);
      loadBackGroundImage();
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
    @Override
    public void paintComponent(Graphics pen){
//        All painting logic will be written here
        super.paintComponent(pen);//cleaning up everything
        pen.drawImage(backGroundImage,0,0,1500,920,null);

    }
}
