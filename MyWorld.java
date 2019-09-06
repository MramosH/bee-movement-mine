import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//Michelle Ramos Hernandez 
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
       // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //randomizing bee's
       bee2 bee1 = new bee2();
       addObject(bee1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber (400) );
       //bee2 bee2 = new bee2();
       //addObject(bee2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber (400));
       
       //randomizing ladybug
       Ladybug Ladybug1 = new Ladybug();
       addObject(Ladybug1, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber (400));
       //Ladybug Ladybug2 = new Ladybug();
       //addObject(Ladybug2, Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber (400));
       
       //radomizing catus subcalsses
       for(int i = 0; i < 5; i++) {
            Strawberry Strawberry1 = new Strawberry();
            addObject(Strawberry1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            Blue_Dot Blue_Dot1 = new Blue_Dot();
            addObject(Blue_Dot1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            The_Rock The_Rock1 = new The_Rock();
            addObject(The_Rock1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        
        //randomizing flower subclasses
        for(int i = 0; i < 5; i++) {
            Apple Apple1 = new Apple();
            addObject(Apple1, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));  
            Clover Clover1 = new Clover();
            addObject(Clover1,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
            Mushroom Mushroom1 = new Mushroom();
            addObject(Mushroom1,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
        
        

    }  
    // if the game ends in a tie 
     public void act () {
          if( numberOfObjects() == 2){
            Tie TieScreen = new Tie();
            Greenfoot.setWorld(TieScreen);
            }
        }
   }
       

