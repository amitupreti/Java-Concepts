package org.example;


interface NumberFunc {
    Integer increase(Integer num);
}

public class StoreLambdaFuncCustomInterface {
    public static void main(String[] args) {
        NumberFunc increaseByTwo = (num) -> num + 2;
        NumberFunc increaseBy100Times = (num) -> num * 100;
        System.out.println("Increased 5 by two: " + increaseByTwo.increase(5).toString());

        System.out.println("Multiply 5 by 100:" + increaseBy100Times.increase(5));
    }
}
