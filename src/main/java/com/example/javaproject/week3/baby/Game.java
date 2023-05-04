package com.example.javaproject.week3.baby;

public class Game {
    public static void main(String[] args) {
        Character character = new Character(); // 참조형이기 때문에 사용하기 위해선 인스턴스화
        character.levelUp2();
        character.levelUp2();
        character.levelUp2();

//        new를 써서 class를 사용하고 나면 메모리에서 제거가 됩니다.
//        힙 영역에서 제거가 됨
//        누가 제거해줌 ? : JVM에 탑재된 가비지 컬렉터가 가비지 컬렉션을 해줌
//        개발자는 개발에 집중할 수 있음 C언어 같은 경우는 메모리 관리를 직접 해줘야함
    }
}
