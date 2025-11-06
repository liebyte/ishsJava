public class Nofly implements Flyable{
    @Override
    public void fly(Pokemon pokemon) {
        System.out.println("하늘을 날 수가 없습니다 엉엉");
    }
}
