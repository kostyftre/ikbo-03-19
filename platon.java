package ru.mirea.lab1.ru;

public class platon {
    private String master;
    private String size;
    private String male;

    public platon(String master, String size, String male) {
        this.master = master;
        this.size = size;
        this.male = male;
    }

    public String getMaster() {
        return master;
    }

    public void setMaster(String master) {
        this.master = master;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return String.format("Размер Платона: %s \n Пол: %s \n Хозяин: %s", this.size, this.male, this.master);
    }

}
