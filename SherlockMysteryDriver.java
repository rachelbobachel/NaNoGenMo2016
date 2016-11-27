
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SherlockMysteryDriver {

	public static void main (String[] args) throws FileNotFoundException {
		Lexicon lexicon = new Lexicon();
		loadLexicon(lexicon);
		
//		File dictionary = new File("dictionary.txt");
//		PrintStream lexWrite = new PrintStream(dictionary);
//		lexWrite.println(lexicon);
		
		//lexWrite.close();

		
		File book = new File("Sherlock.txt");
		PrintStream write = new PrintStream(book);
		
		int count = 0;

		while (count <= 45) {
			SherlockMystery story = new SherlockMystery(lexicon);
			write.println("\n________________________________\n");
			write.println(story.getTitle());
			write.println("\n________________________________\n");
			write.println(story.getIntro());
			write.println(story.makeInquiries());
			write.println(story.makeInquiries());
			write.println(story.getInvestigation());
			write.println(story.getResolution());
			write.println(story.getEnding());

			count += 1;
		}
//
		write.close();
	}
	
	public static void loadLexicon (Lexicon lexicon) throws FileNotFoundException {
		lexicon.addAdjObj(new File("../Word Lists/adjectiveObject.txt"));
		lexicon.addAdjPers(new File("../Word Lists/adjectivePersonal.txt"));
		lexicon.addColor(new File("../Word Lists/color.txt"));
		lexicon.addComment(new File("../Word Lists/comment.txt"));
		lexicon.addConfused(new File("../Word Lists/confused.txt"));
		lexicon.addConjunction(new File("../Word Lists/conjunction.txt"));
		lexicon.addCrime(new File("../Word Lists/crime.txt"));
		lexicon.addDestination(new File("../Word Lists/destination.txt"));
		lexicon.addDistinction(new File("../Word Lists/distinction.txt"));
		lexicon.addEvidence(new File("../Word Lists/evidence.txt"));
		lexicon.addFirst(new File("../Word Lists/firstName.txt"));
		lexicon.addGreeting(new File("../Word Lists/greeting.txt"));
		lexicon.addInterrogation(new File("../Word Lists/interrogation.txt"));
		lexicon.addLast(new File("../Word Lists/lastName.txt"));
		lexicon.addMovement(new File("../Word Lists/movement.txt"));
		lexicon.addObject(new File("../Word Lists/object.txt"));
		lexicon.addPastime(new File("../Word Lists/pastime.txt"));
		lexicon.addPlace(new File("../Word Lists/place.txt"));
		lexicon.addPreposition(new File("../Word Lists/preposition.txt"));
		lexicon.addProfession(new File("../Word Lists/profession.txt"));
		lexicon.addQuestionFurther(new File("../Word Lists/questionFurther.txt"));
		lexicon.addReply(new File("../Word Lists/reply.txt"));
		lexicon.addSearch(new File("../Word Lists/search.txt"));
		lexicon.addSeason(new File("../Word Lists/season.txt"));
		lexicon.addSense(new File("../Word Lists/sense.txt"));
		lexicon.addSpeak(new File("../Word Lists/speak.txt"));
		lexicon.addThink(new File("../Word Lists/think.txt"));
		lexicon.addTime(new File("../Word Lists/time.txt"));
		lexicon.addTransVerb(new File("../Word Lists/transitiveVerb.txt"));
		lexicon.addUnimpressed(new File("../Word Lists/unimpressed.txt"));
		lexicon.addUrgent(new File("../Word Lists/urgent.txt"));
		lexicon.addVehicle(new File("../Word Lists/vehicle.txt"));
		
	}

}
