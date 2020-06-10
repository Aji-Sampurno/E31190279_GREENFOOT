import greenfoot.*;

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    public Fish()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /11, image.getHeight() /11);
        setImage(image);
        
    }
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }    
}
