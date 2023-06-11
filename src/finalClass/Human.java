package finalClass;

public class Human extends AliveCreature{
	private String firstName  ;
	private String lastName ;
	private String age ;
	private String id ;
	
	
	
	public void setFirstName(String fn) {
		firstName = fn ;
	}
	public String getFirstName() {
		return firstName ;
	}
	
	
	
	public void setLastName(String ln) {
		lastName = ln ;
	}
	public String getLastName() {
		return lastName ;
	}
	
	
	
	public void setAge(String a) {
		age = a ;
	}
	public String getAge() {
		return age;
	}
	
	
	
	public void setId(String i) {
		id = i ;
	}
	public String getId() {
		return id;
	}

}
