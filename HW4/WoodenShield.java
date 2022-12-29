public class WoodenShield extends Shield{
    @Override
    public int protectPoint() {
        return 13;
    }

    @Override
    public String toString() {
        return "Деревянный щит " + super.toString();
    }
}
