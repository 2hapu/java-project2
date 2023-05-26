package com.example.javaproject.week6.day5;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
        // 의존 역전 원칙 : 변화하기 쉬운 것 보다는 변화하기 어려운 것에 의존해라
        // 구현할 클래스를 type으로 정하지말고, 추상화된 것에 의존해야 함
        // class를 타입으로 정하게 되면 class에 의존성이 생김
        // 의존성을 떨어트리고자 interface 타입을 정하여 결합성을 떨어트리는 것
        // 어떤 구현체(Bird, DOg)에 의존하지말고 interface나 추상클래스로 정의해서 구현해야 함
        // Test test를 하면 구현체에 의존을 하는 것이라서 .. 객체 지향 설계에 맞지 않음
        // Ani라는 추상회된 것에 의존하면
    }
}
