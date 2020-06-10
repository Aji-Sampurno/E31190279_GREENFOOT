import greenfoot.*;

/**
 * Write a description of class Retry1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry1 extends NextLevel
{
    /**
     * Act - do whatever the Retry1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level1)getWorld()).backgroundSummer.stop();
           this.getWorld().removeObject(this);
           level1 level1 = new level1();
           Greenfoot.setWorld(level1);
           Points.countercat=0;
        }
    }    
}
