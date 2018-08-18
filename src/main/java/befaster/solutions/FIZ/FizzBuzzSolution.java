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

		if(number > 10 && isIdentical(number))
		{
         return true;
		}
		return false;
	}
	
	
	private Boolean isIdentical(int number)
	{
		
	String stringNumber=Integer.toString(number);
	String firstChar=stringNumber.substring(0, 1);
	stringNumber.chars().filter(ch-> ch == firstChar).count();
		return true;
	}

}
