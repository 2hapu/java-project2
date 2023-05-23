package com.example.javaproject.week5.day3;

public class Store {
    public static void main(String[] args) {
        // 굳이 private를 하고 getter setter를 이용하는 이유
        // -1000이 돈이면 잘못된 값임
        // getter setter를 쓴다면 메소드를 통해 검증을 할 수 있음
        // 하지만 getter/setter의 사용은 지양하는 게 좋음
        // 특히 setter는 지양 .. why : 사이드 이펙트 -> 누군가 쉽게 값을 바꿔버릴 수 있음
        Buyer buyer = new Buyer();
        TV tv = new TV(1444);
        Computer computer = new Computer(1111);
//      업캐스팅
//        업캐스팅의 장점
//        1. 다형적 매개변수 사용 가능
//        2. 하나의 배열에 여러 종류의 객체를 저장 가능
        Product pTv = new TV(1444);
        pTv.print();
//      다운캐스팅
        ((TV)pTv).test();
        buyer.buy(tv);
        buyer.buy(computer);
        // buyer에 pTv를 매개변수로 받는 buy 클래스만 생성해줘도 위에 tv와 computer도 처리가능 부모로 ..
//        요구사항 구매시 장바구니로 상품구매목록이 생성 되어야 한다.
        System.out.println(buyer.cartList);
    }
}
