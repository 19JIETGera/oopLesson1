import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
//        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
//        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
//        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
//        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);
//
//        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
//        vendingMachine.addBottleOfWater(b1);
//        vendingMachine.addBottleOfWater(b2);
//        vendingMachine.addBottleOfWater(b3);
//        vendingMachine.addBottleOfWater(b4);
//        vendingMachine.addBottleOfWater(b5);
//        System.out.println(vendingMachine.getProduct("20", 5));
//        System.out.println(vendingMachine.getProduct("20", 100));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }
        HotDrinks b1 = new HotDrinks("1", 1, 1, 50);
        HotDrinks b2 = new HotDrinks("2", 5, 1.5, 70);
        HotDrinks b3 = new HotDrinks("3", 14, 0.5, 100);
        HotDrinks b4 = new HotDrinks("4", 20, 2, 50);
        HotDrinks b5 = new HotDrinks("50", 60, 1, 30);
        HotDrinkVedingMachine vedingMachine = new HotDrinkVedingMachine(new ArrayList<>());
        vedingMachine.addHotDrink(b1);
        vedingMachine.addHotDrink(b2);
        vedingMachine.addHotDrink(b3);
        vedingMachine.addHotDrink(b4);
        vedingMachine.addHotDrink(b5);
        System.out.println(vedingMachine.getProduct("4",2,50));
        System.out.println(vedingMachine.getProduct("50",1.5,50));
    }

}