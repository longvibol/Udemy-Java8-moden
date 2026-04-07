package com.modernjava.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal){
        return switch (animal){
            case null -> ""; // This handles the null pointer exception.
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };

    }

    public String retrieveNameV2(Animal animal){
        return switch (animal){
            case Cat(var name , var color) -> name;
            case Dog (var name , var color)  -> name;
            case null -> ""; // This handles the null pointer exception.
        };
    }

    public String retrieveNameUsingGuardedPattern(Animal animal){
        return switch (animal){
            case Cat(var name , var color) -> name;
            case Dog (var name , var color)  -> name;
            case null -> ""; // This handles the null pointer exception.
        };
    }



}
