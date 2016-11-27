import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Builds and holds a collection of words and phrases needed for a SherlockMystery story. Words are collected in 
 * parts of speech needed for the story. Lexicon is built from words inputed from a file. 
 * 
 * ******Input files which must be formatted so that each word or phrase is on a separate line******
 * 
 * @author rachellowy
 * @version 27 Nov 2016
 */

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

	/*
	 * *******************
	 * Constructor
	 * *******************
	 */
	
	/**
	 * Creates a Lexicon object
	 */
	public Lexicon() {

	}

	/*
	 * ******** Mutators ********
	 */

	/**
	 * Builds lexicon of first names (proper noun)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addFirst(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			firstName.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of last names (proper noun)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addLast(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			lastName.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of color words (adj)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addColor(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			color.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of object descriptors (adj)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addAdjObj(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			adjObject.add(fileReader.nextLine());
		}

		fileReader.close();
	}

	/** 
	 * Builds lexicon personal distinction descriptors (n)
	 * These are primarily physical characteristics, used by Holmes to deduce a person's
	 * profession, pastime, or recent experiences.
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addDistinction(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			distinction.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of professions (n)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addProfession(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			profession.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of anthropomorphic descriptors  (adj)
	 * (descriptors that convey life-like properties)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addAdjPers(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			adjPerson.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of Holmes' favorite pastimes; (v) - gerund (-ing)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addPastime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			pastime.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of crime names (n) 
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addCrime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			crime.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of evidence; Holmes experiments on these and may find them at the crime scene (n)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addEvidence(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			evidence.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of objects; these are physical objects around the crime scene and one is
	 * associated with each person. (n)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addObject(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			object.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of vehicles  (n)
	 * 
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addVehicle(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			vehicle.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of locational prepositions (under, in, next to, etc.) 
	 * 
	 * @POS (prep)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addPreposition(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			preposition.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of places. These are places people can visit and where a crime could occur
	 * (e.g., 'Kitchen', 'Alley', 'Bank', 'Bath') 
	 * 
	 * @POS (noun)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addPlace(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			place.add(fileReader.nextLine());
		}
		fileReader.close();
	}
	
	/**
	 * Builds lexicon of destinations; cities/counties/countries. These are places a person
	 * would travel to. 
	 * 
	 * @POS (proper noun)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addDestination(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			destination.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of seasons 
	 * 
	 * @POS (proper noun)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addSeason(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			season.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of times in the past
	 * 
	 * @POS (n)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addTime(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			time.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of past tense transitive verbs
	 * These are verbs that can be used to describe actions on an object 
	 * 
	 * @POS  (v) - past
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addTransVerb(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			transVerb.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of present tense words that describe thinking
	 * (synonyms of 'think')  
	 * 
	 * @POS (v) - present
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addThink(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			think.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of past tense body movement words 
	 * 
	 * @POS (v) - past
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addMovement(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			movement.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of past tense words that describe sensing something
	 * (saw, heard, etc.) 
	 * 
	 * @POS (v) - past
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addSense(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			sense.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of present tense words that describe searching
	 * (synonyms of 'searched') 
	 * 
	 * @POS (v) - past
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addSearch(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			search.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of past tense words that describe speaking
	 * (synonyms of 'said') 
	 * 
	 * @POS (v) - past
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addSpeak(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			speak.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of adverbial words and phrases conveying urgency
	 * (synonyms of 'right now') 
	 * 
	 * @POS (adv)
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addUrgent(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			urgent.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of phrases that introduce an interrogation
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addInterrogation(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			interrogation.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of phrases to question an informant further 
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addQuestionFurther(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			questionFurther.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of noncommital phrases Holmes uses when thinking or responding to information
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addComment(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			comment.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of replies to yes/no questions
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addReply(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			reply.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of salutations that can be used for greeting and goodbye
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addGreeting(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			greeting.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of phrases conveying confusion
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addConfused(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			confused.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of conjunctions
	 * 
	 * @POS conj
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
	public void addConjunction(File file) throws FileNotFoundException {
		Scanner fileReader = new Scanner(file);

		while (fileReader.hasNextLine()) {
			conjunction.add(fileReader.nextLine());
		}
		fileReader.close();
	}

	/**
	 * Builds lexicon of phrases Holmes uses to convey disdain for the
	 * deductions of others.
	 * 
	 * @POS phrase
	 * @param file File holding a list of words, listed line-by-line
	 * @throws FileNotFoundException
	 */
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

	/**
	 * Gets first names list
	 * 
	 * @return first names
	 */
	public ArrayList<String> getFirst() {
		return firstName;
	}

	/**
	 * Gets last names list
	 * 
	 * @return last names 
	 */
	public ArrayList<String> getLast() {
		return lastName;
	}

	/**
	 * Gets color list
	 * 
	 * @return color words 
	 */
	public ArrayList<String> getColor() {
		return color;
	}

	/**
	 * Gets object list
	 * 
	 * @return object words
	 */
	public ArrayList<String> getAdjObject() {
		return adjObject;
	}

	/**
	 * Gets distinction list
	 * 
	 * @return distinction words and phrases
	 */
	public ArrayList<String> getDistinction() {
		return distinction;
	}

	/**
	 * Gets profession list
	 * 
	 * @return professions
	 */
	public ArrayList<String> getProfession() {
		return profession;
	}

	/**
	 * Gets anthropomorphic adjectives list
	 * 
	 * @return anthropomorphic adjectives
	 */
	public ArrayList<String> getAdjPerson() {
		return adjPerson;
	}

	/**
	 * Gets pastime list
	 * 
	 * @return pastimes
	 */
	public ArrayList<String> getPastime() {
		return pastime;
	}

	/**
	 * Gets anthropomorphic adjectives list
	 * 
	 * @return anthropomorphic adjectives
	 */
	public ArrayList<String> getComment() {
		return comment;
	}
	
	/**
	 * Gets list of crimes
	 * 
	 * @return crime names 
	 */
	public ArrayList<String> getCrime() {
		return crime;
	}

	/**
	 * Gets list of crimes
	 * 
	 * @return crime names 
	 */
	public ArrayList<String> getEvidence() {
		return evidence;
	}

	/**
	 * Gets list of objects
	 * 
	 * @return object names 
	 */
	public ArrayList<String> getObject() {
		return object;
	}

	/**
	 * Gets list of vehicles
	 * 
	 * @return vehicles
	 */
	public ArrayList<String> getVehicle() {
		return vehicle;
	}

	/**
	 * Gets list of location prepositions
	 * 
	 * @return prepositions
	 */
	public ArrayList<String> getPreposition() {
		return preposition;
	}

	public ArrayList<String> getPlace() {
		return place;
	}

	/**
	 * Gets list of destinations
	 * 
	 * @return destinations
	 */
	public ArrayList<String> getDestination() {
		return destination;
	}

	/**
	 * Gets list of seasons
	 * 
	 * @return seasons
	 */
	public ArrayList<String> getSeason() {
		return season;
	}

	/**
	 * Gets list of times phrases
	 * 
	 * @return times
	 */
	public ArrayList<String> getTime() {
		return time;
	}

	/**
	 * Gets list of transitive verbs
	 * 
	 * @return verbs
	 */
	public ArrayList<String> getTransVerb() {
		return transVerb;
	}

	/**
	 * Gets list of thinking words
	 * 
	 * @return thinking words
	 */
	public ArrayList<String> getThink() {
		return think;
	}

	/**
	 * Gets list of movement
	 * 
	 * @return movement
	 */
	public ArrayList<String> getMovement() {
		return movement;
	}

	/**
	 * Gets list of sense words
	 * 
	 * @return sense words
	 */
	public ArrayList<String> getSense() {
		return sense;
	}

	/**
	 * Gets list of search words
	 * 
	 * @return search words
	 */
	public ArrayList<String> getSearch() {
		return search;
	}

	/**
	 * Gets list of speaking words
	 * 
	 * @return speaking words
	 */
	public ArrayList<String> getSpeak() {
		return speak;
	}

	/**
	 * Gets list of urgent words
	 * 
	 * @return urgent words
	 */
	public ArrayList<String> getUrgent() {
		return urgent;
	}
	
	/**
	 * Gets list of interrogation phrases
	 * 
	 * @return interrogation phrases
	 */
	public ArrayList<String> getInterrogation() {
		return interrogation;
	}
	
	/**
	 * Gets list of interrogation phrases used to question further
	 * 
	 * @return phrases to question further
	 */
	public ArrayList<String> getQuestionFurther() {
		return questionFurther;
	}

	/**
	 * Gets list of replies to yes/no questions
	 * 
	 * @return yes/no reply
	 */
	public ArrayList<String> getReply() {
		return reply;
	}

	/**
	 * Gets list of salutations for greetings/leave-takings
	 * 
	 * @return greetings
	 */
	public ArrayList<String> getGreeting() {
		return greeting;
	}

	/**
	 * Gets list of phrases conveying confusion
	 * 
	 * @return confused phrases
	 */
	public ArrayList<String> getConfused() {
		return confused;
	}

	/**
	 * Gets list of conjunctions
	 * 
	 * @return conjunctions
	 */
	public ArrayList<String> getConjunction() {
		return conjunction;
	}

	/**
	 * Gets list of phrases conveying methodological disdain
	 * 
	 * @return disdainful phrases 
	 */
	public ArrayList<String> getUnimpressed() {
		return unimpressed;
	}

	/*
	 * ****** toString Methods ******
	 */


	/**
	 * Returns formatted list for given word type in lexicon

	 * @param list lexicon of interest
	 * @return list of words in lexicon of interest
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
