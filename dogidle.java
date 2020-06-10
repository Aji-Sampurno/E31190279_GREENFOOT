import greenfoot.*;

/**
 * Write a description of class dogidle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dogidle extends Actor
{
    private GifImage gif = new GifImage("Idle1.gif");
    /**
     * Act - do whatever the dogidle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(gif.getCurrentImage());
    }       
}
