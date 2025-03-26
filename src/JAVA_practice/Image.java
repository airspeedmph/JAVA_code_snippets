package java_practice;


import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
public class Image {
    public static void main(String[] args) {
        try{
            File file = new File("\u202AC:\\Users\\SID\\OneDrive\\Desktop\\images.png");
            BufferedImage image=ImageIO.read(file);
        }
        catch(Exception e){
            System.out.println(" something went wrong ");
        }


    }
}
