package task2;

import java.util.HashMap;

public class Order {

    private Customer customer;

    private Product product;

    private int amount;


    public Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
        this.amount = 1;
    }

    public Order(Customer customer, Product product, Integer amount){
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public Integer getTotalAmount(){
        return product.getCost()*amount;
    }
}
