import greenfoot.*;  

/**
 * Write a description of class skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skeleton extends Ending
{
    public skeleton()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
    
    public void Overskeleton()
    {
        Actor skeleton = this.getOneIntersectingObject(Cat.class);
        if( skeleton != null)
        {
          this.getWorld().removeObject(skeleton);
          World level2 = getWorld();
          Next3 next3 = new Next3();
          Back2 back = new Back2();
          level2.addObject(next3,450,300);
          level2.addObject(back,74,48);
        }
    }
    private int speed = 1;
    public void Move()
    {
        if (getObjectsInRange(200, Land2.class).isEmpty())
        {
           if (getX() == 200) speed = 1;
           if (getX() == 865) speed = -1;
           move(speed);
        }
    }
    
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           Overskeleton();
       } 
    }
    
    /**
     * Act - do whatever the skeleton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();
        Move();
    }    
}
