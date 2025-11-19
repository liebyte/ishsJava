package pokemons;

import fly.NoFly;

import java.util.ArrayList;

public class Squirtle extends Pokemon {
    public Squirtle(int hp, int attackPower, NoFly noFly, ArrayList<Skill> skills) {
        super("꼬부기", hp, attackPower, noFly, skills);
        System.out.println("거북거북~"); //무언가 마음이 거북해진다
    }

    @Override
    public void attack(Pokemon target, int choice) {
        int damage = getAttackPower() + 2 + this.skills.get(choice).getDamage();
        System.out.println(getName() + " -> " + target.getName() + "에게 " + this.skills.get(choice).getName() + "사용! (데미지: " + damage + ")"); //name is private
        target.receiveDamage(damage); //target.setHp(target.getHp()-damage);
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(target.getName() + "의 남은 HP: " + target.getHp());
    }
}