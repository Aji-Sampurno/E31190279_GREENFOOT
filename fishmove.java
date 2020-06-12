import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fishmove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fishmove extends Actor
{
    public fishmove()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /11, image.getHeight() /11);
        setImage(image);
    }
    
    private int direction = 2;
    private void move() 
    { 
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        move(direction);            
    }
    
    /**
     * Act - do whatever the fishmove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
    }    
}
