package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class Player {
int x;
int y;
int w;
int h;
ImageIcon playerImage;
public Player(){
    w=200;
    h=300;
    x=200;
    y=460;
    playerImage=new ImageIcon(Player.class.getResource("PlayerImage.gif"));
}

public void drawPlayer(Graphics pen){
    pen.drawImage(playerImage.getImage(),x,y,w,h,null);
}

}
