public class Main {

    public static void main(String[] args) {

        Item sword = new Item("iron sword", 5.0);
        Item potion = new Item("health potion", 1.0);

        sword.displayInfo();
        System.out.println();
        potion.displayInfo();
        System.out.println();

        System.out.println("sword weight: " + sword.getWeight() + " lbs");
        System.out.println("potion weight: " + potion.getWeight() + " lbs");
    }

}