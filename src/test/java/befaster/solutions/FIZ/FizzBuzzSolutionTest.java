package befaster.solutions.FIZ;


import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FizzBuzzSolutionTest {
	
	private FizzBuzzSolution fizzBuzzSolution;
	
	@Before
	public void setup()
	{
		fizzBuzzSolution = new FizzBuzzSolution();
	}

	@Test
	public void fizzBuzz_should_return_fizz_for3() {
		
		//act
		String response=fizzBuzzSolution.fizzBuzz(3);
		
		//assert
		
		
	}

}
