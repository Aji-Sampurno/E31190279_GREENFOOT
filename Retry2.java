import greenfoot.*;

/**
 * Write a description of class Retry2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry2 extends NextLevel
{
    /**
     * Act - do whatever the Retry2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level2)getWorld()).backgroundWinter.stop();
           this.getWorld().removeObject(this);
           level2 level2 = new level2();
           Greenfoot.setWorld(level2);
           Points.countercat=0;
        }
    }    
}
