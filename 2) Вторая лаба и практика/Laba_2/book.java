package Java_Praktica.Laboratornya_2;

public class book {
    int pages, year_of_writing;
    String author, title;

    public book(int pages, String title, String author, int year_of_writing) {
        this.pages = pages;
        this.title = title;
        this.author= author;
        this.year_of_writing = year_of_writing;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_of_writing() {
        return year_of_writing;
    }

    public void setYear_of_writing(int year_of_writing) {
        this.year_of_writing = year_of_writing;
    }

    @Override
    public String toString() {
        return ("Название книги: " + title + ", кол-во страниц: "+ pages +", год написания: "+year_of_writing+ ", автор книги: "+ author);
    }
}
