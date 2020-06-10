import greenfoot.*;  

/**
 * Write a description of class Next2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next2 extends NextLevel
{
    public void Start()
    {
        if(Greenfoot.isKeyDown("ENTER"))
        {
           ((level1)getWorld()).backgroundSummer.stop();
           this.getWorld().removeObject(this);
           level2 level2 = new level2();
           Greenfoot.setWorld(level2);
        }
        if(Greenfoot.isKeyDown("backspace"))
        {
           ((level1)getWorld()).backgroundSummer.stop();
           home home = new home();
           Greenfoot.setWorld(home);
        }
    }
    
    /**
     * Act - do whatever the Next2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Start();
    }    
}
