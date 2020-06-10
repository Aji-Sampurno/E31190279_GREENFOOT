import greenfoot.*;

/**
 * Write a description of class Next4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next4 extends NextLevel
{
    public void Start()
    {
       if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level3)getWorld()).backgroundLit.stop();
           this.getWorld().removeObject(this);
           level4 level4 = new level4();
           Greenfoot.setWorld(level4);
        }
       if(Greenfoot.isKeyDown("backspace"))
        {
           ((level3)getWorld()).backgroundLit.stop();
           home home = new home();
           Greenfoot.setWorld(home);
        }
    }
    /**
     * Act - do whatever the Next4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();
    }     
}
