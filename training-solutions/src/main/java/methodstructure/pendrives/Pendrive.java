package methodstructure.pendrives;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public String toString(){
        return "Name: " + getName() + "\n" +
                "Capacity: " + getCapacity() + "\n" +
                "Price: " + getPrice();
    }

    public void risePrice(int percent){
        this.price += this.price * (percent/100.0);
    }

    public int comparePricePerCapacity(Pendrive other){
        double pricePerCapacity = (double) getPrice() / getCapacity();
        double pricePerCapacityOther = (double) other.getPrice() / other.getCapacity();

        if (pricePerCapacity > pricePerCapacityOther){
            return 1;
        } else if (pricePerCapacity < pricePerCapacityOther){
            return -1;
        }
        return 0;
    }

    public boolean isCheaperThan(Pendrive other){
        return getPrice()<other.getPrice();
    }
}
