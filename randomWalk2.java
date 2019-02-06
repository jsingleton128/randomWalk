import java.util.Random;

public class randomWalk2 {

	public static void main(String[] args) {
		randomWalk();
	}
	public static void randomWalk(){
		Random rand = new Random();
		//initialize position to 0
		int position = 0;
		//track max position by setting max to current position value
		int max = position;
		System.out.println("position = " + position);
		while ((position > -3) && (position < 3)) { //loop until position is equal to 3 or -3
			int coinFlip = rand.nextInt(3) + 1;		//50/50 chance to move forward or backward	
				if (coinFlip == 1) {// move forward if coinFlip = 1 (add 1 to position)
					position++;
					System.out.println("position = " + position);
					} else {// move backward if coinFlip = 2 (minus 1 to position)
					position--;
					System.out.println("position = " + position);
					}
				if (position > max) {//if current position value is greater than max, reset max to new value
					max = position;
				}
			}
		System.out.println("max position = " + max);	
		}
		
	}
