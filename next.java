import greenfoot.*;

/**
 * Write a description of class next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class next extends NextLevel
{
    public next()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    public void next()
    {
        if(Greenfoot.mouseClicked(this))
        {
           Greenfoot.setWorld(new ControllerTab1());
        }
    }
    /**
     * Act - do whatever the next wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        next();
    }    
}
