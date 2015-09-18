import java.util.Scanner;

public class MadLibs {
	public static void main (String args[]){
		Scanner wordPhrase = new Scanner(System.in);
		
		String faveChar = "";
		String speechNoun1 = "";
		String speechVerb = "";
		int number = 0;
		String speechName = "";
		String speechAdjective1 = "";
		String speechNoun2 = "";
		String speechAdjective2 = "";
		String speechAdjective3 = "";
		
		System.out.println("Enter the first noun.");
		speechNoun1 = wordPhrase.nextLine();
		System.out.println("Enter a verb.");
		speechVerb = wordPhrase.nextLine();
		System.out.println("Enter a number.");
		number = wordPhrase.nextInt();
		System.out.println("Enter a name of a person (proper noun).");
		speechName = wordPhrase.nextLine();
		System.out.println("Enter the first adjective.");
		speechAdjective1 = wordPhrase.nextLine();
		System.out.println("Enter the second noun.");
		speechNoun2 = wordPhrase.nextLine();
		System.out.println("Enter the second adjective.");
		speechAdjective2 = wordPhrase.nextLine();
		System.out.println("Enter the third adjective.");
		speechAdjective3 = wordPhrase.nextLine();
		
		System.out.println("Sing-a-ring-a-ring, " + speechNoun1 + " and love combine with you as well");
		System.out.println("I'll " + speechVerb + " it all away, until it shines like a diamond");
		System.out.println("Wippa-wippa-win, there is " + number + " main important factor");
		System.out.println("That I just do not fill " + speechName + " with so much doubt");
		System.out.println("Sing-a-ring-a-ring, " + speechAdjective1 + " evenings combine with you as well");
		System.out.println("I'll let you live your life, while a " + speechNoun2 + " is in sight");
		System.out.println("Wippa-wippa-win, there is one main " + speechAdjective2 + " factor");
		System.out.println("That you just " + speechAdjective3 + " understand my very gist");
	}
}
