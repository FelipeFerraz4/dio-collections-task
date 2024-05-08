package com.blueFox.list.basicOperation;

import com.blueFox.list.exception.EmptyListException;

public class shoppingCartTest {
    public static void main(String[] args) {
        try {
            ShoppingCart shoppingCart = new ShoppingCart();

            shoppingCart.addProduct(1, "Pizza de carne de sol", 35, 19);
            shoppingCart.addProduct(2, "Pizza de frango com catupry", 33, 15);
            shoppingCart.addProduct(3, "Pizza de calabresa", 32, 12);
            shoppingCart.addProduct(4, "Pizza de 4 queijos", 30, 14);

            System.out.println(shoppingCart.getTotalProduct());

            shoppingCart.removeProduct("Pizza de 4 queijos");

            System.out.println(shoppingCart.getProducts());
        } catch (EmptyListException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
