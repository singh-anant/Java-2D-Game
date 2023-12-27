package com.async.gaming.sprite;

import javax.swing.*;
import java.awt.*;

public abstract class Elements {
    int x;
    int y;
    int w;
    int h;
    ImageIcon image;
    int speed;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }



    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public void drawElement(Graphics pen){
        pen.drawImage(image.getImage(),x,y,w,h,null);
    }
}


