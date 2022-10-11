package lotr;

import java.util.Random;

public abstract class Honored extends Character {

    static Random r = new Random();

    public Honored(int powerMin, int powerMax, int hpMin, int hpMax) {
        super(powerMin + r.nextInt(powerMax - powerMin), hpMin + r.nextInt(hpMax - hpMin));
        kick = new NormalKick(this);
    }

//    @Override
//    public void kick(Character c) {
//        c.setHp(c.getHp() - r.nextInt(power));
//    }
}
