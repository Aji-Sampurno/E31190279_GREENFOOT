import greenfoot.*;

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{
    GreenfootSound backgroundLit = new GreenfootSound("Lit.mp3");
    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {
        super(900, 600, 1); 
        prepare();
        backgroundLit.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Land3 land3 = new Land3();
        addObject(land3,642,541);
        land3.setLocation(191,586);

        Cat Cat = new Cat();
        addObject(Cat,348,240);
        Cat.setLocation(77,500);

        tree tree = new tree();
        addObject(tree,205,301);
        tree.setLocation(76,86);
        tree.setLocation(79,78);

        soil1 soil1 = new soil1();
        addObject(soil1,574,446);
        soil1.setLocation(535,595);

        soil soil = new soil();
        addObject(soil,705,364);
        soil soil2 = new soil();
        addObject(soil2,248,233);
        soil soil3 = new soil();
        addObject(soil3,692,218);
        soil soil4 = new soil();
        addObject(soil4,394,423);
        soil soil5 = new soil();
        addObject(soil5,475,176);
        soil soil6 = new soil();
        addObject(soil6,564,313);

        soil2.setLocation(115,138);
        soil.setLocation(890,491);
        soil4.setLocation(605,437);
        soil3.setLocation(303,365);
        soil5.setLocation(548,244);
        soil6.setLocation(303,138);
        
        Fish fish = new Fish();
        addObject(fish,335,50);
        Fish fish2 = new Fish();
        addObject(fish2,546,152);
        Fish fish3 = new Fish();
        addObject(fish3,312,274);
        Fish fish4 = new Fish();
        addObject(fish4,530,496);
        Fish fish5 = new Fish();
        addObject(fish5,584,340);
        
        fish4.setLocation(802,538);
        fish5.setLocation(584,378);
        fish2.setLocation(510,190);
        fish3.setLocation(344,312);
        fish.setLocation(279,83);
        
        dog2up dog22 = new dog2up();
        addObject(dog22,306,282);
        dog2 dog23 = new dog2();
        addObject(dog23,642,190);
        
        dog23.setLocation(614,166);
        dog22.setLocation(213,284);
    }
    
    
}
