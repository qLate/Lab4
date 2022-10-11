package lotr;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
        kick = new NormalKick(this);
    }

//    @Override
//    public void kick(Character c) {
//        if (c.getPower() < power)
//            c.setHp(0);
//        else
//            power--;
//    }
}

