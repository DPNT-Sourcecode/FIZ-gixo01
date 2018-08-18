package befaster.solutions.FIZ;

import com.google.common.base.CharMatcher;

public class FizzBuzzSolution {

	public String fizzBuzz(Integer number) {


		if(number % 3==0 && number % 5==0 ||(number % 3==0 &&  Integer.toString(number).contains("5") ) ||(number % 5==0 && Integer.toString(number).contains("3") ) ||( Integer.toString(number).contains("3")  && Integer.toString(number).contains("5") ) )
		{
			
			return (isDeluxNumber(number) ) ?((isFake(number) ? "fizz buzz fake deluxe" :" fizz buzz  deluxe" ) ):"fizz buzz" ;
			
		}
		if(number % 3==0 || Integer.toString(number).contains("3") )
		{
			return isDeluxNumber(number) ? ((isFake(number) ? "fizz fake deluxe" :"fizz  deluxe" ) ) :"fizz" ;
		}
		if(number % 5==0 || Integer.toString(number).contains("5"))
		{
			return isDeluxNumber(number) ? ((isFake(number) ? "buzz fake deluxe" :" buzz  deluxe" ) ):"buzz" ;
		}
		return  isDeluxNumber(number) ? ((isFake(number) ? "fake deluxe" :" deluxe" ) ) :Integer.toString(number);
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
	
	
	private boolean isFake(int number)
	{
		return (number %2 != 0)? true:false;
	}

}
