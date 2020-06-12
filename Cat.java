import greenfoot.*;

/**
 * Write a description of class cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    private final int gravity = 1;
    private int speed;
    int score=0;
    GreenfootSound eating = new GreenfootSound("Eat.mp3");
    private GifImage gif = new GifImage("run.gif");
    public Cat()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/5, image.getHeight()/5);
        setImage(image);
    }
    public void JUMP ()
    {
        speed = 0;
    }
        
    public void act() 
    {
       fall();
       walk(); 
       checkCollision();
       Point();
       dead();
       
    }
    public void Point()
    {
        getWorld().showText("Point: "+Points.countercat,826,48);
    }
    
    public void fall()
    {
        setLocation(getX(), getY()+ speed);
        if(isTouchLand())
        {
            speed = 0;
            while (isTouchLand())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else speed += gravity;
    }
    
    public void jump()
    {
        speed = -10;
    }
    
    public void walk()
    {
        int y= getY();
        int x= getX();
        if(Greenfoot.isKeyDown("RIGHT")) 
         {
             x+=3;
         }
        if(Greenfoot.isKeyDown("LEFT")) 
         {
             x-=3;
         }
        if(Greenfoot.isKeyDown("UP") && isTouchLand()) jump();
        setLocation(x, y);
    }
    
    public boolean isTouchLand()
    {
        boolean TouchLand= false;
        
        if (getY() > getWorld().getHeight()-20)TouchLand=true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,snow.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,snow.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,Land1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,Land1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,Land2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,Land2.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,Land3.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,Land3.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,Land4.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,Land4.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,dust.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,dust.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,soil.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,soil.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,soil1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,soil1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,sand.class)!=null ||
            getOneObjectAtOffset(imageWidth/-10, imageHeight/2,sand.class) !=null)
            TouchLand=true;
            return TouchLand;
    }
    
    private void checkCollision()
    {
        if (isTouching(Fish.class)) 
        {
            removeTouching(Fish.class);
            Points.countercat+=10;
            eating.play();
        }
        if (isTouching(fishmove.class)) 
        {
            removeTouching(fishmove.class);
            Points.countercat+=10;
            eating.play();
        }
    }
    
    private void dead()
    {
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,water.class)!=null)
        {
            World myWorld = getWorld();
            Retry1 retry1 = new Retry1();
            myWorld.addObject(retry1,450,300);
        }
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,tomb.class)!=null)
        {
            World myWorld = getWorld();
            Retry2 retry2 = new Retry2();
            myWorld.addObject(retry2,450,300);
        }
        if(getY()==581)
        {
            World myWorld = getWorld();
            Retry3 retry3 = new Retry3();
            myWorld.addObject(retry3,450,300);
        }
        if (getOneObjectAtOffset(imageWidth/10, imageHeight/2,stone.class)!=null)
        {
            World myWorld = getWorld();
            Retry4 retry4 = new Retry4();
            myWorld.addObject(retry4,450,300);
        }
    }
}
