import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team <T extends Warrior> implements Iterable<T>{
    List<T> warriors = new ArrayList<>();

    public Comandor getComandor() {
        return comandor;
    }

    private Comandor comandor;

    public Team(Comandor comandor) {

        this.comandor = comandor;
    }
    public void addWarrior(T newWarrior){
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }
    public int getAllHealthPoint(){
        int allHealthPoint = 0;
        for (T item : warriors) {
            allHealthPoint+=item.getHealthPoint();
        }
        return allHealthPoint;
    }

    public int getAllDamage(){
        int sumDamage = 0;
        for (T item : this) {
            sumDamage+=item.getWeapon().damage();
        }
        return sumDamage;
    }
    public int getMaxRadius(){
        int maxRange = 0;
        for (T item : this) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow){
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()){
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }
    public int getAllProtect(){
        int sumProtect = 0;
        for (T item : this) {
            sumProtect+=item.getShield().protectPoint();
        }
        return sumProtect;
    }

}
