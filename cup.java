package laboratornya_3;

class cup extends dish{
    String color_of_cup;

    public cup(String color_of_cup) {
        this.color_of_cup = color_of_cup;
    }

    @Override
    public void colors() {
        System.out.println("Вы разбили чашку " + color_of_cup + " цвета");
    }
}
