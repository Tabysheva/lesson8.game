package players;
//Warrior должен получать от босса урон, и потом наносить ему свой урон + полученный от босса
public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        heroes[0].setDamage(boss.getDamage() + heroes[0].getDamage());
        System.out.println("Warrior нанес критический урон");
    }
}
