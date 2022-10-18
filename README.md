package deliverabletwo;

public class DeliverableTwo {
	
	
		final int HEADS = 0; // heads is 0, tails is 1
		int FACE; //the side showing
		
	public void Coin() {
		flip();		
		
	}
	
	public void flip() {
		FACE = (int) (Math.random() * 2); // math will generate decimal btwn 0-1, int will truncate into an int. *2 gives 50/50 chance
		
	}public boolean isHeads() {
		return(FACE == HEADS);
	
	}public String toString() {
		return(FACE == HEADS) ? "Heads" : "Tails"; // if true, executes first phrase, if false - executes second phrase
	
			
	}
}
