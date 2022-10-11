package lotr;

import lombok.Getter;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Random;
import java.util.stream.Collectors;

public abstract class Character {
    @Getter
    protected int power;
    @Getter
    protected int hp;

    public Kick kick;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public static Character createCharacter() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("lotr");
        Random r = new Random();
        var subclasses = reflections.getSubTypesOf(Character.class).stream().filter((subclass) -> !Modifier.isAbstract(subclass.getModifiers())).collect(Collectors.toList());
        return subclasses.get(r.nextInt(subclasses.size())).getDeclaredConstructor().newInstance();
    }

//    public abstract void kick(Character c);

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public boolean isAlive() {return hp > 0;}

    @Override
    public String toString() {
        return "" + getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}

