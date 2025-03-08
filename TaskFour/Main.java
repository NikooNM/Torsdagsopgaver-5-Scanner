import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		ArrayList<String> actionsMain = new ArrayList<>();
		actionsMain.add("1) Start game"); actionsMain.add("2) Resume game"); actionsMain.add("3) Pause game"); actionsMain.add("4) End game");
		System.out.println(actionsMain.get(2));
		System.out.println();

		GameMenu actionsList = new GameMenu(actionsMain);
		actionsList.displayMenu();
	}
}