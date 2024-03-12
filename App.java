import player.Player;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
    

    /*Player p1=new Player();
    p1.setPlayerdetailsfromInput();
    Player p2=new Player();
    p2.setPlayerdetailsfromInput();
    System.out.println("Player 1:"+p1.getPlayername());
    System.out.println("Player 2:"+p2.getPlayername()); 
    Dice dice=new Dice();
    System.out.println("Dice:"+dice.diceRoll());
    Coordinates c=new Coordinates(9,4);
    System.out.println(c.printCoordinates());*/
    Coordinates c=new Coordinates(9,4);
    Coordinates d=new Coordinates(3,7);
    Jumper j=new Jumper(c,d);
    System.out.println(j.getJumperName());





}


}
