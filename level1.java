import greenfoot.*;  

/**
 * Write a description of class level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1 extends World
{
    GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    public int score;
    /**
     * Constructor for objects of class level1.
     * 
     */
    public level1()
    {    
        super(900, 600, 1);
        score = 0;
        backgroundSummer.playLoop();
        prepare();
    }   

    private void showScore()
    {
        showText("Score: " + score, 80, 25);
    }
    
    public void addScore(int points)
    {
        score = score + 20; 
        showScore();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        iglo iglo = new iglo();
        addObject(iglo,827,313);
        iglo.setLocation(834,533);

        Land1 land1 = new Land1();
        addObject(land1,342,467);
        land1.setLocation(47,584);

        Land1 land12 = new Land1();
        addObject(land12,685,536);
        land12.setLocation(709,584);

        /*Igloo igloo = new Igloo();
        addObject(igloo,672,363);
        igloo.setLocation(834,533);*/

        Cat cat = new Cat();
        addObject(cat,362,361);
        cat.setLocation(43,506);

        snow snow = new snow();
        addObject(snow,472,487);
        snow.setLocation(369,487);

        snow snow2 = new snow();
        addObject(snow2,562,345);
        snow2.setLocation(621,384);

        snow snow3 = new snow();
        addObject(snow3,396,269);
        snow3.setLocation(358,264);

        snow snow4 = new snow();
        addObject(snow4,216,367);
        snow4.setLocation(114,387);

        snow snow5 = new snow();
        addObject(snow5,534,417);
        snow5.setLocation(899,451);

        Fish fish = new Fish();
        addObject(fish,580,220);
        Fish fish2 = new Fish();
        addObject(fish2,320,127);
        Fish fish3 = new Fish();
        addObject(fish3,130,234);
        Fish fish4 = new Fish();
        addObject(fish4,843,287);
        Fish fish5 = new Fish();
        addObject(fish5,665,467);
        fish3.setLocation(40,325);
        fish2.setLocation(322,156);
        fish2.setLocation(314,203);
        fish.setLocation(549,329);
        fish4.setLocation(868,395);
        fish5.setLocation(553,538);

        dog dog = new dog();
        addObject(dog,662,437);
        dogup dog3 = new dogup();
        addObject(dog3,385,159);
        dog.setLocation(538,505);
        dog3.setLocation(461,184);
        
        water water = new water();
        addObject(water,285,594);
        water water1 = new water();
        addObject(water1,378,594);
        water water2 = new water();
        addObject(water2,471,594);
    }
    
}
