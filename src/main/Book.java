package main;

public class Book{
    
    String author;
    String book;
    double weight;

    public Book(String author, String book, double weight) {
        this.author = author;
        this.book = book;
        this.weight = weight;
    }

    public double weight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.book;
    }

    public static Object toString(String string, String string2) {
        return string + ": " + string2;
    }

}
