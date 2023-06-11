package finalClass;

public class Date {
	private String yearOFbirth;
	private String yearOFdeath;
	private String monthOFbirth;
	private String monthOFdeath= "0";
	private String dayOFbirth= "0";
	private String dayOFdeath= "0";
	public boolean isAlive;//bayab chap she to file
	
	
	
	public void setYeareOfBirth(String yb) {
		yearOFbirth = yb ;
	}
	public void setYearOfDeath(String yd) {
		yearOFdeath = yd ;
	}
	public String getYearOfBirth() {
		return yearOFbirth;
	}
	public String getYearOfDeath() {
		return yearOFdeath;
	}
	
	
	
	public void setMonthOfBirth(String mb) {
		monthOFbirth = mb ;
	}
	public void setMonthOfDeath(String md) {
		monthOFdeath = md ;
	}
	public String getMonthOfBirth() {
		return monthOFbirth;
	}
	public String getMonthOfDeath() {
		return monthOFdeath;
	}
	
	
	
	public void setDayOfBirth(String db) {
		dayOFbirth = db ;
	}
	public void setDayOfDeath(String dd) {
		dayOFdeath = dd ;
	}
	public String getDayOfBirth() {
		return dayOFbirth;
	}
	public String getDayOfDeath() {
		return dayOFdeath;
	}
}
