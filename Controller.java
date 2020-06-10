import greenfoot.*; 

/**
 * Write a description of class Controller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controller extends menu
{
    public Controller()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
    
    public void control()
    {
        if(Greenfoot.mouseClicked(this))
        {
           ((home)getWorld()).background03.stop();
           Greenfoot.setWorld(new ControllerTab());
        }
    }
    
    /**
     * Act - do whatever the Controller wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        control();
    }    
}
