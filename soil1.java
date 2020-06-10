import greenfoot.*;

/**
 * Write a description of class soil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class soil1 extends tile
{
    public soil1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 50);
        setImage(image);
    }
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(500, tree.class).isEmpty())
        {
           if (getX() == 535) speed = 1;
           if (getX() == 865) speed = -1;
           move(speed);
        }
    }
    
    /**
     * Act - do whatever the Bushh1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
    }    
}
