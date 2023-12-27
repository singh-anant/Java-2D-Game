package com.async.gaming.sprite;

import javax.swing.*;

public class Player extends Elements {

public Player(){
    w=200;
    h=300;
    x=200;
    y=500;
    image=new ImageIcon(Player.class.getResource("PlayerImage2.gif"));
}
public void moveImage(){
    x+=speed;
}

public boolean reachedEnd(){
    return x>1500;
}

}
