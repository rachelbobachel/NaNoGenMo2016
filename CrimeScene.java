import java.util.ArrayList;

public class CrimeScene {

	String crime;
	String place;
	String city;
	String time;
	String weapon;
	ArrayList<String> clues;
	
	
	public CrimeScene (String crime, String place, String city, String time, String weapon, ArrayList<String> clues) {
		this.crime = crime;
		this.place = place;
		this.city = city;
		this.time = time;
		this.weapon = weapon;
		this.clues = clues;
	}
	
	public String getCrime() {
		return crime;
	}
	
	public String getPlace() {
		return place;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getTime() {
		return time;
	}
	
	public String getWeapon() {
		return weapon;
	}
	
	public ArrayList<String> getClues() {
		return clues;
	}

}
