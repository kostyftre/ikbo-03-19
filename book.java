package ru.mirea.lab1.ru;

public class book {
    private String size;
    private String master;
    private String author;


    public book(String size, String master, String author) {
        this.size = size;
        this.master = master;
        this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Размер книги: %s \n Автор: %s \n Хозяин: %s", this.size, this.author, this.master);
    }
}
