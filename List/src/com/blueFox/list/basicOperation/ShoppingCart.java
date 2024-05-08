package com.blueFox.list.basicOperation;

import java.util.ArrayList;
import java.util.List;

import com.blueFox.list.exception.EmptyListException;

public class ShoppingCart {
    private List<Product> shoppingCart;

    public ShoppingCart() {
        this.shoppingCart = new ArrayList<>();
    }

    public void addProduct(int productId, String productName, double productPrice, int productQuantity) {
        shoppingCart.add(new Product(productId ,productName, productPrice, productQuantity));
    }

    public void removeProduct(String productName) throws EmptyListException {
        List<Product> productToRemove = new ArrayList<>();

        if(!shoppingCart.isEmpty()){
            for (Product product : shoppingCart) {
                if(product.getProductName().equalsIgnoreCase(productName)){
                    productToRemove.add(product);
                }
            }
            shoppingCart.removeAll(productToRemove);
        } else {
            throw new EmptyListException("Empty shopping cart");
        }
    }

    public int getTotalProduct() {
        return shoppingCart.size();
    }

    public List<Product> getProducts() throws EmptyListException{
        List<Product> products = null;
        if (!shoppingCart.isEmpty()) {
            products = shoppingCart;
        } else {
            throw new EmptyListException("Empty shopping cart");
        }
        return products;
    }
}
