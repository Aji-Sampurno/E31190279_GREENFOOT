import greenfoot.*;

/**
 * Write a description of class dog3up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog3up extends level4A
{
    private int direction = 2;
    private void move() 
    { 
        if ((direction < 0 && getX() == 0) || (direction > 0 && getX() == getWorld().getWidth()-1)) direction = -direction;  
        move(direction);            
    }
                                
        public void Overdog()
    {
        Actor dog3up = this.getOneIntersectingObject(Cat.class);
        if( dog3up != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dog3up);
           Retry4 retry4 = new Retry4();
           myWorld.addObject(retry4,450,300);
        } 
    }
    
    public dog3up()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    /**
     * Act - do whatever the dog3up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        Overdog();
    }    
}
