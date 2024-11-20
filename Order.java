import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<String> items = new ArrayList<>();
    private double subtotal = 0.0;

    private final double taxRate = 0.08;
    private boolean waffleCone = false;

    public void addIceCream(IceCreamFlavor flavor, int scoops) {
        items.add(flavor.name + " - " + scoops + " scoop(s): $" + (flavor.pricePerScoop * scoops));
        subtotal += flavor.pricePerScoop * scoops;
    }

    public void addToppings(IceCreamTopping topping, int times){
        items.add(topping.name+ "-" + times + "time(s): $" + (topping.price * times));
        subtotal += topping.price * times;
    }

    public void chooseServing(boolean waffleCone){
        this.waffleCone=waffleCone;
        if (waffleCone) {
            items.add("Waffle Cone: $5.00");
            subtotal += 5.00;
        } else {
            items.add("Paper Cup: $0.00");
        }
    }

    public double getTotalPrice() {
        return subtotal + (subtotal * taxRate);
    }

    public void generateInvoice(String filename) {
        try (FileWriter writer = new FileWriter("IceCreamShop.txt")) {
            writer.write("Ice Cream Shop Invoice\n");
            for (String item : items) {
                writer.write(item + " ");
            }
            writer.write(String.format("Subtotal: $%.2f", subtotal));
            writer.write(String.format("Tax: $%.2f", subtotal * taxRate));
            writer.write(String.format("Total Amount Due: $%.2f", getTotalPrice()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

