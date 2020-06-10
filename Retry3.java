import greenfoot.*;

/**
 * Write a description of class Retry3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry3 extends NextLevel
{
    /**
     * Act - do whatever the Retry3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level3)getWorld()).backgroundLit.stop();
           this.getWorld().removeObject(this);
           level3 level3 = new level3();
           Greenfoot.setWorld(level3);
           Points.countercat=0;
        }
    }    
}
