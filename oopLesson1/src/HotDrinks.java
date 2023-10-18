public class HotDrinks extends BottleOfWatter{
    private int temperature;

    public HotDrinks(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }


    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temp) {
        this.temperature = temperature;
    }

    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                ";volume = " + super.getVolume() +
                ";cost = " + super.getCost() +
                ";temperature = " + temperature +
                '}';
    }
}
