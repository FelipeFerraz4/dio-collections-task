package com.blueFox.set.sort;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.blueFox.exception.EmptySetException;

public class RegisterProduct {
    private Set<Product> registerProduct;

    public RegisterProduct() {
        this.registerProduct = new HashSet<>();
    }

    public void addProduct(int productId, String productName, double productPrice, int productQuantity) {
        registerProduct.add(new Product(productId, productName, productPrice, productQuantity));
    }

    public Set<Product> getProductsByName() throws EmptySetException{
        Set<Product> productsByName = new TreeSet<>(registerProduct);
        if(!registerProduct.isEmpty()) {
            return productsByName;
        } else {
            throw new EmptySetException("Not find product registered");
        }
    }

    public Set<Product> getProductByPrice() throws EmptySetException {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        if(!registerProduct.isEmpty()) {
            productsByPrice.addAll(registerProduct);
            return productsByPrice;
        } else {
            throw new EmptySetException("Not find product registered");
        }
    }

}
