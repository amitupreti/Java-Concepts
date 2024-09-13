package org.example;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIWithLambdas {


    static List<String> places = new ArrayList<>();

    public static List getPlaces(){

        places.add("Canada, Toronto");
        places.add("USA, California");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Canada, London");

        return places;
    }

    public static void main( String[] args ) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Canada:");


        myPlaces.stream()
                .filter((p) -> p.startsWith("Canada"))
                .map((p) -> p.toUpperCase())
                .forEach((p) -> System.out.println(p));
        System.out.println();
        System.out.println("Places from USA");
        myPlaces.stream()
                .filter((place) -> place.startsWith("USA"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
        ;
    }

}
