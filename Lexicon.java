import java.util.ArrayList;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class Lexicon {

	String[] suspect = {"John", "Paul", "George", "Ringo", "Justin", "Britni", "Juliette"};
	String[] victim = {"Taylor", "Mr. Georges", "Triana", "Melanie", "Thatcher", "Ms. Owen", "Lady Chatterly"};
	String[] source = {"Sir Charles", "Lady Greyholm", "Britney Spears", "Mickey Mouse", "Donald Duck", "Adele", "Lestrade"};
	String[] transVerb = {"threw", "plucked", "held",  "took", "carried", "bought", "played with", "brandished", "had"};
	String[] movement = {"walked", "ran", "skipped", "hurried", "dashed", "twirled", "stormed"};
	String[] sense = {"saw", "heard", "noticed"};
	String[] object = {"lamp", "knife", "cushion", "horse", "revolver", "tire iron", "poison", "rope"};
	String[] profession = {"typist", "hansom driver", "teacher", "professor", "housekeeper", "butler", "nanny", "baker", "chef"}; 
	String[] adjective = {"tall", "handsome", "beautiful", "graceful", "sad", "defeated", "jubilant", "mournful", "large"};
	String[] longPronoun = {"man", "woman", "boy", "girl"};
	String[] place = {"kitchen", "alley", "bath", "parlor", "moors", "salon", "gentleman's club"};
	String[] destination = {"Morocco", "London", "Hungary", "Bath", "Egypt", "Hartfordshire", "Manchester"};
	String[] urgent = {"now", "this instant", "at once", "immediately", "soon", "before long", "urgently"};
	String[] crime = {"robbery", "murder", "beating", "theft", "con"};
	String[] day = {"this morning", "last night", "yesterday", "last week", "last Tuesday", "late last night"};
	String[] interrogation = {"What have you learned?", "Tell me what you saw.", "What do you know about the case?", "Tell me what you've learned"};
	String[] questionFurther = {"What happened next? ", "Tell me if you've learned anything more. ", " What then? ", "Did you your anything else? "};
	String[] comment = {"I need more facts!", "I see.", "Hmm...", "Interesting.", "It's becoming clear", "What does this mean?", "Just as I thought!"};
	String[] reply = {"Yes.", "No.", "I'm not sure.", "I don't know.", "Absolutely.", "Absolutely not.", "That's exactly right."};	Random r = new Random();
	String[] greeting = {"Good day", "Good evening", "Good afternoon"};
	String[] confused = {"I don't know what to make of it.", "It's not clear.", "It's perplexing.", "I'm totally baffled.", "It makes no sense!"};
	String[] conjunction = {"but", "and", "then", "though"};
	String[] unimpressed = {"Unconvincing. ", "Those are opinions, not facts.", "You have deduced nothing! ", "You have observed everything but the facts."};
	String[] clue = {"footprint", "window", "book", "dust", "fireplace"};
	
	public Lexicon (){
	}
	

}
