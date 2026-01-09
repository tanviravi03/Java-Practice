package Java;

class Weapon {
    String name;
    int ammo;
    double range;
    double damage;
    double reloadtime;

    public Weapon(String name, double range, double damage, int ammo, double reloadtime) {
        this.ammo = ammo;
        this.name = name;
        this.range = range;
        this.damage = damage;
        this.reloadtime = reloadtime;
    }

    public Weapon(Weapon o) {
        this.ammo = o.ammo;
        this.name = o.name;
        this.range = o.range;
        this.damage = o.damage;
        this.reloadtime = o.reloadtime;
    }

        public String toString () {
            return "Weapon Detials-" + "\n" + "Name: " + name + " | Range: " + range + " | Damage: " + damage + " | Ammo: " + ammo + " | Reloadtime: " + reloadtime;
        }
    }
    public class CopyCons {
        public static void main(String[] args) {
            Weapon x1 = new Weapon("AK117", 75, 28, 30, 5.5);
            Weapon x2 = new Weapon (x1);
            System.out.println(x1);
            System.out.println(x2);

        }
    }
