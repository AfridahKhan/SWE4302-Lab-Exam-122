public class IceCreamShop {
    public static void main(String [] args){
    IceCreamFlavor mint = new IceCreamFlavor("Mint Chocolate Chip",2.80);
    IceCreamFlavor chocolateFudge = new IceCreamFlavor("Chocolate Fudge", 3.00);
    IceCreamFlavor StraberrySwirl = new IceCreamFlavor("Strawberry Swirl",2.75);
    IceCreamFlavor PistachioDelight = new IceCreamFlavor("Pistachio Delight",3.25);

        IceCreamTopping sprinkles = new IceCreamTopping("Sprinkles", 0.30);
        IceCreamTopping strawberries = new IceCreamTopping("Fresh Strawberries", 1.00);
        IceCreamTopping CrushedOreo = new IceCreamTopping("Crushed Oreo",0.85);
        IceCreamTopping murshmallow = new IceCreamTopping("Murshmallow",.70);
        IceCreamTopping chocolateChips= new IceCreamTopping("Chocolate Chips", .50);
        // Create order
        Order order = new Order();
        order.addIceCream(mint, 1);
        order.addIceCream(chocolateFudge, 1);
        order.addToppings(sprinkles, 1);
        order.addToppings(strawberries, 2);
        order.chooseServing(true);

    }
}
