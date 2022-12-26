package tank;

import java.util.Random;

public class enemy {
    Random random = new Random();
    int x, y, direction , xbullet ,ybullet ,bulletDirection ;
    int bulletTrigger ;
    boolean isAlive;
    boolean collesion;

    public enemy(int a) {
        x = a;
        y = 10;
        isAlive = true;
        collesion =false;
        direction =  getRandomDirection();
        bulletTrigger = 1;

    }
    static int[] directions = {9, 10, 11, 12};

    public static int getRandomDirection() {
        int rnd = new Random().nextInt(4);
        return directions[rnd];
    }

}
