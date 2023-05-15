package com.example.javaproject.week4.day4;

public class Address {
    private String fullAddr;
    private String sido;    // 시,도는 한국에만 있어서 이름 이렇게 ..
    private String sigungu;

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }
}
