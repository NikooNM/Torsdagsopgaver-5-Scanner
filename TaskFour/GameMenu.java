import java.util.ArrayList;

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
}