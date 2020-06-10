import greenfoot.*;

/**
 * Write a description of class Retry4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Retry4 extends NextLevel
{
    /**
     * Act - do whatever the Retry4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level4)getWorld()).background02.stop();
           this.getWorld().removeObject(this);
           level4 level4 = new level4();
           Greenfoot.setWorld(level4);
           Points.countercat=0;
        }
    }    
}
