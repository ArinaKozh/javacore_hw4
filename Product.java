package task2;

public class Product {

    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }

    @Override
        public String toString() {
            return "Товар '" + name + "', цена - " + cost;
        }

}
