package players;

import java.util.Random;

//Hunter каждый раз при атаке критует. Т.е. каждая атака умножается на случайное число от 2 до 4.
public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        Random random = new Random(2);
        int number = random.nextInt(4);
        heroes[2].setDamage(heroes[2].getDamage() * number);
    }
}
