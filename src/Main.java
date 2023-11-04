public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Mihai", 45, true);
        Person person2 = new Person("Andrei", 20, false);
        Person person3 = new Person("Ionel", 33, true);
        Product product1 = new Product("Laptop", 999, 10, "Electronice");
        Product product2 = new Product("Scaun", 19, 50, "Mobila");
        Product product3 = new Product("Tricou", 24, 5, "Haine");

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Married: " + person1.isMarried());

        System.out.println("Name: " + person2.getName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Married: " + person2.isMarried());

        System.out.println("Name: " + person3.getName());
        System.out.println("Age: " + person3.getAge());
        System.out.println("Married: " + person3.isMarried());


        System.out.println("Product 1 - Name: " + product1.getName());
        System.out.println("Product 1 - Price: $" + product1.getPrice());
        System.out.println("Product 1 - Quantity: " + product1.getQuantity());
        System.out.println("Product 1 - Category: " + product1.getCategory());
        System.out.println("Product 1 - Is in stock: " + product1.hasStock());
        System.out.println("Product 1 - Is in Electronice category: " + product1.isCategory("Electronice"));
        System.out.println();

        System.out.println("Product 2 - Name: " + product2.getName());
        System.out.println("Product 2 - Price: $" + product2.getPrice());
        System.out.println("Product 2 - Quantity: " + product2.getQuantity());
        System.out.println("Product 2 - Category: " + product2.getCategory());
        System.out.println("Product 2 - Is in stock: " + product2.hasStock());
        System.out.println("Product 2 - Is in Mobila category: " + product2.isCategory("Mobila"));
        System.out.println();

        System.out.println("Product 3 - Name: " + product3.getName());
        System.out.println("Product 3 - Price: $" + product3.getPrice());
        System.out.println("Product 3 - Quantity: " + product3.getQuantity());
        System.out.println("Product 3 - Category: " + product3.getCategory());
        System.out.println("Product 3 - Is in stock: " + product3.hasStock());
        System.out.println("Product 3 - Is in Haine category: " + product3.isCategory("Haine"));


        Bottle bottle = new Bottle(1000);

        System.out.println(bottle.openBottle());
        System.out.println(bottle.openBottle());
        bottle.addLiquid(750);
        System.out.println("Added 750 ml of liquid.");
        System.out.println("Available liquid: " + bottle.getAvailableLiquid() + " ml");
        System.out.println("Empty capacity: " + bottle.getEmptyCapacity() + " ml");
        bottle.closeBottle();
        System.out.println(bottle.drinkLiquid(200));
        bottle.openBottle();
        System.out.println(bottle.drinkLiquid(900));
        System.out.println(bottle.drinkLiquid(200));
        System.out.println("Available liquid: " + bottle.getAvailableLiquid() + " ml");
        System.out.println("Empty capacity: " + bottle.getEmptyCapacity() + " ml");
        System.out.println(bottle.closeBottle());


    }

}