import java.util.Scanner;

class Main {
	public static void main(String[] args){
		System.out.print("Please type your name: ");
		Scanner s = new Scanner(System.in);
		String name;
		name = s.nextLine();

		System.out.print("Hello " + name + "! " + "Please type your age: ");
		int age;
		age = s.nextInt();

		System.out.println("You are " + age + " years old.");
		int yearsTillRetirement = 67 - age;
		System.out.println("You have " + yearsTillRetirement + " years until retirement.");
	}
}