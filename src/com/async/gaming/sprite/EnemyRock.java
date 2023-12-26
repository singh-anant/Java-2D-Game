package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class EnemyRock extends Elements {


    public EnemyRock(int x){
        w=200;
        h=200;
        this.x=x;
        y=30;
        image=new ImageIcon(Player.class.getResource("rocks.gif"));
    }

}
