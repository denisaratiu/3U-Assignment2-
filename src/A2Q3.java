
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ratid6445
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        //create robot
        Robot karel = new Robot(kw, 4, 8, Direction.WEST);
        //create algorithm
            
        if (karel.getDirection() == Direction.EAST) {
            karel.turnLeft();
            karel.turnLeft();
        }
        if (karel.getDirection() == Direction.NORTH) {
            karel.turnLeft();
        }
        if (karel.getDirection() == Direction.WEST) {
            karel.move();
        }
        if (karel.getDirection() == Direction.SOUTH) {
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
        }
        while (karel.getAvenue() > 0) {
            karel.move();
        }
        while (karel.getStreet() > 0) {
            if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();

            }
            karel.move();
                    }
            
                }
    }



    



