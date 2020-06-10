import greenfoot.*;  
/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends Ending
{
    public tree()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
    
    public void Overtree()
    {
        Actor tree = this.getOneIntersectingObject(Cat.class);
        if( tree != null)
        {
          this.getWorld().removeObject(tree);
          World level3 = getWorld();
          Next4 next4 = new Next4();
          Back2 back = new Back2();
          level3.addObject(next4,450,300);
          level3.addObject(back,74,48);
        }
    }
    
    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           Overtree();
       } 
    }
    
    /**
     * Act - do whatever the tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();
    }    
}
