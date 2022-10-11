package lotr;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
        kick = new CryKick(this);
    }

    @Override
    public String toString() {
        return "Characters." + getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }

//    @Override
//    public void kick(Character c) {
//        System.out.println("crying...");
//    }
}
