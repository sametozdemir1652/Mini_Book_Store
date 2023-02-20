package Concretes;

public class Book {


        private int id;
        private String bookName;
        private double unitPrice;
        private int stock;
        private String writerName;
        private String publishingHouse;

    public Book(int id, String bookName, double unitPrice, int stock, String writerName, String publishingHouse) {
        this.id = id;
        this.bookName = bookName;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.writerName = writerName;
        this.publishingHouse = publishingHouse;
    }

    public Book(String bookName, double unitPrice, int stock, String writerName, String publishingHouse) {
        this.bookName = bookName;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.writerName = writerName;
        this.publishingHouse = publishingHouse;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return
                " bookName='" + bookName + '\'' +
                ", unitPrice=" + unitPrice +
                ", stock=" + stock +
                ", writerName='" + writerName + '\'' +
                ", publishingHouse='" + publishingHouse + "\n";
    }
}
