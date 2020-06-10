import greenfoot.*;

/**
 * Write a description of class BackHomei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackHomei extends menu
{
    public BackHomei()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    public void home()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((infotab)getWorld()).background05.stop();
            Greenfoot.setWorld(new home());
        }
    }
    /**
     * Act - do whatever the BackHomei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        home();
    }    
}
