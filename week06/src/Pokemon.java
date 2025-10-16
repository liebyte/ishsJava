public abstract class Pokemon {
    protected String name;
    private int hp;
    protected int attackPower;

    public Pokemon(String name, int hp, int attackPower) {
        this.name  = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public  String  getName() { return name; }
    public int getHP() { return hp;}
    public int getAttackPower() {
        return attackPower;
    }
    public void setHp(int hp) {this.hp = hp;}

    public abstract void attack(Pokemon target) ;

    @Override
    public String toString() {
        return name + "(HP : " + hp + ", AttackPower : " + attackPower + ")";
    }
}
