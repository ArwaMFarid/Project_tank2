package tank;
import tank.AnimGLEventListener3.Directions2;

public class enmbullet {

    AnimGLEventListener3.Directions2 direction2;
    int enx, eny;

    boolean fired = true;

//    public bullet(Directions direction, int x, int y) {
//        this.direction = direction;
//        this.fired = true;
//        this.x = x;
//        this.y = y;
//    }

    enmbullet(AnimGLEventListener3.Directions2 direction2, int enx, int eny) {
        this.direction2 = direction2;
        this.fired = true;
        this.enx = enx;
        this.eny = eny;
    }
}
