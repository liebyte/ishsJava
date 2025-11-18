public abstract class Pokemon {
    private String name;
//    protected String name;
    private int hp;
    protected int attackPower;
    protected Flyable flyingTool; // has-a (Aggregration)


    public Pokemon(String name, int hp, int attackPower) {
        this.name  = name;
        this.hp = hp;
        this.attackPower = attackPower;
    }

    public  String  getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public int getAttackPower() {
        return attackPower;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setFlyingTool(Flyable flyingTool) {
        this.flyingTool = flyingTool;
    }

    public void performFlyable() {
        this.flyingTool = fly();
    }

    public abstract void attack(Pokemon target) ;
    public void receiveDamage(int damage){
        hp = hp - damage;
        if(hp < 0) hp = 0;
    }

    public boolean isFainted() {
        return hp <= 0;
    }

    @Override
    public String toString() {
        return name + "(HP : " + hp + ", AttackPower : " + attackPower + ")";
    }
}
