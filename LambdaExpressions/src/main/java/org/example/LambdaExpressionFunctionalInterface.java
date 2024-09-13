package org.example;


@FunctionalInterface
interface StringInterface {
    String saysWhat(String name);
}

public class LambdaExpressionFunctionalInterface
{
    public static void main(String[] args) {
        StringInterface saysHello = name -> name+ " says Hello";
        StringInterface saysByeYeaa = name -> name + " says Byeeeeee yaa";

        System.out.println(saysHello.saysWhat("Simon"));
        System.out.println(saysByeYeaa.saysWhat("Dillon"));
    }
}
