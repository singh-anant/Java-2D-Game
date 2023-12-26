package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class EnemyRock extends Elements {


    public EnemyRock(){
        w=100;
        h=100;
        x=400;
        y=30;
        image=new ImageIcon(Player.class.getResource("rocks.gif"));
    }

}
