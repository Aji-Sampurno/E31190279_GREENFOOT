import greenfoot.*;

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends menu
{
    public info()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    public void info()
    {
        if(Greenfoot.mouseClicked(this))
        {
           ((home)getWorld()).background03.stop();
           Greenfoot.setWorld(new infotab());
        }
    }
    
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        info();
    }    
}
