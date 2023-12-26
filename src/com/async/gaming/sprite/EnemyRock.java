package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class EnemyRock extends Elements {


    public EnemyRock(int x,int speed){
        w=200;
        h=200;
        this.speed=speed;
        this.x=x;
        y=30;
        image=new ImageIcon(Player.class.getResource("rocks.gif"));
    }

    public void moveImage(){
        if(y>900)
            y=0;
        y+=speed;
    }

}
