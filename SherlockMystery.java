
import java.lang.StringBuilder;
import java.util.Random;

public class SherlockMystery {

	public static final int TOTAL_INFORMANTS = 3;

	Lexicon lexicon;

	String crimeScene;
	String city;
	String crime;
	String day;
	String culprit;
	String victim;
	String weapon;
	String client;
	String informant1;
	String informant2;
	String informant3;
	String title;
	int inquiryCount = 0;

	Random r = new Random();

	public SherlockMystery(Lexicon lexicon) {
		this.lexicon = lexicon;
		this.setDetails();
	}

	public void setDetails() {

		this.crimeScene = getWord(lexicon.place);
		this.city = getWord(lexicon.destination);
		this.crime = getWord(lexicon.crime);
		this.day = getWord(lexicon.day);
		this.culprit = getWord(lexicon.suspect);
		this.victim = getWord(lexicon.victim);
		this.weapon = getWord(lexicon.object);
		this.client = getWord(lexicon.suspect);
		this.informant1 = getWord(lexicon.source);
		this.informant2 = getWord(lexicon.source);
		this.informant3 = getWord(lexicon.source);
	}
	
	public String getTitle() {
		int choice = r.nextInt(5);
		String title = "\n\t\t\t";
		switch(choice) {
		case 0: title =  "The " + this.crime + " of " + this.victim; break;
		case 1: title = "The " + this.crime + " in the " + this.crimeScene; break;
		case 2: title = this.informant3 + " Speaks of " + this.crime;
		case 3: title = "The Mysterious " + this.weapon;
		case 4: title = "The Report of " + this.client;
		
		}
		
		return title;
	}
	
	public StringBuilder getIntro() {
		StringBuilder article = new StringBuilder();
		article.append("The Times reported a certain " + this.victim);
		article.append(" fell victim to " + this.crime + " " + this.day + " in a " + this.crimeScene
				+ " in the heart of " + this.city + ". ");
		article.append(getWord(lexicon.source) + " report " + " a " + getWord(lexicon.object) + " was seen in the "
				+ this.crimeScene + " earlier .");
		article.append(lexicon.suspect[0] + " " + getWord(lexicon.transVerb) + " a " + lexicon.object[0] + ". ");
		article.append(lexicon.suspect[4] + " " + getWord(lexicon.transVerb) + " " + getWord(lexicon.object) + ". ");
		article.append("Other sources also report ");
		article.append(lexicon.suspect[1] + " " + getWord(lexicon.transVerb) + " a " + lexicon.object[1] + ", ");
		article.append(lexicon.suspect[2] + " " + getWord(lexicon.transVerb) + " a " + lexicon.object[2] + ", and ");
		article.append(lexicon.suspect[6] + " " + getWord(lexicon.transVerb) + " a " + getWord(lexicon.object) + ". ");
		article.append("Meanwhile, unconfirmed rumors suggest " + lexicon.suspect[5] + " " + getWord(lexicon.transVerb)
				+ " a " + getWord(lexicon.object));
		article.append(" early " + this.day + ". ");

		return article;
	}

	public StringBuilder getPlea() {
		StringBuilder plea = new StringBuilder();
		plea.append("\n\"Watson! I believe we'll meet a client before long.\"");
		plea.append("\n A " + getWord(lexicon.adjective) + " " + getWord(lexicon.longPronoun) + " "
				+ getWord(lexicon.movement) + " in. ");
		plea.append("\n\"I see you are a " + getWord(lexicon.profession) + " who recently ");
		plea.append(getWord(lexicon.transVerb) + " a " + getWord(lexicon.profession) + ". \"");
		plea.append("\n\"Sir, I have no time for your tricks! There was a " + this.crime + "!\"");
		plea.append("\n\"The details are familiar to me. My investigation has already begun. ");
		plea.append("The details have not all been reported!");
		plea.append("\nListen - " + this.day + ", I saw " + getWord(lexicon.suspect) + ". ");
		plea.append("\nHas the " + this.weapon + " been recovered?\"");
		plea.append("\n" + getWord(lexicon.reply));
		plea.append("\n" + getWord(lexicon.comment) + " " + getWord(lexicon.comment));
		plea.append("\nWe must go to " + getWord(lexicon.destination) + " " + getWord(lexicon.urgent) + "!\"");

		return plea;
	}

	public StringBuilder makeInquiries() {
		StringBuilder inquiries = new StringBuilder();

		if (inquiryCount <= TOTAL_INFORMANTS) {
			if (inquiryCount == 0 + TOTAL_INFORMANTS) {
				inquiries.append("\n\"" + getWord(lexicon.greeting) + ", " + this.informant1 + "\"");
				inquiries.append("\n\"Ah! " + "We must gather data. Let's visit " + this.informant1 + ".\"");
				inquiries.append("\n\"" + this.informant1 + ", " + getWord(lexicon.interrogation) + "\"");
				inquiries.append("I " + getWord(lexicon.sense) + " " + getWord(lexicon.suspect)
						+ getWord(lexicon.transVerb) + " a " + getWord(lexicon.object) + ". ");
				inquiries.append("But then " + getWord(lexicon.suspect) + " " + getWord(lexicon.movement) + " from the "
						+ this.crimeScene + ". ");
				inquiries.append(getWord(lexicon.confused) + "\"");
				inquiries.append(getWord(lexicon.comment) + " " + getWord(lexicon.greeting) + ". ");
				inquiries.append(
						"Come Watson, we must speak with " + this.informant2 + " " + getWord(lexicon.urgent) + ". ");
				inquiries.append("Good day, " + this.informant1);
				inquiryCount += 1;
			} else if (this.inquiryCount == 1 + TOTAL_INFORMANTS) {
				String location = getWord(lexicon.place);
				inquiries.append("\n\"There, Watson!" + this.informant2 + " is there, in the " + location + "\"");
				inquiries.append("\n\"" + this.informant2 + ", " + getWord(lexicon.interrogation) + "\"");
				inquiries.append("Mr. Holmes!");
				inquiries.append("\n\"Indeed. " + getWord(lexicon.interrogation) + ".\"");
				inquiries.append("\"It was " + getWord(lexicon.suspect) + ". ");
				inquiries.append("That's who had the " + this.weapon + " last. ");
				inquiries.append("Last night in the " + getWord(lexicon.place) + ", I saw the " + this.weapon
						+ " hidden in the " + getWord(lexicon.place) + ". ");
				inquiries.append("Only a " + getWord(lexicon.profession) + " would go there. \n\"");
				inquiries.append("\n\"" + getWord(lexicon.unimpressed) + ". " + "We can do nothing else from here.");
				inquiries.append("We must go to " + this.city + "\"");
				this.inquiryCount += 1;
			} else if (this.inquiryCount == 2 + TOTAL_INFORMANTS) {
				inquiries.append("\n\"" + this.informant3 + ", " + getWord(lexicon.interrogation) + "\"");
				inquiries.append("Mr. Holmes! How did you find me?");
				inquiries.append("\n\"We have no time for such questions. " + getWord(lexicon.interrogation) + ".\"");
				inquiries.append("\"It was " + getWord(lexicon.suspect) + ". ");
				inquiries.append("\"That's who had the " + this.weapon + " last. \"");
				inquiries.append("\n\"Last night in the " + getWord(lexicon.place) + ", I saw the" + this.weapon
						+ " hidden in the " + getWord(lexicon.place) + ".\" ");
				inquiries.append("\"And this makes you so certain?\" ");
				inquiries.append("\n\"" + getWord(lexicon.unimpressed) + ". " + "We can do nothing else from here.");
				inquiries.append("\n\"We must go to " + this.city + "\"");
				this.inquiryCount += 1;
			}
		} else {
			inquiries.append("\"" + getWord(lexicon.suspect) + " " + getWord(lexicon.interrogation) + "\n\"");
			inquiries.append(makeInquiries());
			inquiries.append("\n\"" + getWord(lexicon.unimpressed) + "\"");

		}
		return inquiries;
	}

	public StringBuilder getInvestigation() {
		StringBuilder investigation = new StringBuilder();
		investigation.append("\"We have arrived!\"");
		investigation.append("\n\"" + "First, we must look at the " + getWord(lexicon.place) + "\"");
		investigation.append("\n\"What? " + this.victim + " had no business there.\"");
		investigation.append("\n\"Look, the " + getWord(lexicon.clue) + "! ");
		investigation.append("Ha! The " + getWord(lexicon.clue) + ". ");
		investigation.append("\n\"" + getWord(lexicon.confused) + "\"");
		investigation.append("\n\"Holmes, over here - a " + getWord(lexicon.object) + ". ");
		investigation.append("\n\"" + getWord(lexicon.comment) + "\"");
		investigation.append("\n\"" + getWord(lexicon.comment) + " Let's look at the " + getWord(lexicon.place) + ". ");
		investigation.append(
				"\n\"" + this.victim + " " + getWord(lexicon.movement) + " shortly before the " + this.crime + ".\" ");
		investigation.append("\n\"Holmes, look! " + this.victim + "'s " + getWord(lexicon.profession) + "!\"");
		investigation.append("\n\"" + this.informant3 + "! " + this.informant3 + "! Blast!\"");
		investigation.append(
				"\n\"Watson, the " + getWord(lexicon.longPronoun) + " " + getWord(lexicon.movement) + " away. ");
		investigation.append("We must give chase!\"");
		investigation.append(makeInquiries());
		investigation.append("\n\"" + "This is coming together. " + getWord(lexicon.comment) + "\"");
		investigation.append("\n\"To Baker Street!\"");

		return investigation;
	}

	public StringBuilder getResolution() {
		StringBuilder resolution = new StringBuilder();
		resolution.append("\n\"Lestrade, thank you for joining us. This will be of interest to the Yard.\"");
		resolution.append("\n\"We must examine the facts.\"");
		int count = 0;
		while (count < TOTAL_INFORMANTS) {
			resolution.append("\n\"" + getWord(lexicon.suspect) + " " + getWord(lexicon.transVerb) + " a "
					+ getWord(lexicon.object));
			resolution.append(" " + getWord(lexicon.conjunction) + " " + getWord(lexicon.suspect) + " "
					+ getWord(lexicon.transVerb) + " a " + getWord(lexicon.object) + "\"");
			count += 1;
		}
		resolution
				.append("\n\"However, " + this.victim + " " + getWord(lexicon.movement) + " to " + this.city + ".\" ");
		resolution.append("\n\"Which is when " + this.culprit + " " + getWord(lexicon.transVerb) + " the " + this.weapon
				+ ".\" ");
		resolution.append("\n\"But then " + this.culprit + " " + getWord(lexicon.sense) + " " + this.victim + " in the "
				+ this.crimeScene + ".\" ");
		resolution.append("\n\"From there, a " + this.crime + " was inevitable.\"");
		resolution.append("\n\"Are you saying that " + this.culprit + " is responsible?\"");
		resolution.append("\n\"Precisely. The " + getWord(lexicon.clue) + " found next to the " + this.crimeScene
				+ " make it certain.\"");
		resolution.append("\n\"Make the arrest, Lestrade!\"");

		return resolution;
	}

	public StringBuilder getEnding() {
		StringBuilder ending = new StringBuilder();
		ending.append("\"Holmes, how could you possibly deduce " + this.culprit + "'s guilt? \"");
		ending.append("\n\"Once I found the final clue, the " + this.weapon + " could be the answer.\"");
		ending.append("\n\"Recall the testimony of " + this.informant1 + " and " + this.informant3 + ".\"");
		ending.append("\n\"Their reports of " + lexicon.object[1] + " and " + lexicon.object[3]
				+ " make this the only possible solution.\"");
		ending.append("Only " + this.culprit + " could have possibly had the " + this.weapon + " at the time of the "
				+ this.crime + ".\"");
		ending.append("\"It seems obvious now!\"");
		ending.append("\"Deduction, Watson. Things can only end by deduction.\"");

		return ending;
	}

	public String getWord(String[] array) {
		return array[r.nextInt(array.length - 1)];
	}

}
