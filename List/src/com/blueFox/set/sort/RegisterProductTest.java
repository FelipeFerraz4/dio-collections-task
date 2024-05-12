package com.blueFox.set.sort;

import com.blueFox.set.exception.EmptySetException;

public class RegisterProductTest {
    public static void main(String[] args) {
        try {
            RegisterProduct registerProduct = new RegisterProduct();

            // System.out.println(registerProduct.getProductsByName());
            // System.out.println(registerProduct.getProductByPrice());

            registerProduct.addProduct(1, "Milk", 5.32, 8);
            registerProduct.addProduct(2, "Bread", 7.2, 10);
            registerProduct.addProduct(3, "ham", 2, 2);

            System.out.println(registerProduct.getProductsByName());
            System.out.println(registerProduct.getProductByPrice());
        } catch (EmptySetException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}
