package com.blueFox.list.basicOperation;

public class Product {
    private int pruductId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    
    public Product(int pruductId, String productName, double productPrice, int productQuantity) {
        this.pruductId = pruductId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getpruductId() {
        return pruductId;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    @Override
    public String toString() {
        return "[pruductId: " + pruductId + ", productName: " + productName + ", productPrice: " + productPrice
                + ", productQuantity: " + productQuantity + "]";
    }
}
