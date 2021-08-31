import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzTests {
	/*
	Print the numbers
	Multiple of numbers

	 */

	FizzBuzzSolver fizzBuzz = new FizzBuzzSolver();

	@Test
	public void divisibleByTest(){
		assertTrue( fizzBuzz.divisibleBy( 3, 3 ) );
		assertTrue( fizzBuzz.divisibleBy( 3, 9 ) );
		assertFalse( fizzBuzz.divisibleBy( 3, 5 ) );
	}

	@Test
	public void fizzBuzzSolutionTest(){
		ArrayList<String> minTestList = new ArrayList<>(
				List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"));
		assertEquals( minTestList, fizzBuzz.fizzBuzzSolution(1, 10) );
		System.out.println(minTestList);
	}
}
