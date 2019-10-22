package players;

import java.util.Random;

//Magic должен увеличивать атаку каждого героя после каждого раунда на n-ное количество
public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        Random random = new Random(1);
        int number = random.nextInt(10);
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage() + number);
            System.out.println("Magic прибавил урон");
        }
    }
}
