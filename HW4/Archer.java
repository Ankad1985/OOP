public class Archer extends Warrior<Bow, Shield>{
    Bow bow;

    public Archer(String name,  int healthPoint, Bow bow, Shield shield) {
        super(name, healthPoint,  bow, shield);

    }


    @Override
    public String toString() {
        return "Лучник" + super.toString();
    }
}
