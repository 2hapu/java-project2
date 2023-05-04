package com.example.javaproject.week3.baby;

public class Character {
//    멤버 변수 -> 클래스 안에서 선언된 변수
//    1. 클래스 변수(static 변수) - 스태틱 영역(메소드 영역)에 들어감
//    2. 인스턴스 변수(전역 변수) - heap 영역에 들어감 .. int여도 heap이네 ..
//    초기화 해주지 않아도 됨 why : 자료형에 따라서 0 이나 null로 알아서 초기화 해줌
    int level = 1;
    static final int maxLevel = 100; // 상수
//    static int maxLevel; // 모두의 만렙은 같아야 하므로 static으로 모두가 쓸 수 있게 class 변수로

    public void levelUp() {
        int level = 1;
        level = level + 1;
        System.out.println("레벨업: " + level);
        // 지역 변수로 썼기 때문에 초기화가 됨 ..
    }

    public void levelUp2() {
        level = level + 1;
        System.out.println("레벨업: " + level);
    }
}
