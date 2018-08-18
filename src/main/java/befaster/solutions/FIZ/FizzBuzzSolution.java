package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {


		if(number % 3==0 && number % 5==0)
		{
			return "fizz buzz";
		}
		if(number % 3==0 || Integer.toString(number).contains("3") )
		{
			return "fizz";
		}
		if(number % 5==0)
		{
			return "buzz";
		}
	  return Integer.toString(number);
	}

}
