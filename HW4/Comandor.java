public class Comandor extends Warrior {
    public Comandor(String name, int healthPoint, Weapon weapon, Shield shield) {
        super(name, healthPoint, weapon, shield);
    }

    @Override
    public String toString() {
        return "Командир  " + super.toString();
    }
}
