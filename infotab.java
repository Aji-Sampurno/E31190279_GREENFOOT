import greenfoot.*;  

/**
 * Write a description of class infotab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class infotab extends World
{
    GreenfootSound background05 = new GreenfootSound("05.mp3");
    /**
     * Constructor for objects of class infotab.
     * 
     */
    public infotab()
    {    
        super(900, 600, 1);
        prepare();
        background05.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackHomei backHome = new BackHomei();
        addObject(backHome,765,218);
        backHome.setLocation(835,82);
    }
}
