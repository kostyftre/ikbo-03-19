public class Dog {
    private String name;
    private String color;
    private String dogMaster;

    public Dog(String name, String color, String dogMaster) {
        this.name = name;
        this.color = color;
        this.dogMaster = dogMaster;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDogMaster() {
        return dogMaster;
    }

    public void setDogMaster(String dogMaster) {
        this.dogMaster = dogMaster;
    }

    public void say() {
        System.out.println("Гав!");
    }

    @Override
    public String toString() {
        return String.format("Имя песика: %s \nЦвет песика: %s \nХозяин песика: %s", this.name, this.color, this.dogMaster);
    }
}