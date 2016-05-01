import javax.swing.Spring;

public class Word {
	private String word;
	public Word(String word){
		this.word = word;
	}
	
	public int getDistance(Word w){
		int distance = 0;
		for(int i = 0; i< this.word.length(); i++){
			if (word.charAt(i)!=w.getWord().charAt(i))
				distance++;
		}
		return distance;		
	}
	
	public String getWord(){
		return word;
	}
	

}
