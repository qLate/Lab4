package lotr;

public class CryKick extends Kick {
    CryKick(Character character) {
        super(character);
    }

    @Override
    public void kick(Character c) {
        System.out.println("Crying");
    }
}
