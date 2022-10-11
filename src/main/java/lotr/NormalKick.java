package lotr;

import java.util.Random;

public class NormalKick extends Kick {
    NormalKick(Character character) {
        super(character);
    }

    @Override
    public void kick(Character c) {
        Random r = new Random();
        c.setHp(c.getHp() - r.nextInt(character.power));
    }
}

