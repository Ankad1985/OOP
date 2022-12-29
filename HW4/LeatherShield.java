public class LeatherShield extends Shield{
    @Override
    public int protectPoint() {
        return 10;
    }

    @Override
    public String toString() {
        return "Щит из кожи " + super.toString();
    }
}
