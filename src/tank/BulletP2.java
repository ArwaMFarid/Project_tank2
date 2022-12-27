/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tank;
import tank.AnimGLEventListener.Directions;

/**
 *
 * @author MSI-
 */
public class BulletP2{
    Directions direction;
    int x, y;

    boolean fired = true;

//    public bullet(Directions direction, int x, int y) {
//        this.direction = direction;
//        this.fired = true;
//        this.x = x;
//        this.y = y;
//    }

    BulletP2(Directions direction, int x, int y) {
          this.direction = direction;
        this.fired = true;
        this.x = x;
        this.y = y;

    }}
