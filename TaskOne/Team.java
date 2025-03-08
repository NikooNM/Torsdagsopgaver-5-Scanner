import java.util.ArrayList;

class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> playerNames;

	public Team (String teamName){
		this.teamName = teamName;
		this.playerNames = new ArrayList<>(); 
	}

	public void setRank(int teamRank){
		this.teamRank = teamRank;
	}

	@Override
	public String toString(){
		String strToReturn = "Hold: " + this.teamName + " Rang: " + this.teamRank + " Player Names: \n";
		String str2;
		for (String player : playerNames){
			str2 = player + "\n";
			strToReturn = strToReturn.concat(str2);
		}
		return strToReturn;
	}

	public void addPlayer(String playerName){
		this.playerNames.add(playerName);
	}
}