import greenfoot.*;

/**
 * Write a description of class level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{
    GreenfootSound background02 = new GreenfootSound("02.mp3");
    /**
     * Constructor for objects of class level4.
     * 
     */
    public level4()
    {
        super(900, 600, 1); 
        prepare();
        background02.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Land4 land4 = new Land4();
        addObject(land4,455,564);
        Land4 land43 = new Land4();
        addObject(land43,616,400);

        land4.setLocation(112,120);
        land43.setLocation(880,120);

        Cat Cat = new Cat();
        addObject(Cat,279,400);
        Cat.setLocation(77,45);

        bush bush = new bush();
        addObject(bush,319,157);
        bush.setLocation(77,529);

        sand sand = new sand();
        addObject(sand,643,283);
        sand sand2 = new sand();
        addObject(sand2,528,353);
        sand sand3 = new sand();
        addObject(sand3,592,499);

        sand.setLocation(364,236);
        sand2.setLocation(804,364);
        sand3.setLocation(158,480);

        Land4 land42 = new Land4();
        addObject(land42,595,443);
        Land4 land44 = new Land4();
        addObject(land44,353,564);

        land42.setLocation(712,595);
        land44.setLocation(96,595);

        dog3 dog3 = new dog3();
        addObject(dog3,749,439);
        dog3.setLocation(847,521);

        stone stone = new stone();
        addObject(stone,448,428);
        stone stone2 = new stone();
        addObject(stone2,433,505);
        stone stone3 = new stone();
        addObject(stone3,362,548);
        stone stone4 = new stone();
        addObject(stone4,426,515);

        stone.setLocation(486,585);
        stone2.setLocation(433,584);
        stone3.setLocation(320,585);
        stone4.setLocation(376,586);
        
        fishmove fishmove = new fishmove();
        addObject(fishmove,693,275);
        fishmove fishmove2 = new fishmove();
        addObject(fishmove2,403,179);
        fishmove fishmove3 = new fishmove();
        addObject(fishmove3,188,377);
        fishmove fishmove4 = new fishmove();
        addObject(fishmove4,647,499);
        Fish Fish5 = new Fish();
        addObject(Fish5,818,38);
        
        Fish5.setLocation(824,72);
        fishmove.setLocation(762,313);
        fishmove4.setLocation(600,547);
        fishmove3.setLocation(111,426);
        fishmove2.setLocation(282,180);
    }
}
