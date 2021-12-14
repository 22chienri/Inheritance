/*
Ryan Chien
Period 4
Inheritance
Television
 */

public class Television {
    private String model;
    private double price;
    // zero-arg constructor
    public Television() {
        this.model = new String();
        this.price = 0.0;
    }
    // multi-arg constructor
    public Television(String initialModel, double initialPrice) {
        this.model = new String(initialModel);
        this.price = initialPrice;
    }
    // setter setModel
    public void setModel(String newModel) {
        this.model = newModel;
    }
    // getter getModel
    public String getModel() {
        return this.model;
    }
    // setter setPrice
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
    // getter getPrice
    public double getPrice() {
        return this.price;
    }
    // toString method
    public String toString() {
        String output = new String();
        output = "The Model of this tv is: " + this.model + "\tPrice: " +
                this.price;
        return output;
    }
}
