import greenfoot.*;

/**
 * Write a description of class BackHome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackHome extends menu
{
    public BackHome()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    public void home()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((ControllerTab1)getWorld()).background05.stop();
            Greenfoot.setWorld(new home());
        }
    }
    /**
     * Act - do whatever the BackHome wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        home();
    }    
}
