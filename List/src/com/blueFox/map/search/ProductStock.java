package com.blueFox.map.search;

import java.util.HashMap;
import java.util.Map;

import com.blueFox.exception.EmptyMapException;

public class ProductStock {
    private Map<Integer, Product> productStock;

    public ProductStock() {
        this.productStock = new HashMap<>();
    }

    public void addProduct(int productId, String productName, double productPrice, int productQuantity) {
        productStock.put(productId, new Product(productName, productPrice, productQuantity));
    }

    public Map<Integer, Product> getProducts() throws EmptyMapException {
        if (productStock.isEmpty()) {
            throw new EmptyMapException("Empty product stock");
        }
        return productStock;
    }

    public double calculateTotalStock() throws EmptyMapException {
        if (productStock.isEmpty()) {
            throw new EmptyMapException("Empty product stock");
        }

        double sum = 0;
        for (Product product : productStock.values()) {
            sum += product.getProductPrice() * product.getProductQuantity();
        }
        return sum;
    }

    public Product getMoreExpensiveProduct() throws EmptyMapException {
        if (productStock.isEmpty()) {
            throw new EmptyMapException("Empty product stock");
        }
        Product productMoreExpensive = null;
        double priceMoreExpensive = Double.MIN_VALUE;

        for (Product product : productStock.values()) {
            double price = product.getProductPrice();
            if (price >= priceMoreExpensive) {
                priceMoreExpensive = price;
                productMoreExpensive = product;
            }
        }

        return productMoreExpensive;
    }

    public Product getCheaperProduct() throws EmptyMapException {
        if (productStock.isEmpty()) {
            throw new EmptyMapException("Empty product stock");
        }
        Product productCheaper = null;
        double priceCheaper = Double.MAX_VALUE;

        for (Product product : productStock.values()) {
            double price = product.getProductPrice();
            if (price <= priceCheaper) {
                priceCheaper = price;
                productCheaper = product;
            }
        }

        return productCheaper;
    }
    
    public Product getHighestValueProductInStock() throws EmptyMapException {
        if (productStock.isEmpty()) {
            throw new EmptyMapException("Empty product stock");
        }

        double highestValue = Double.MIN_VALUE;
        Product highestValueProduct = null;

        for (Product product : productStock.values()) {
            double price = product.getProductPrice() * product.getProductQuantity();
            if (price >= highestValue) {
                highestValue = price;
                highestValueProduct = product;
            }
        }

        return highestValueProduct;
    }
}
