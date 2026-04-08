package com.learn.java.date.java21;

import java.util.List;
import java.util.stream.Gatherer;
import java.util.stream.Stream;

public class GathererExample {
	
	public static Gatherer<Integer, ?, Integer> evenOnly = Gatherer.of((state, element, downstrem) -> {
		if(element % 2 == 0) {
			downstrem.push(element);
		}
		return true;
	});
	
    public static void main(String[] args) {
    	
    	Stream.of(1, 2, 3, 4, 5)
        	.gather(evenOnly)
        	.forEach(System.out::println);

    	// create funciton with Gaterer
        Gatherer<Integer, ?, List<Integer>> batchByTwo =
            Gatherer.ofSequential(
                () -> new java.util.ArrayList<Integer>(), // state
                (state, element, downstream) -> {
                    state.add(element);
                    if (state.size() == 3) {
                        downstream.push(List.copyOf(state));
                        state.clear();
                    }
                    return true;
                },
                (state, downstream) -> {
                    if (!state.isEmpty()) {
                        downstream.push(List.copyOf(state));
                    }
                }
            );

        Stream.of(1, 2, 3, 4, 5)
              .gather(batchByTwo)
              .forEach(System.out::println);
    }
    
    
}
