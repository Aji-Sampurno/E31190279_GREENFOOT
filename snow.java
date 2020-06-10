import greenfoot.*;

/**
 * Write a description of class snow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snow extends tile
{
    public snow()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 50);
        setImage(image);
    }
    /**
     * Act - do whatever the SnowCap1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
