import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	private ArrayList<String> actions;

	public GameMenu(ArrayList<String> listOfActions){
		actions = listOfActions;
	}

	public void displayMenu(){
		for (String action : actions){
			System.out.println(action);
		}
	}

	public String getAction(){
		System.out.println("Type a number to choose an action");
		displayMenu();

		Scanner sc = new Scanner(System.in);
		String userChoice;
		userChoice = sc.nextLine();

		return userChoice;
	}
}