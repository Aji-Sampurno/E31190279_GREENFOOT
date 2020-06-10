import greenfoot.*;

/**
 * Write a description of class bush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bush extends Ending
{
    public void Overbush()
    {
        Actor bush = this.getOneIntersectingObject(Cat.class);
        if( bush != null)
        {
          this.getWorld().removeObject(bush);
          World level4 = getWorld();
          Back3 back = new Back3();
          Next5 next5 = new Next5();
          level4.addObject(next5,450,300);
          level4.addObject(back,74,48);
        }
    }
    
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           Overbush();
       } 
    }
    
    public bush()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-20, image.getHeight()-20);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Nyaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       EndGame();
    }    
}
