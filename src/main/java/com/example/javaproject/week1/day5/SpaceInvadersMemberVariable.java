package com.example.javaproject.week1.day5;

public class SpaceInvadersMemberVariable {
    int location; // 맴버 변수 (class의 멤버다)
    public void moveLeft() {
        location = location - 1;
        System.out.printf("moveLeft : %d\n", location);
    }
    public void moveRight() {
        location = location + 1;
        System.out.printf("moveRight : %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
    }
}
