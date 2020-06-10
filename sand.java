import greenfoot.*;

/**
 * Write a description of class sand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sand extends tile
{
    public sand()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-50, image.getHeight()-50);
        setImage(image);
    }
    private int direction = 2;
    public void Move()
    {
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        move(direction);
    }
    
    /**
     * Act - do whatever the sand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
    }    
}
