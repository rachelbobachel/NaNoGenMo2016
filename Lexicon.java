import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lexicon {

	// people
	private ArrayList<String> firstName = new ArrayList<String>();
	private ArrayList<String> lastName = new ArrayList<String>();

	// object adjectives
	private ArrayList<String> color = new ArrayList<String>();
	private ArrayList<String> adjObject = new ArrayList<String>();

	// personal characteristics
	private ArrayList<String> distinction = new ArrayList<String>();
	private ArrayList<String> profession = new ArrayList<String>();
	private ArrayList<String> adjPerson = new ArrayList<String>();
	private ArrayList<String> pastime = new ArrayList<String>();

	// crime scene features
	private ArrayList<String> crime = new ArrayList<String>();
	private ArrayList<String> evidence = new ArrayList<String>();

	// objects
	private ArrayList<String> object = new ArrayList<String>();
	private ArrayList<String> vehicle = new ArrayList<String>();

	// locations
	private ArrayList<String> preposition = new ArrayList<String>();
	private ArrayList<String> place = new ArrayList<String>();
	private ArrayList<String> destination = new ArrayList<String>();

	// times
	private ArrayList<String> season = new ArrayList<String>();
	private ArrayList<String> time = new ArrayList<String>();

	// verbs & adverbs; all past-tese
	private ArrayList<String> transVerb = new ArrayList<String>();
	private ArrayList<String> think = new ArrayList<String>();
	private ArrayList<String> movement = new ArrayList<String>();
	private ArrayList<String> sense = new ArrayList<String>();
	private ArrayList<String> search = new ArrayList<String>();
	private ArrayList<String> speak = new ArrayList<String>();
	private ArrayList<String> urgent = new ArrayList<String>();

	// dialouge
	private ArrayList<String> interrogation = new ArrayList<String>();
	private ArrayList<String> questionFurther = new ArrayList<String>();
	private ArrayList<String> comment= new ArrayList<String>();
	private ArrayList<String> reply = new ArrayList<String>();
	private ArrayList<String> greeting = new ArrayList<String>();
	private ArrayList<String> confused = new ArrayList<String>();
	private ArrayList<String> conjunction = new ArrayList<String>();
	private ArrayList<String> unimpressed = new ArrayList<String>();

	public Lexicon() {

	}

	/*
	 * ******** Mutators ********
	 */

	public void addFirst(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			firstName.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addLast(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			lastName.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addColor(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			color.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addAdjObj(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			adjObject.add(fileReader.nextLine());
		}

		fileReader.close();
	}

	public void addDistinction(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			distinction.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addProfession(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			profession.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addAdjPers(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			adjPerson.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addPastime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			pastime.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addCrime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			crime.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addEvidence(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			evidence.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addObject(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			object.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addVehicle(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			vehicle.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addPreposition(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			preposition.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addPlace(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			place.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addDestination(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			destination.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addSeason(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			season.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addTime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			time.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addTransVerb(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			transVerb.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addThink(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			think.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addMovement(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			movement.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addSense(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			sense.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addSearch(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			search.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addSpeak(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			speak.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addUrgent(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			urgent.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addInterrogation(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			interrogation.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addQuestionFurther(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			questionFurther.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addComment(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			comment.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addReply(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			reply.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addGreeting(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			greeting.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addConfused(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			confused.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addConjunction(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			conjunction.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	public void addUnimpressed(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			unimpressed.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/*
	 * ******** Accessors ********
	 */

	public ArrayList<String> getFirst() {
		return firstName;
	}

	public ArrayList<String> getLast() {
		return lastName;
	}

	public ArrayList<String> getColor() {
		return color;
	}

	public ArrayList<String> getAdjObject() {
		return adjObject;
	}

	public ArrayList<String> getDistinction() {
		return distinction;
	}

	public ArrayList<String> getProfession() {
		return profession;
	}

	public ArrayList<String> getAdjPerson() {
		return adjPerson;
	}

	public ArrayList<String> getPastime() {
		return pastime;
	}

	public ArrayList<String> getComment() {
		return comment;
	}
	
	public ArrayList<String> getCrime() {
		return crime;
	}

	public ArrayList<String> getEvidence() {
		return evidence;
	}

	public ArrayList<String> getObject() {
		return object;
	}

	public ArrayList<String> getVehicle() {
		return vehicle;
	}

	public ArrayList<String> getPreposition() {
		return preposition;
	}

	public ArrayList<String> getPlace() {
		return place;
	}

	public ArrayList<String> getDestination() {
		return destination;
	}

	public ArrayList<String> getSeason() {
		return season;
	}

	public ArrayList<String> getTime() {
		return time;
	}

	public ArrayList<String> getTransVerb() {
		return transVerb;
	}

	public ArrayList<String> getThink() {
		return think;
	}

	public ArrayList<String> getMovement() {
		return movement;
	}

	public ArrayList<String> getSense() {
		return sense;
	}

	public ArrayList<String> getSearch() {
		return search;
	}

	public ArrayList<String> getSpeak() {
		return speak;
	}

	public ArrayList<String> getUrgent() {
		return urgent;
	}

	public ArrayList<String> getInterrogation() {
		return interrogation;
	}

	public ArrayList<String> getQuestionFurther() {
		return questionFurther;
	}

	public ArrayList<String> getReply() {
		return reply;
	}

	public ArrayList<String> getGreeting() {
		return greeting;
	}

	public ArrayList<String> getConfused() {
		return confused;
	}

	public ArrayList<String> getConjunction() {
		return conjunction;
	}

	public ArrayList<String> getUnimpressed() {
		return unimpressed;
	}

	/*
	 * ****** Other Methods ******
	 /*

	/**
	 * Returns formatted list for given word type in lexicon
	 * 
	 * @param list
	 *            word type of interest
	 * @return list or words
	 */
	public String toString(ArrayList<String> list) {
		Iterator<String> itr = list.iterator();
		String words = "";

		//formats fist word correctly
		if (itr.hasNext()) {
			words += itr.next();
		}

		//formats rest of list correctly
		while (itr.hasNext()) {
			words += ", " + itr.next();

		}

		return words;
	}

	/**
	 * Returns formatted list of all words in lexicon, divided by word type.
	 *
	 * @return list of all words
	 */
	@Override
	public String toString() {
		String lexicon = "";

		lexicon += "\n\nFirst Names:\t " + toString(firstName);
		lexicon += "\n\nLast Names:\t " + toString(lastName);
		lexicon += "\n\nColors:\t " + toString(color);
		lexicon += "\n\nObject Adjectives:\t " + toString(adjObject);
		lexicon += "\n\nDistinctions:\t " + toString(distinction);
		lexicon += "\n\nProfessions:\t " + toString(profession);
		lexicon += "\n\nPersonal Adjectives:\t " + toString(adjPerson);
		lexicon += "\n\nPastimes\t " + toString(pastime);
		lexicon += "\n\nCrimes:\t " + toString(crime);
		lexicon += "\n\nEvidence:\t " + toString(evidence);
		lexicon += "\n\nObjects:\t " + toString(object);
		lexicon += "\n\nVehicles:\t " + toString(vehicle);
		lexicon += "\n\nPrepositions:\t " + toString(preposition);
		lexicon += "\n\nPlaces:\t " + toString(place);
		lexicon += "\n\nDestinations:\t " + toString(destination);
		lexicon += "\n\nSeasons:\t " + toString(season);
		lexicon += "\n\nTimes:\t " + toString(time);
		lexicon += "\n\nTransitive Verbs:\t " + toString(transVerb);
		lexicon += "\n\nThinking Verbs:\t " + toString(think);
		lexicon += "\n\nMovement Verbs:\t " + toString(movement);
		lexicon += "\n\nSensing Verbs:\t " + toString(sense);
		lexicon += "\n\nSearching Verbs:\t " + toString(search);
		lexicon += "\n\nSpeaking Verbs:\t " + toString(speak);
		lexicon += "\n\n'Quickly' Adverbs:\t " + toString(urgent);
		lexicon += "\n\nInterrogation Questions:\t " + toString(interrogation);
		lexicon += "\n\nFollow-up Questions:\t " + toString(questionFurther);
		lexicon += "\n\nComments:\t " + toString(comment);
		lexicon += "\n\nReplies:\t " + toString(reply);
		lexicon += "\n\nGreetings/Goodbyes:\t " + toString(greeting);
		lexicon += "\n\nConfused Statement:\t " + toString(confused);
		lexicon += "\n\nConjunctions:\t " + toString(conjunction);
		lexicon += "\n\nUnimpressed statements:\t " + toString(unimpressed);

		return lexicon;
	}
}
