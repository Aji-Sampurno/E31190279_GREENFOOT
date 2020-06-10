import greenfoot.*; 

/**
 * Write a description of class iglo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class iglo extends Ending
{
    public iglo()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /5, image.getHeight() /5);
        setImage(image);
    }
    
    public void Overiglo()
    {
        Actor iglo = this.getOneIntersectingObject(Cat.class);
       if( iglo != null)
       {
          this.getWorld().removeObject(iglo);
          World level1 = getWorld();
          Next2 next2 = new Next2();
          Back back = new Back();
          level1.addObject(next2,450,300);
          level1.addObject(back,74,48);
       }
    }

    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           Overiglo();
       } 
    }
    
    /**
     * Act - do whatever the iglo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();
    }    
}
