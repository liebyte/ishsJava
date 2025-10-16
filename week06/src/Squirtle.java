public class Squirtle extends Pokemon {
    public Squirtle(int hp) {
        super("꼬부기", hp);
        System.out.println("거북거북~"); //무언가 마음이 거북해진다
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(name + " -> " + target.getName() + "에게 '뒤통수에 물대포 맞아서 거북목되기' 사용");
    }
}