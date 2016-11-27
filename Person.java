
/**
 * Creates a person, with a first and last name, profession, and associated object
 * 
 * @author rachellowy
 * @version 27 Nov 2016
 */

public class Person {
	
	/*
	 * *******************
	 * Private Variables
	 * *******************
	 */
	
	private String first;
	private String last;
	private String profession;
	private String object;
	
	/*
	 * *******************
	 * Constructor
	 * *******************
	 */
	
	/**
	 * Creates a Person 
	 * 
	 * @param firstName first name
	 * @param lastName last name
	 * @param profession profession
	 * @param object the object associated with a person
	 */
	public Person(String firstName, String lastName, String profession, String object) {
		this.first = firstName;
		this.last = lastName;
		this.profession = profession;
		this.object = object;
	}
	
	/**
	 * Gets first name
	 * 
	 * @return first name
	 */
	public String getFirst() {
		return first;
	}
	
	/**
	 * Gets last name
	 * 
	 * @return last name
	 */
	public String getLast() {
		return last;
	}
	
	/**
	 * Gets full name
	 * 
	 * @return well-formatted first and last name
	 */
	public String getFullName() {
		return first + " " + last;
	}
	
	/**
	 * Gets profession
	 *  
	 * @return profession
	 */
	public String getProfession() {
		return profession;
	}
	
	/**
	 * Gets object associated with person
	 * 
	 * @return object name
	 */
	public String getObject() {
		return object;
	}

}
