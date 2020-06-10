import greenfoot.*;

/**
 * Write a description of class dog3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog3 extends level4A
{
    private int direction = 2;
    private void move() 
    { 
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        move(direction);            
    }
                                
        public void Overdog()
    {
        Actor dog3 = this.getOneIntersectingObject(Cat.class);
        if( dog3 != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dog3);
           Retry4 retry4 = new Retry4();
           myWorld.addObject(retry4,450,300);
        } 
    }
    
    public dog3()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    /**
     * Act - do whatever the dog3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        Overdog();
    }    
}
