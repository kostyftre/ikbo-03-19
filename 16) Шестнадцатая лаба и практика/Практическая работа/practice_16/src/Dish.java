

class Dish extends MenuItem{
    final double price;
    final String name, description;

    public Dish(String name, String description, double price) {
        this.price = price;
        this.name = name;
        this.description = description;
    }
    public Dish(String name, String description) {
        this.price = 0;
        this.name = name;
        this.description = description;
    }

    @Override
    double getCost() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "<br>Dish{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
