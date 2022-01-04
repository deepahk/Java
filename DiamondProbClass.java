package com.java;

public class DiamondProbClass implements DiamondProbInt1,DiamondProbInt2 {
    @Override
    public void m1() {
        DiamondProbInt1.super.m1();
    }
    public static void main(String[] args) {
        DiamondProbClass def =  new DiamondProbClass();
        def.m1();

    }
}