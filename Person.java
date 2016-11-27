
public class Person {

	private String first;
	private String last;
	private String profession;
	private String object;
	
	public Person(String firstName, String lastName, String profession, String object) {
		this.first = firstName;
		this.last = lastName;
		this.profession = profession;
		this.object = object;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	public String getFullName() {
		return first + " " + last;
	}
	
	public String getProfession() {
		return profession;
	}
	
	public String getObject() {
		return object;
	}

}
