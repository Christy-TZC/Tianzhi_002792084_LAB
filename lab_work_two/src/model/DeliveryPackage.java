/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tianzhichen
 */
public class DeliveryPackage {
    int packageId;
    double packageWeight;
    
    ArrayList<Product> productList;
    Customer customer;
    
    public DeliveryPackage() {
        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    // add a Product to the productList
    public Product createProduct(int productId, String productName, double price) {
        // create new product object
        Product product = new Product();
        
        // set the attributes
        product.setProductId(productId);
        product.setProductName(productName);
        product.setPrice(price);
        
        // add it to the list
        this.productList.add(product);
        
        return product;
    }
    
    public Product findProduct(int productId) {
        for (Product product : this.productList) { 
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }
    
}
