package lotr;

import java.lang.reflect.InvocationTargetException;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        boolean turn = true;
        System.out.println("Fight between " + c1.getClass().getSimpleName() + " and " + c2.getClass().getSimpleName());
        while (c1.isAlive() && c2.isAlive()) {
            if (turn) {
                System.out.println(c1.getClass().getSimpleName() + " kicks " + c2.getClass().getSimpleName());
                c1.kick.kick(c2);
            } else {
                System.out.println(c2.getClass().getSimpleName() + " kicks " + c1.getClass().getSimpleName());
                c2.kick.kick(c1);
            }
            turn = !turn;
        }
        System.out.println((c1.isAlive() ? c1.getClass().getSimpleName() : c2.getClass().getSimpleName()) + " wins");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        fight(Character.createCharacter(), Character.createCharacter());
    }
}
