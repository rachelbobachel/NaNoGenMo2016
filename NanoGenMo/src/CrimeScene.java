import java.util.ArrayList;

/**
 * Creates a crime scene object, with crime, setting, and clue details
 * 
 * @author rachellowy
 * @version 27 Nov 2016
 */

public class CrimeScene {

	/*
	 * *******************
	 * Private Variables
	 * *******************
	 */
	
	private String crime;
	private String place;
	private String city;
	private String time;
	private String weapon;
	private ArrayList<String> clues;
	
	/*
	 * *******************
	 * Constructor
	 * *******************
	 */
	
	/**
	 * Creates a crime scene with given details
	 * 
	 * @param crime crime that occurred
	 * @param place location of the crime
	 * @param city city of the crim
	 * @param time time of the crime
	 * @param weapon weapon used in crime
	 * @param clues clues found at scene of the crime
	 */
	public CrimeScene (String crime, String place, String city, String time, String weapon, ArrayList<String> clues) {
		this.crime = crime;
		this.place = place;
		this.city = city;
		this.time = time;
		this.weapon = weapon;
		this.clues = clues;
	}
	
	/**
	 * Returns crime
	 * 
	 * @return crime
	 */
	public String getCrime() {
		return crime;
	}
	
	/**
	 * Returns place
	 * 
	 * @return location of crime
	 */
	public String getPlace() {
		return place;
	}
	
	/**
	 * Returns city
	 * 
	 * @return city of crime
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Returns time
	 * 
	 * @return time of crime
	 */
	public String getTime() {
		return time;
	}
	
	/**
	 * Returns weapon
	 * 
	 * @return weapon
	 */
	public String getWeapon() {
		return weapon;
	}
	
	/**
	 * Returns list of clues
	 * 
	 * @return clues found at the crime scene
	 */
	public ArrayList<String> getClues() {
		return clues;
	}

}
