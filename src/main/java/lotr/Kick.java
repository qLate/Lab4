package lotr;

public abstract class Kick {
    protected Character character;

    Kick(Character character) {
        this.character = character;
    }

    public abstract void kick(Character c);
}

