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


package deliverabletwo;

import java.util.Scanner;

public class coincount {

	public static void main(String[] args) {
		
		
		int headsCount = 0;
		int tailsCount = 0;
		int headsOrTailsGuess = 0;
		int occ =0;
		
		boolean valid = true;
		
		DeliverableTwo coin = new DeliverableTwo();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Guess which will have more: Heads or Tails? ");
		
		String Guess = in.nextLine();
			
		System.out.println("How many times shall we flip a coin?");
		
		int numberOfFlips = in.nextInt();
				
		
	for(int i = 1; i<= numberOfFlips; i++) {
			coin.flip();
		if (coin.isHeads()) {
			headsCount ++;
		} else {
			tailsCount ++;
		}
		System.out.println(coin.toString());
	}
		System.out.println("================================");
		System.out.println("Number of Flips:" + numberOfFlips);
		System.out.println("Number of Heads:" + headsCount);
		System.out.println("Number of Tails:" + tailsCount);
		
		
		if(Guess == "heads") {
		System.out.println("Your guess, " + Guess + ", came up " + headsCount + " times.");
		System.out.println((headsCount/numberOfFlips) * 100);
		} else {
		System.out.println("Your guess, " + Guess + ", came up " + tailsCount + " times.");
		System.out.println(tailsCount % numberOfFlips + "%");
		}
	}
}

