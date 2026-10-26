public class Main {

    public static void main(String[] args) {

        Bag pouch = new Bag("Belt Pouch", 0.5);

        Item potion = new Item("Health Potion", 0.5);
        Item gem = new Item("Magic Gem", 0.2);

        pouch.add(potion);
        pouch.add(gem);

        pouch.displayInfo();

        System.out.println("Total weight: "
                + pouch.getWeight() + " lbs");
    }
}