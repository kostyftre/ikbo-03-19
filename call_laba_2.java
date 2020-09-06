package Java_Praktica.Laboratornya_2;

public class call_laba_2 {
    int radius;
    String name;

    public call_laba_2(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public call_laba_2() {

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "call_laba_2{" +
                "radius=" + radius + ", Area=" + 3.14*radius +", name='" + name + '\'' +
                '}';
    }
}
