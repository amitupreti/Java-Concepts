package org.example;

import java.util.ArrayList;
import java.util.function.Consumer; // in built java interface with single method(accept)

public class StoreLambdaFuncInVariable {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> methodPrintOne = (n) -> {System.out.println(n);};
        numbers.forEach(methodPrintOne);
        System.out.println();
        Consumer<ArrayList<Integer>> methodPrintAll = (array) -> {array.forEach(methodPrintOne);};
        methodPrintAll.accept(numbers);
    }
}
