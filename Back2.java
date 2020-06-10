import greenfoot.*; 

/**
 * Write a description of class Back2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back2 extends menu
{
    public Back2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    public void control()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((level3)getWorld()).backgroundLit.stop();
            Greenfoot.setWorld(new home());
        }
    }
    
    /**
     * Act - do whatever the Back2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();
    }    
}
