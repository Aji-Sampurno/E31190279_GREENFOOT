import greenfoot.*;

/**
 * Write a description of class dogup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dogup extends level1A
{
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land1.class).isEmpty())
        {
           if (getX() == 461) speed = -1;
           if (getX() == 259) speed = 1;
           move(speed);
        }
    }
                                
        public void Overdog()
    {
        Actor dogup = this.getOneIntersectingObject(Cat.class);
        if( dogup != null)
        {
           World myWorld = getWorld();
           myWorld.removeObject(dogup);
           Retry1 retry1 = new Retry1();
           myWorld.addObject(retry1,450,300);
        } 
    }
    
    public dogup()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    /**
     * Act - do whatever the dogup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
        Overdog();
    }    
}
