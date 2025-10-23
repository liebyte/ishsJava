public class Charizard extends Pokemon {
    public Charizard(int hp, int attackPower) {
        super("피카츄", hp, attackPower); //부모클래스 생성자 호출
        System.out.println("자몽자몽~"); //호잇짜! 를 잇는 피카츄 태어나는 소리
    }

    @Override
    public void attack(Pokemon target) {
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        int damage = getAttackPower() + 5;
        System.out.println(name + " -> " + target.getName() + "에게 '마시멜로우굽기' 사용! (데미지: " + damage + ")"); //name is protected
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
        System.out.println(target.getName() + "의 남은 HP: " + target.getHP());

    }
}