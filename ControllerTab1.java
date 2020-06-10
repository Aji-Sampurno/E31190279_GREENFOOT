import greenfoot.*; 

/**
 * Write a description of class ControllerTab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControllerTab1 extends World
{
    GreenfootSound background05 = new GreenfootSound("05.mp3");
    /**
     * Constructor for objects of class ControllerTab1.
     * 
     */
    public ControllerTab1()
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
        BackHome backhome = new BackHome();
        addObject(backhome,671,389);
        backhome.setLocation(838,548);
        backhome.setLocation(831,63);
    }
}
