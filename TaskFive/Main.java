import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		ArrayList<String> actionsMain = new ArrayList<>();
		actionsMain.add("1) Start game"); actionsMain.add("2) Resume game"); actionsMain.add("3) Pause game"); actionsMain.add("4) End game");
		
		GameMenu actionsList = new GameMenu(actionsMain);
		String userInput = actionsList.getAction();
		int userInputConverted = Integer.parseInt(userInput);
		doAction(userInputConverted);
	}

	public static void doAction(int action){
		switch(action){
		case 1:
			System.out.println("Starting the game now");
			break;
		case 2:
			System.out.println("Fetching previously saved game data");
			break;
		case 3:
			System.out.println("Game paused");
			break;
		case 4:
			System.out.println("Ending game");
			break;
		default:
			System.out.println("You chose an invalid action");
		}
	}
}