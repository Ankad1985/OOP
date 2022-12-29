public class IronShield extends Shield{
    @Override
    public int protectPoint() {
        return 20;
    }

    @Override
    public String toString() {
        return "Железный щит " + super.toString();
    }
}
