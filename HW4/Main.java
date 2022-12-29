//Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
//Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
//На основе класса Warrior создать различные типы воинов, например, лучник,
// меченосец, ополченец и т.п. У лучника добавить поле расстояние поражения.
//Создать различные виды вооружения, например, меч, лук, лопата. Обеспечить,
// чтобы определенный тип воина мог нести только определенной оружие
//Создать класс командира

//Создать класс щита, разработать разные типы щитов, добавить в семейство классов
// Warriors обобщения в виде щитов. Реструктуризировать код в конечных классах семейства Warriors.
public class Main {
    public static void main(String[] args) {
        System.out.println("--------Team1-----------");

        Comandor comandor1 = new Comandor("Makedonsky", 250, new LongBow(), new WoodenShield());
        Team<Archer> archers = new Team<>(comandor1);
        archers.addWarrior(new Archer("Legolas", 150, new LongBow(), new WoodenShield()));
        archers.addWarrior(new Archer("Galadriel", 150, new LongBow(), new WoodenShield()));

        System.out.println(comandor1);
        archers.forEach(System.out::println);
        System.out.println("Урон: " + archers.getAllDamage());
        System.out.println("Здоровье:" + archers.getAllHealthPoint());
        System.out.println("Дальность атаки:" + archers.getMaxRadius());
        System.out.println("Защита:" + archers.getAllProtect());


        System.out.println("--------Team2---------");

        Comandor comandor2 = new Comandor("Sauron", 250,new Sekira(), new LeatherShield());
        Team<Barbarian>  barbarians= new Team<>(comandor2);
        barbarians.addWarrior(new Barbarian("Dodik", 150, new Sekira(), new LeatherShield()));
        barbarians.addWarrior(new Barbarian("Lelik", 150, new Sekira(), new LeatherShield()));
        barbarians.addWarrior(new Barbarian("Bolek", 150, new Sekira(), new LeatherShield()));

        System.out.println(comandor2);
        barbarians.forEach(System.out::println);
        System.out.println("Урон: " + barbarians.getAllDamage());
        System.out.println("Здоровье:" + barbarians.getAllHealthPoint());
        System.out.println("Дальность атаки:" + barbarians.getMaxRadius());
        System.out.println("Защита:" + barbarians.getAllProtect());

        System.out.println("--------Team3---------");
        Comandor comandor3 = new Comandor("Gendalf", 250, new LongBow(), new IronShield());
        Team<Warrior> gang = new Team<>(comandor3);
        gang.addWarrior(new Archer("Frodo", 150, new LongBow(), new WoodenShield()));
        gang.addWarrior(new Barbarian("Pippin", 150, new Sekira(), new LeatherShield()));

        System.out.println(comandor3);
        gang.forEach(System.out::println);
        System.out.println("Урон: " + gang.getAllDamage());
        System.out.println("Здоровье:" + gang.getAllHealthPoint());
        System.out.println("Дальность атаки:" + gang.getMaxRadius());
        System.out.println("Защита:" + gang.getAllProtect());



    }
}