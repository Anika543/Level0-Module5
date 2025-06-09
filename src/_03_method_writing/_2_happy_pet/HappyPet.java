package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	static int petHappiness = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do you want to buy?"); 

		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		for(int i = 0; i<5; i++){
		
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would " + 
			"you like to do for your pet?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "water", "take on a walk" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task==0){
				cuddle(petHappiness);
			}else if(task==1){
				water(petHappiness); 
			}else{
				walk(petHappiness); 
			}
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
	JOptionPane.showMessageDialog(null, "You love your pet"); 
	}
	// 5. Create methods to handle each of your user selections.
	public static void cuddle(int petHappiness){
		JOptionPane.showMessageDialog(null, "Your pet is happy");
		petHappiness++;  
	}public static void water(int petHappiness){
		JOptionPane.showMessageDialog(null, "Your pet no longer thirsty");
		petHappiness++;  
	}public static void walk(int petHappiness){
		JOptionPane.showMessageDialog(null, "Your pet got their exercise");
		petHappiness++;  
	}

	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}