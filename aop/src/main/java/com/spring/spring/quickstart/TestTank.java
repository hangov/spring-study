package com.spring.spring.quickstart;

public class TestTank {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Move move = new TankProxy(t1);
        move.move();
    }
}
