public abstract class Warrior<T extends Weapon, U extends Shield> {
    private String name;
    private int healthPoint;
    private T weapon;
    private  U shield;

    public Warrior(String name, int healthPoint, T weapon, U shield) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
        this.shield = shield;
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "воин: " +
                "имя: " + name +
                ", здоровье:" + healthPoint +
                ", оружие: " + weapon +
                ", щит: " + shield;
    }

    public T getWeapon() {
        return weapon;
    }

    public U getShield() {
        return  shield;
    }
}
