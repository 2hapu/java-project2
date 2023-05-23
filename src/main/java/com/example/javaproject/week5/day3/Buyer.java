package com.example.javaproject.week5.day3;

import java.util.ArrayList;
import java.util.List;

public class Buyer {
    private int money = 10000;

    // 상품이 들어가는 카트 배열 ..
    // Computer, Tv를각각 만드는 것이 아닌 배열도 같이 ......... 부모객체로
    Product[] carts = new Product[10];
    List<Product> cartList = new ArrayList<>();

    int i = 0;
    public void buy() {

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money > 0) this.money = money;
    }

    public void buy(Product product) {
        if(money >= product.price){
            money -= product.price;
//            carts[i++] = product;
            cartList.add(product);
        }
        System.out.println(money);
    }
}
