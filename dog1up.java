import greenfoot.*;

/**
 * Write a description of class dog1up here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog1up extends level2A
{
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land1.class).isEmpty())
        {
           if (getX() == 658) speed = 1;
           if (getX() == 838) speed = -1;
           move(speed);
        }
    }
                                
        public void Overdog()
    {
        Actor dog1up = this.getOneIntersectingObject(Cat.class);
        if( dog1up != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dog1up);
           Retry2 retry2 = new Retry2();
           myWorld.addObject(retry2,450,300);
        } 
    }
    
    public dog1up()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    /**
     * Act - do whatever the dog1up wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Overdog();
    }    
}
