package finalClass;

public class Tork extends Human implements Gender{
	private String number ;
	static int numMale = 0 ;
	static int numFemale = 0 ;
	
	
	public void setNumber(String num) {
		number = num ;
	}
	public String getNumber() {
		return number;
	}
	
	public void Male()
	{
		numMale++ ;
	}
	public void Female()
	{
		numFemale++ ;
	}

}
