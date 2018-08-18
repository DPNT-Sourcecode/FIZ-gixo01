package befaster.solutions.FIZ;

import com.google.common.base.CharMatcher;

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
		return (number > 10 && isIdentical(number)) ? true:false;
	
	}


	private Boolean isIdentical(int number)
	{
		String stringNumber=Integer.toString(number);
		int count=CharMatcher.is(stringNumber.charAt(0)).countIn(stringNumber);
		return 	(count== stringNumber.length()) ? true : false;
	}

}
