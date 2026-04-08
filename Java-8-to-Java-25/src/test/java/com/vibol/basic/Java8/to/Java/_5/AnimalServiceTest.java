package com.vibol.basic.Java8.to.Java._5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.learn.java.date.java17recordmatch.Animal;
import com.learn.java.date.java17recordmatch.AnimalService;
import com.learn.java.date.java17recordmatch.Cat;
import com.learn.java.date.java17recordmatch.Dog;

public class AnimalServiceTest {
	
	AnimalService animalService = new AnimalService();

    @ParameterizedTest()
    @MethodSource("input")
    void retrieveName(Animal animal, String expectedResult) {
        var name = animalService.retrieveName(animal);
        assertEquals(expectedResult, name);
    }

    @ParameterizedTest()
    @MethodSource("input")
    void retrieveNameV2(Animal animal, String expectedResult) {
        var name = animalService.retrieveNameV2(animal);
        assertEquals(expectedResult, name);
    }

    @Test
    void retrieveNameUsingGuardedPattern() {
        var name = animalService.retrieveNameUsingGuardedPattern(new Cat(null, "Black"));
        assertEquals("", name);
    }


    private static Stream<Arguments> input() {
        return Stream.of(
                Arguments.of(new Cat("Kitty", "Black"), "Kitty"),
                Arguments.of(new Dog("Scooby", "Black"), "Scooby"),
                Arguments.of(null, "")
        );
    }

}
