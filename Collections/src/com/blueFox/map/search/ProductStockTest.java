package com.blueFox.map.search;

import com.blueFox.exception.EmptyMapException;

public class ProductStockTest {
    public static void main(String[] args) {
        try {
            ProductStock productStock = new ProductStock();

            productStock.addProduct(1, "Milk", 3, 10);
            productStock.addProduct(2, "Bread", 4, 8);
            productStock.addProduct(3, "Ham", 6, 6);

            System.out.println(productStock.getCheaperProduct());
            System.out.println(productStock.getHighestValueProductInStock());
            System.out.println(productStock.getMoreExpensiveProduct());
            System.out.println(productStock.getProducts());
            System.out.println(productStock.calculateTotalStock());
            
        } catch (EmptyMapException e) {
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
