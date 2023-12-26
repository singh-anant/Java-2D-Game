package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public class Player extends Elements {

public Player(){
    w=200;
    h=300;
    x=200;
    y=460;
    image=new ImageIcon(Player.class.getResource("PlayerImage.gif"));
}


}
