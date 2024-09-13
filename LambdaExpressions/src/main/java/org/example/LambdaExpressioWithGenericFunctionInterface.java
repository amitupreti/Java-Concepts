package org.example;


@FunctionalInterface
interface GenericInterfaceDoWhatever <T>{
    T func( T t);
}

public class LambdaExpressioWithGenericFunctionInterface {
    public static void main(String[] args) {
        GenericInterfaceDoWhatever<String> sayWhat = message -> message + " What ?";
        GenericInterfaceDoWhatever<Integer> addOne = number -> number + 1;
        System.out.println(sayWhat.func("Helloooooo. "));
        System.out.println(addOne.func(10));
    }
}

//GG EZ in python
//say_what = lambda message: message + " What ?"
//add_one = lambda number: number + 1
//
//print(say_what("Helloooooo. "))
//print(add_one(10))