package Concretes;

public class Notebook {


    private int id;
    private String notebookName;
    private double unitPrice;
    private int stock;
    private String brand;
    private String numberOfLeaves;

    public Notebook(int id, String notebookName, double unitPrice, int stock, String brand, String  numberOfLeaves) {
        this.id = id;
        this.notebookName = notebookName;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.brand = brand;
        this.numberOfLeaves = numberOfLeaves;
    }

    public Notebook() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotebookName() {
        return notebookName;
    }

    public void setNotebookName(String notebookName) {
        this.notebookName = notebookName;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getNumberOfLeaves() {
        return numberOfLeaves;
    }

    public void setNumberOfLeaves(String numberOfLeaves) {
        this.numberOfLeaves = numberOfLeaves;
    }

    @Override
    public String toString() {
        return
                " notebookName='" + notebookName + '\'' +
                ", unitPrice=" + unitPrice +
                ", stock=" + stock +
                ", brand='" + brand + '\'' +
                ", numberOfLeaves=" + numberOfLeaves + "\n";
    }
}
