package befaster.solutions.FIZ;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {


		if(number % 3==0 && number % 5==0 ||(number % 3==0 &&  Integer.toString(number).contains("5") ) ||(number % 5==0 && Integer.toString(number).contains("3") ) ||( Integer.toString(number).contains("3")  && Integer.toString(number).contains("5") ) )
		{
			return isDeluxNumber(number) ? "fizz buzz delux" :"fizz buzz" ;
		}
		if(number % 3==0 || Integer.toString(number).contains("3") )
		{
			return isDeluxNumber(number) ? "fizz delux" :"fizz" ;
		}
		if(number % 5==0 || Integer.toString(number).contains("5"))
		{
			return isDeluxNumber(number) ? "buzz delux" :"buzz" ;
		}
		return  isDeluxNumber(number) ? "delux"  :Integer.toString(number);
	}


	private boolean isDeluxNumber(int number)
	{

		if(number > 10)
		{

		}
		return true;
	}

}
