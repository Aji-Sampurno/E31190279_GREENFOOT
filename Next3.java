import greenfoot.*;

/**
 * Write a description of class Next3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next3 extends NextLevel
{
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level2)getWorld()).backgroundWinter.stop();
           this.getWorld().removeObject(this);
           level3 level3 = new level3();
           Greenfoot.setWorld(level3);
        }
       if(Greenfoot.isKeyDown("backspace"))
        {
           ((level2)getWorld()).backgroundWinter.stop();
           home home = new home();
           Greenfoot.setWorld(home);
        }
    }
    /**
     * Act - do whatever the Next3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();
    }    
}
