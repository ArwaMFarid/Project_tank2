package tank;

import java.util.Random;

public class enemy {
    Random random = new Random();
    int x, y, direction , xbullet ,ybullet ,bulletDirection ;
    int bulletTrigger ;
    boolean isAlive;
    boolean collesion;

    public enemy() {
        x = 20;
        y = 10;
        isAlive = true;
        collesion =false;
        direction = random.nextInt(4);
        bulletTrigger = 1;

    }
}
