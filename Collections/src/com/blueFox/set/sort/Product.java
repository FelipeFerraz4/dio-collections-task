package com.blueFox.set.sort;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    
    public Product(int productId, String productName, double productPrice, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public int getProductId() {
        return productId;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[productId: " + productId + ", productName: " + productName + ", productPrice: " + productPrice
                + ", productQuantity: " + productQuantity + "]";
    }

    @Override
    public int compareTo(Product product) {
        return productName.compareToIgnoreCase(product.getProductName());
    }

}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return Double.compare(product1.getProductPrice(), product2.getProductPrice());
    }

}