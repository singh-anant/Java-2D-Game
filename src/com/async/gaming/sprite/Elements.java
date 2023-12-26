package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public abstract class Elements {
    int x;
    int y;
    int w;
    int h;
    ImageIcon image;

    public void drawElement(Graphics pen){
        pen.drawImage(image.getImage(),x,y,w,h,null);
    }
}


