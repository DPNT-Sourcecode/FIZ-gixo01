package befaster.solutions.FIZ;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

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
		String response=fizzBuzzSolution.fizzBuzz(6);

		//assert
		assertThat(response,equalTo("fizz"));

	}
	
	
	@Test
	public void fizzBuzz_should_return_fizz_delux_for66() {

		//act
		String response=fizzBuzzSolution.fizzBuzz(666);

		//assert
		assertThat(response,equalTo("fizz deluxe"));

	}
	
	@Test
	public void fizzBuzz_should_return_fizz_if_number_contain3() {

		//act
		String response=fizzBuzzSolution.fizzBuzz(13);

		//assert
		assertThat(response,equalTo("fizz"));

	}


	@Test
	public void fizzBuzz_should_return_buzz_for5() {

		//act
		String response=fizzBuzzSolution.fizzBuzz(10);

		//assert
		assertThat(response,equalTo("buzz"));

	}
	
	@Test
	public void fizzBuzz_should_return_buzz_delux_for55() {

		//act
		String response=fizzBuzzSolution.fizzBuzz(55);

		//assert
		assertThat(response,equalTo("buzz deluxe"));

	}
	
	
	@Test
	public void fizzBuzz_should_return_buzz_if_number_contains5() {

		//act
		String response=fizzBuzzSolution.fizzBuzz(59);

		//assert
		assertThat(response,equalTo("buzz"));

	}


	@Test
	public void fizzBuzz_should_return_fizzbuzz_for_mutiple_of_3and5() {


		//act
		String response=fizzBuzzSolution.fizzBuzz(15);

		//assert
		assertThat(response,equalTo("fizz buzz"));

	}
	
	
	@Test
	public void fizzBuzz_should_return_fizzbuzz_if_number_contains_3and5() {


		//act
		String response=fizzBuzzSolution.fizzBuzz(546);

		//assert
		assertThat(response,equalTo("fizz buzz"));

	}


	@Test
	public void fizzBuzz_should_return_number_if_not_mutipleof_3and5(){


		//act
		String response=fizzBuzzSolution.fizzBuzz(7);

		//assert
		assertThat(response,equalTo("7"));

	}
	
	
	@Test
	public void fizzBuzz_should_return_delux_for_number_greater_than10_identical(){
		//act
		String response=fizzBuzzSolution.fizzBuzz(77);

		//assert
		assertThat(response,equalTo("deluxe"));
	}
}
