import greenfoot.*;

/**
 * Write a description of class dog2up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog2up extends level3A
{
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land1.class).isEmpty())
        {
           if (getX() == 407) speed = -1;
           if (getX() == 213) speed = 1;
           move(speed);
        }
    }
                                
        public void Overdog()
    {
        Actor dog2up = this.getOneIntersectingObject(Cat.class);
        if( dog2up != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dog2up);
           Retry3 retry3 = new Retry3();
           myWorld.addObject(retry3,450,300);
        } 
    }
    
    public dog2up()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    /**
     * Act - do whatever the dog2up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Overdog();
    }    
}
