package com.example.javaproject.week6.day5;

public class Main {
    public static void main(String[] args) {
//        Animal dog = new Dog();
//        dog.eat();
//        dog.makeSound();

//        Bird bird = new Bird();
//        bird.makeSound();
//        bird.run();

        // 구현체들은 똑같은 행동을 한다는 것이 보장된다 ....
        Ani bird = new Bird();
        Ani test = new Test();
        bird.makeSound();
        test.makeSound();

        Bird bird1 = new Bird();
        Test test1 = new Test();
        bird1.makeSound();
        test1.makeSound();
        // 이게 같은 건지 모름 .. 동일한 행위를 보장하기 위해 인터페이스를 사용함 ...

    }
}
