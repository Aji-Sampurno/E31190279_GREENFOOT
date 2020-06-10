import greenfoot.*;

/**
 * Write a description of class ControllerTab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControllerTab extends World
{
    GreenfootSound background05 = new GreenfootSound("05.mp3");
    /**
     * Constructor for objects of class ControllerTab.
     * 
     */
    public ControllerTab()
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
        nextct next = new nextct();
        addObject(next,700,90);
        next.setLocation(831,63);
    }
}
