package test;

public class Product {
    private double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0){
            throw new IllegalArgumentException("Invalid price: " + price);
        }
        this.price = price;
    }
    public double discount(int discount){
        return getPrice() * (100-discount)/100.0;
    }
}
