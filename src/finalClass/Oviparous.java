package finalClass;

public class Oviparous extends Animal implements Special{
	private String number ;
	private String type ;
	private String idSpecial ;
	private String numSpecial ;
	
	public void setNumber(String num) {
		number = num ;
	}
	public String getNumber() {
		return number;
	}
	
	
	public void setType(String t) {
		type = t ;
	}
	public String getType() {
		return type ;
	}
	
	
	public void setId(String id)
	{
		idSpecial = id ;
	}
	public String getId()
	{
		return idSpecial ;
	}
	

	public void setNumSpecial(String num)
	{
		numSpecial = num ;
	}
	public String getNumSpecial()
	{
		return numSpecial ;
	}
	
}
