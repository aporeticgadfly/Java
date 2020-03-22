import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int userinput = 0;
		
		System.out.println("You wake up and hear a knock on the door. It's 2 AM on an early Friday morning. Do you #1: open the door, or #2: go back to bed? (Enter 1 for path 1, 2 for path 2)");
		userinput = input.nextInt();

		if(userinput == 1)										//level 2
		{
			System.out.println("The are two men on your doorstep dressed in black suits. They ask you nicely to let them in so they can ask you some simple questions. Do you #1: let them into your house or #2: tell them to leave (Enter 1 for path 1, 2 for path 2)");
			userinput = input.nextInt();
			
			if(userinput == 1)									//level 3
			{
				System.out.println("They talk to you very nicely. You let them into the living room and offer to make some tea. As you head into the kitchen, you hear shuffling in the living room. When you look through the kitchen opening, you do not see or hear the two men. When you come back to the living room, they're on the couch. They finally ask you where you work. Do you #1: tell them the truth about your lab that discovered the cure for cancer, or #2: lie and say you work as a football coach (Enter 1 for path 1, 2 for path 2)");
				userinput = input.nextInt();
			}
			
			else if(userinput == 2)								//level 3
			{
				System.out.println("The men beg you to reconsider, insisting what they have to ask is important, however you adamantly refuse as it is 2 fricking AM. Growing cold, they whip out their true identities, revealing that they work for a foreign Japanese motor company. They know you work for a genetics lab that has found the cure for cancer and are here to steal it. They tell you to give it to them. Do you #1: get the cure for them or #2: say no (Enter 1 for path 1, 2 for path 2)");
				userinput = input.nextInt();
			}
		}
		
		else if(userinput == 2)									//level 2
		{
			System.out.println("You return to your bed, however, the knocking gets louder and 2 men start yelling to open up. The door breaks open with a loud bang and footsteps come closer to your room. Do you #1: confront them knowing you are a black belt in kung fu or #2: hide in the bathroom?");
			userinput = input.nextInt();
			
			if(userinput == 1)									//level 3
			{
				System.out.println("The men attack with crazy karate moves, but you block every single one of them with your master skills. However, being outnumbered, you soon tire out and pass out. Upon waking up, you find yourself in a room. The room is cold and empty. Outside the room, a long hallway stretches out in both directions. Do you #1: Go down the left hallway, or #2: go down the right hallway? (Enter 1 for path 1, 2 for path 2)");
				userinput = input.nextInt();
			}
			
			else if(userinput == 2)								//level 3
			{
				System.out.println("After a while of hiding, you peek out of the bathroom. You see your goldfish is being stolen and a note is being left on the table. Do you #1: go after your goldfish or #2: read the note that was left?");
				userinput = input.nextInt();
			}
		}
	}

}
