import greenfoot.*;  

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{
    GreenfootSound backgroundWinter = new GreenfootSound("Winter.mp3");
    public int score;
    /**
     * Constructor for objects of class level2.
     * 
     */
    public level2()
    {
        super(900, 600, 1); 
        prepare();
        score = 0;
        backgroundWinter.playLoop();
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
        Land2 land2 = new Land2();
        addObject(land2,507,567);
        land2.setLocation(190,590);

        Land2 land22 = new Land2();
        addObject(land22,529,397);
        land22.setLocation(556,590);

        dust dust = new dust();
        addObject(dust,276,322);
        dust dust2 = new dust();
        addObject(dust2,495,389);
        dust dust3 = new dust();
        addObject(dust3,632,268);
        dust dust4 = new dust();
        addObject(dust4,728,469);
        dust dust5 = new dust();
        addObject(dust5,312,236);
        dust dust6 = new dust();
        addObject(dust6,280,279);

        dust4.setLocation(759,485);
        dust2.setLocation(114,435);
        dust.setLocation(482,403);
        dust3.setLocation(732,288);
        dust5.setLocation(94,184);
        dust6.setLocation(282,288);

        skeleton skeleton = new skeleton();
        addObject(skeleton,705,60);
        skeleton.setLocation(846,71);

        Cat cat = new Cat();
        addObject(cat,348,397);
        cat.setLocation(42,515);

        Fish fish = new Fish();
        addObject(fish,113,312);
        Fish fish2 = new Fish();
        addObject(fish2,487,297);
        Fish fish3 = new Fish();
        addObject(fish3,142,113);
        Fish fish4 = new Fish();
        addObject(fish4,766,178);
        Fish fish5 = new Fish();
        addObject(fish5,310,197);

        fish.setLocation(179,375);
        fish5.setLocation(227,234);
        fish3.setLocation(187,130);
        fish2.setLocation(483,347);
        fish4.setLocation(816,237);

        dog1up dog1 = new dog1up();
        addObject(dog1,696,339);
        dog1 dog14 = new dog1();
        addObject(dog14,88,87);

        dog14.setLocation(21,105);
        dog1.setLocation(838,408);
        
        tomb tomb = new tomb();
        addObject(tomb,514,448);
        tomb.setLocation(864,575);
        tomb tomb2 = new tomb();
        addObject(tomb2,768,562);
        tomb2.setLocation(792,575);
    }
}
