import greenfoot.*;

/**
 * Write a description of class dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dog extends level1A
{
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land2.class).isEmpty())
        {
           if (getX() == 882) speed = -1;
           if (getX() == 538) speed = 1;
           move(speed);
        }
    }
                                
        public void Overdog()
    {
        Actor dog = this.getOneIntersectingObject(Cat.class);
        if( dog != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dog);
           Retry1 retry1 = new Retry1();
           myWorld.addObject(retry1,450,300);
        } 
    }
    
    public dog()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    /**
     * Act - do whatever the dog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Overdog();
    }    
}
