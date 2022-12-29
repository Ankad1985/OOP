public abstract class Shield {
    public abstract int protectPoint();

    @Override
    public String toString() {
        return String.format(", защита: "+ protectPoint());
    }
}
