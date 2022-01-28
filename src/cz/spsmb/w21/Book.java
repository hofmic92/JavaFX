package cz.spsmb.w21;

import javafx.beans.property.*;

public class Book {
    private StringProperty title = new SimpleStringProperty(this, "title", "Unknown");
    private DoubleProperty price = new SimpleDoubleProperty(this, "price", 0.0);
    private ReadOnlyStringWrapper ISBN = new ReadOnlyStringWrapper(this, "ISBN", "Unknown");

    public Book() {

    }

    public Book(String title, double price, String ISBN) {
        this.title.set(title);
        this.price.set(price);
        this.ISBN.set(ISBN);
    }

    public final String getTitle() {
        return title.get();
    }

    public final void setTitle(String title) {
        this.title.set(title);
    }

    public final StringProperty titleProperty() {
        return this.title;
    }

    public final double getPrice() {
        return this.price.get();
    }

    public final void setPrice(double price) {
        this.price.set(price);
    }

    public final DoubleProperty priceProperty() {
        return this.price;
    }

    public final String getISBN() {
        return this.ISBN.get();
    }

    public final ReadOnlyStringWrapper ISBNProperty() {
        return this.ISBN;
    }
}
