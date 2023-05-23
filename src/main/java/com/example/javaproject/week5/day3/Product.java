package com.example.javaproject.week5.day3;

public abstract class Product {
//    추상화는 일반클래스, 추상클래스, 인터페이스 사용 가능
    // 추상클래스는 객체 생성ㅇ이 불가능하다
    // 추상클래스는 자식에게 추상 메소드 구현을 강제화한다
    // 추상 클래스 is-a
    int price;

    //2개 사용 위치
    boolean power;

    public Product(int price) {
        this.price = price;
    }

    public void power(){
        this.power = !power;
    }

    // 2개 사용 위치 2개 구현
    abstract void print();

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", power=" + power +
                '}';
    }
}
