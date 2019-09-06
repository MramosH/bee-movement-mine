import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ladybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladybug extends Actor
{
    private int Score = 0;
    /**
     * Act - do whatever the Ladybug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn(Greenfoot.getRandomNumber (10)-5);
        move(5);
        int x = getX ();
        int y = getY (); 
        if (x > 600 || y < 0 || y > 400) {
            x = 0; 
            setRotation(Greenfoot.getRandomNumber (50));
            y = Greenfoot.getRandomNumber(400);
            setLocation(x,y);
          
        }
        boolean contactCactus = isTouching(Cactus.class);
        if(contactCactus){
             Cactus Take = (Cactus) getOneIntersectingObject(Cactus.class);
            int TakeScore = Take.getScore();
            Score = Score + TakeScore;
            removeTouching(Cactus.class);
        }
        boolean contactFlower = isTouching(Flower.class);
        if(contactFlower){
            Flower plant = (Flower) getOneIntersectingObject(Flower.class);
            int plantScore = plant.getScore();
            Score = Score - plantScore;
            removeTouching(Flower.class);
        }
        
        //Ladybug wins
        if(Score >= 10) {
            LadybugWin winScreen = new LadybugWin();
            Greenfoot.setWorld(winScreen);
        }
        //if Ladybug gets negitive bee wins
        if(Score <= -10) {
            BeeWin winScreen = new BeeWin();
            Greenfoot.setWorld(winScreen);
        }
    }    
}
