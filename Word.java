
public abstract class Word {
	
	/**
	 * *****
	 * Private Variables
	 * *****
	 */
	private String word;
	

	/**
	 * Constructor
	 */
	public Word(String word){
		setWord(word);
	}
	
	
	/**
	 * *******
	 * Accessors
	 * *******
	 */
	
	/**
	 * Get the word for client
	 * 
	 * @return This word
	 */
	public String getWord(){
		return word;
	}
	
	/**
	 * *****
	 * Mutators
	 * *****
	 */
	
	/**
	 * Sets the word  
	 * 
	 * @param word	New word for this word to be
	 * 
	 */
	public void setWord(String word) {
		this.word = word; 
	}
	
	/**
	 * Erases the word
	 */
	public void erase(){
		this.word = "";
	}
	
	/**
	 * Sets word string
	 * 
	 * @return String of the word
	 */
	@Override
	public String toString(){
		return word;
	}
	
}
