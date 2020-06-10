import greenfoot.*;

/**
 * Write a description of class BackHomeend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackHomeend extends menu
{
    public BackHomeend()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    public void home()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((End)getWorld()).backgroundnom.stop();
            Greenfoot.setWorld(new home());
        }
    }
    /**
     * Act - do whatever the BackHomeend wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        home();
    }    
}
