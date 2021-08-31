import java.util.ArrayList;

public class FizzBuzzSolver {

	public boolean divisibleBy(int number, int multiple){
		return multiple % number == 0;
	}

	public ArrayList<String> fizzBuzzSolution(int lowestNumber, int highestNumber){
		ArrayList<String> fizzBuzzList = new ArrayList<>();
		for (int i = lowestNumber; i <= highestNumber; i++){
			if (divisibleBy( 15, i  )){
				fizzBuzzList.add( "FizzBuzz" );
			} else if (divisibleBy( 3, i  )){
				fizzBuzzList.add( "Fizz" );
			} else if (divisibleBy( 5, i  )){
				fizzBuzzList.add( "Buzz" );
			} else {
				fizzBuzzList.add( Integer.toString( i ) );
			}
		}
		return fizzBuzzList;
	}

}
