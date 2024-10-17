// Класс Main для выполнения программы
public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(WeaponType.SWORD, "Flaming Sword");
        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 100, sword, 0);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 80, new Weapon(WeaponType.BOW, "Enchanted Bow"), 50);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}
