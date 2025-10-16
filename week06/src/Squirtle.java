public class Squirtle extends Pokemon {
    public Squirtle(int hp) {
        super("꼬부기", hp); //부모클래스 생성자 호출
        System.out.println("거북거북~"); //호잇짜! 를 잇는 피카츄 태어나는 소리
    }

    @Override
    public void attack(Pokemon target) {
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '거북목되기' 사용"); //name is protected
    }
}