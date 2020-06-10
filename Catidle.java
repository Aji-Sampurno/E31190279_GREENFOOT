import greenfoot.*;

/**
 * Write a description of class Catidle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Catidle extends Actor
{
    private GifImage gif = new GifImage("Idle.gif");
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gif.getCurrentImage());
    }   
}
