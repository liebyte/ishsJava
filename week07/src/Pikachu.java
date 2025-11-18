public class Pikachu extends Pokemon {
    public Pikachu(int hp, int attackPower) {
        super("피카츄", hp, attackPower); //부모클래스 생성자 호출
        System.out.println("피카피카~"); //호잇짜! 를 잇는 피카츄 태어나는 소리
    }

    @Override
    public void attack(Pokemon target) {
        int damage = getAttackPower() + 5;
        System.out.println(getName() + " -> " + target.getName() + "에게 '전기충격' 사용! (데미지: " + damage + ")"); //name is private
        //target.setHp(target.getHP() - damage);
        target.receiveDamage(damage);
//        System.out.println(name + "->" + target.getName() + "에게 '전기충격' 사용"); // name is protected
        System.out.println(target.getName() + "의 남은 HP: " + target.getHP());
    }
}