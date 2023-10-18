import java.util.List;

public class HotDrinkVedingMachine implements VendingMachine{
    List<HotDrinks> hotDrinks;

    public HotDrinkVedingMachine(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    public List<HotDrinks> getHotDrinks() {
        return hotDrinks;
    }

    public void setHotDrinks(List<HotDrinks> hotDrinks) {
        this.hotDrinks = hotDrinks;
    }

    @Override
    public Product getProduct(String name) {
        for (HotDrinks item : hotDrinks) {
            if(item.getName().equals(name))
                return item;
        }
        return null;
    }

    @Override
    public Product getProduct(String name, double volume) {
        return null;
    }

    @Override
    public Product getProduct(String name, double volume, int temperature) {
        for (HotDrinks drinks : hotDrinks){
            if (drinks.getName().equals(name) && drinks.getVolume() == volume && drinks.getTemperature() == temperature){
                return drinks;
            }
        }
        return null;
    }

    public void addHotDrink(HotDrinks hotDrinks){
        this.hotDrinks.add(hotDrinks);
    }
}
