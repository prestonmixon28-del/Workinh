public class Main {

    public static void main(String[] args) {

        Bag backpack = new Bag("Main Backpack", 2.0);

        Item bedroll = new Item("Bedroll", 4.0);
        Item rope = new Item("Rope", 3.0);
        Item sword = new Item("Sword", 3.5);

        Bag potionPouch = new Bag("Potion Pouch", 0.5);
        potionPouch.add(new Item("Health Potion", 0.5));
        potionPouch.add(new Item("Mana Potion", 0.4));

        Bag holdingBag = new Bag("Bag of Holding", 1.0);
        holdingBag.add(new Item("Gold Coins", 0.2));

        Bag gemBag = new Bag("Gem Bag", 0.3);
        gemBag.add(new Item("Ruby", 0.1));
        gemBag.add(new Item("Emerald", 0.1));

        holdingBag.add(gemBag);

        backpack.add(bedroll);
        backpack.add(rope);
        backpack.add(sword);
        backpack.add(potionPouch);
        backpack.add(holdingBag);

        System.out.println("=== Full Inventory ===");
        backpack.displayInfo();

        System.out.println("\nTotal backpack weight: "
                + backpack.getWeight() + " lbs");

        System.out.println("\n=== Potion Pouch Only ===");
        potionPouch.displayInfo();

        System.out.println("Potion pouch total weight: "
                + potionPouch.getWeight() + " lbs");

        System.out.println("\n=== Testing Unsupported Operation ===");

        try {
            sword.add(new Item("Extra Item", 1.0));
        } catch (UnsupportedOperationException e) {
            System.out.println(
                    "Warning: An individual item cannot contain other items.");
        }
    
    System.out.println("\n=== Testing Empty Bag ===");

        Bag emptyBag = new Bag("Empty Bag", 0.5);
        emptyBag.displayInfo();

        System.out.println("Empty bag weight: "
                + emptyBag.getWeight() + " lbs");

        System.out.println("\n=== Testing Remove Item ===");

        Bag testBag = new Bag("Test Bag", 1.0);
        Item testPotion = new Item("Potion", 0.5);

        testBag.add(testPotion);

        System.out.println("Weight before removal: "
                + testBag.getWeight() + " lbs");

        testBag.remove(testPotion);

        System.out.println("Weight after removal: "
                + testBag.getWeight() + " lbs");
}
}
