package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class EnemyRock {

    int x;
    int y;
    int w;
    int h;
    ImageIcon enemyRockImage;
    public EnemyRock(){
        w=100;
        h=100;
        x=400;
        y=30;
        enemyRockImage=new ImageIcon(Player.class.getResource("rocks.gif"));
    }
    public void drawEnemyRock(Graphics pen){
        pen.drawImage(enemyRockImage.getImage(),x,y,w,h,null);
    }

}
