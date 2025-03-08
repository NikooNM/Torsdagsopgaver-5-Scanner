class Main{
	public static void main(String[] args){
		Team codingIsPoetry = new Team("CodingIsPoetry");
		codingIsPoetry.setRank(1);

		codingIsPoetry.addPlayer("Morten");
		codingIsPoetry.addPlayer("Oliver");
		codingIsPoetry.addPlayer("Dino");
		codingIsPoetry.addPlayer("Carl");

		Team hackersDelight = new Team("Hackers Delight");
		hackersDelight.setRank(10);

		hackersDelight.addPlayer("Hussain");
		hackersDelight.addPlayer("Emil");
		hackersDelight.addPlayer("Nestor");

		Team girlPower = new Team("Girl Power");
		girlPower.setRank(2);

		girlPower.addPlayer("Luke");
		girlPower.addPlayer("Daniel");
		girlPower.addPlayer("Jesper");
		girlPower.addPlayer("Toby");

		Team teamDependableOctopus = new Team("Team Dependable Octopus");
		teamDependableOctopus.setRank(6);

		teamDependableOctopus.addPlayer("Andreas");
		teamDependableOctopus.addPlayer("Babak");
		teamDependableOctopus.addPlayer("Frederik");
		teamDependableOctopus.addPlayer("Nicklas");

		Team teamBigFoot = new Team("Team Big foot");
		teamBigFoot.setRank(4);

		teamBigFoot.addPlayer("Andreas");
		teamBigFoot.addPlayer("Momen");
		teamBigFoot.addPlayer("Ebou");
		teamBigFoot.addPlayer("Jonas");

		Team programmering100 = new Team("100 Programmering");
		programmering100.setRank(5);

		programmering100.addPlayer("John");
		programmering100.addPlayer("Samuel");
		programmering100.addPlayer("Nali");

		System.out.println(codingIsPoetry);
		System.out.println(hackersDelight);
		System.out.println(girlPower);
		System.out.println(teamDependableOctopus);
		System.out.println(teamBigFoot);
		System.out.println(programmering100);
	}
}