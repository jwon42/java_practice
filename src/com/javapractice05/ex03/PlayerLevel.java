package com.javapractice05.ex03;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    final public void go(int jumpCount) {
        showLevelMessage();
        run();
        for (int i = 0; i < jumpCount; i++) {
            jump();
        }
        turn();
    }
}

class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초보자 레벨 입니다. *****");
    }
}

class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 중급자 레벨 입니다. *****");
    }
}

class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("아주 높이 Jump 합니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 고급자 레벨 입니다. *****");
    }
}
