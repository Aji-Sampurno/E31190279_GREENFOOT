import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class home here.
 * 
 * @author aji sampurno 
 * @version (a version number or a date)
 */
public class home extends World
{
    GreenfootSound background03 = new GreenfootSound("03.mp3");
    /**
     * Constructor for objects of class Winter.
     * 
     */
    public home()
    {
        super(900, 600, 1);
        prepare();
        background03.playLoop();
    }
    
    public void Start()
    {
       if (Greenfoot.isKeyDown("space")) 
       {
           Greenfoot.setWorld(new level1());
           background03.stop();
           Points.countercat=0;
       }
    }
    
    public void act()
    {
        Start();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Controller controller = new Controller();
        addObject(controller,332,330);
        controller.setLocation(846,61);
        
        Start Start = new Start();
        addObject(Start,0,0);
        Start.setLocation(450,533);
        
        Catidle cat = new Catidle();
        addObject(cat,0,0);
        cat.setLocation(96,471);
        
        dogidle dogidle = new dogidle();
        addObject(dogidle,0,0);
        dogidle.setLocation(791,471);
        
        info info = new info();
        addObject(info,748,64);
        info.setLocation(734,61);
    }
}
