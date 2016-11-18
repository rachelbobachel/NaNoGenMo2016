
public class SherlockMysteryDriver {

	public static void main(String[] args) {
		Lexicon lexicon = new Lexicon();
		
		SherlockMystery story = new SherlockMystery(lexicon);
		
		System.out.println(story.getTitle());
		System.out.println(story.getIntro());
		System.out.println(story.getPlea());
		System.out.println(story.makeInquiries());
		System.out.println(story.makeInquiries());
		System.out.println(story.getInvestigation());
		System.out.println(story.getResolution());
		System.out.println(story.getEnding());

	}

}
