package ru.mirea.lab1.ru;

public class ball {
    private String color;
    private String size;
    private String master;

    public ball(String color, String size, String master) {
        this.color = color;
        this.size = size;
        this.master = master;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }



    @Override
    public String toString() {
        return String.format("Размер мяча: %s \n Цвет мяча: %s \n Хозяин: %s", this.size, this.color, this.master);
    }



}
