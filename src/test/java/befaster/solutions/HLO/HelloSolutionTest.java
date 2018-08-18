package befaster.solutions.HLO;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


import org.junit.Test;

public class HelloSolutionTest {

	@Test
	public void hello_hould_return_String_with_Hello_prefix() {
	// arrange
		HelloSolution helloSolution= new HelloSolution();
		
		// act
		String response=helloSolution.hello("Mike");
		
		// assert
		
		assertThat(response,equalTo("Hello, Mike!"));
		
	}

}
