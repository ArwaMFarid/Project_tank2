/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tank;

import tank.AnimGLEventListener.Directions;
import java.util.Random;

/**
 *
 * @author TOSHIBA
 */
public class enemy {
     Random random = new Random();
    public int step = 5;
  //  public static final int R = 15;
    public double x = 355, y = 355;
   // public int ii = trX(x), jj = trY(y);

    public Directions direction = Directions.up;

    public void randMove() {
        int sw = random.nextInt(4);
        switch (sw) {
            case 0 : {
                direction = Directions.up;
            }
            case 1 : {
                direction = Directions.right;

            }
            case 2 :{
                direction = Directions.down;
            }
            case 3 : {
                direction = Directions.left;
            }
        }
    }

    public void moveUP() {
        direction = Directions.up;
        y -= step;
       
    }

    public void moveDown() {
        direction = Directions.down;
        y += step;
       
    }

    public void moveRight() {
        direction = Directions.right;
        x += step;
       
    }

    public void moveLeft() {
        direction = Directions.left;
        x -= step;
      
    }

    public void reset() {
        direction = Directions.up;
    }
}
