import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nextct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nextct extends NextLevel
{
    public nextct()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    public void nextct()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ((ControllerTab)getWorld()).background05.stop();
            Greenfoot.setWorld(new ControllerTab1());
        }
    }
    /**
     * Act - do whatever the nextct wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        nextct();
    }    
}
