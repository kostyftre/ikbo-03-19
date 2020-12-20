

class Drink extends MenuItem implements Alcoholable{
    final double price, alcoholVol;
    DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type, double price) {
        this.price = price;
        this.alcoholVol = alcoholVol;
        this.type = type;
    }
    public Drink(double alcoholVol, DrinkTypeEnum type) {
        this.price = 0;
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public double getCost() {
        return price;
    }
    @Override
    public String getName() {
        return type.name();
    }
    @Override
    public String getDescription() {
        return String.format("price: %f\nalcohol volume: %f", price, alcoholVol);
    }

    @Override
    public boolean isAlcoholicDrink() {
        return false;
    }

    @Override
    public double getAlcoholVol() {
        return 0;
    }

    @Override
    public String toString() {
        return "<br>Drink{" +
                "price=" + price +
                ", alcoholVol=" + alcoholVol +
                ", type=" + type +
                '}';
    }
}
