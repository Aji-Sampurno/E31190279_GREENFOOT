import greenfoot.*;
import java.io.*;
import javax.swing.*;
/**
 * Write a description of class End here.
 * 
 * @author aji sampurno
 * @version (a version number or a date)
 */
public class End extends World
{
    GreenfootSound backgroundnom = new GreenfootSound("nom1.mp3");
    /**
     * Constructor for objects of class End.
     * 
     */
    public End()
    {   
        super(900, 600, 1); 
        prepare();
        showPoint();
        backgroundnom.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void showPoint()
    {
       if(Points.countercat>Points.point)
       {
           Points.point=Points.countercat;
       }
       showText("Score: " + Points.countercat, 117, 201);
       showText("Top Score: " + Points.countercat, 791, 162);
    }
    private void prepare()
    {
        BackHomeend back = new BackHomeend();
        addObject(back,412,199);
        back.setLocation(73,44);
    }
}
