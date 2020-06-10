import greenfoot.*; 

/**
 * Write a description of class Back1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back1 extends menu
{
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    public Back1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /3, image.getHeight() /3);
        setImage(image);
    }
    public void control()
    {
        if(Greenfoot.mouseClicked(this))
        {
         Greenfoot.setWorld(new home());
         ((level1)getWorld()).backgroundSummer.stop();
        }
    }
    
    /**
     * Act - do whatever the Back1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();
    }    
}
