public class Pikachu extends Pokemon {
    public Pikachu(int hp) {
        super(name:"피카츄", hp); //부모클래스 생성자 호출
        System.out.println("피카피카~"); //호잇짜! 를 잇는 피카츄 태어나는 소리
    }

    @Override
    public void attack(Pokemon target) {
        //System.out.println(getName() + " -> " + target.getName()); //name is private
        System.out.println(name + " -> " + target.getName() + "에게 '전기충격' 사용"); //name is protected
    }
}