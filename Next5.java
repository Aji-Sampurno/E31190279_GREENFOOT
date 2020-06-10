import greenfoot.*;

/**
 * Write a description of class Next5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next5 extends NextLevel
{
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           this.getWorld().removeObject(this);
           End end = new End();
           Greenfoot.setWorld(end);
           Points.countercat=0;
           ((level4)getWorld()).background02.stop();
        }
    }
    public Next5()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /2, image.getHeight() /2);
        setImage(image);
    }
    /**
     * Act - do whatever the Next5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();
    }    
}
