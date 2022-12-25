package tank;
import tank.AnimGLEventListener3.Directions;

public class bullet {
    Directions direction;
    int x, y;

    boolean fired = true;

//    public bullet(Directions direction, int x, int y) {
//        this.direction = direction;
//        this.fired = true;
//        this.x = x;
//        this.y = y;
//    }

    bullet(Directions direction, int x, int y) {
        this.direction = direction;
        this.fired = true;
        this.x = x;
        this.y = y;

    }
}
