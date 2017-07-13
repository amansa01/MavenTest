import java.util.*;

public class StringManipulation {
	static String result, string1, string2, string3;
	static int result_number;
	static Scanner in = new Scanner(System.in);

	static Scanner st = new Scanner(System.in);

	public static void main(String args[]) {

		System.out.println("Enter your Choice for string Manuplation");
		System.out.println("1.Length of string");
		System.out.println("2.concat a string");
		System.out.println("3.Compare two Strings");
		System.out.println("4.Last Index of Substring ");
		System.out.println("5.Replace Old Character with a new Character");

		int select = in.nextInt();
		switch (select) {
		case 1:
			length();

			break;
		case 2:
			concat();
			break;

		case 3:
			compare();

			break;

		case 4:
			lastIndex();

			break;
		case 5:
			replace();
			break;

		default:
			System.out.println("wrong Selection");
		}

	}

	public static void length() {
		 Scanner in = new Scanner(System.in);
		System.out.println("Enter String");
	String	string1 = st.nextLine();
	int 	result_number = string1.length();
		System.out.println(result_number);

	}

	public static void concat() {
		System.out.println("enter first String");
		string1 = st.nextLine();
		System.out.println("enter Second string");
		string2 = st.nextLine();
		result = string1.concat(string2);
		System.out.println(result);

	}

	public static void compare() {
		System.out.println("enter first String");
		string1 = st.nextLine();
		System.out.println("enter Second string");
		string2 = st.nextLine();
		result_number = string1.compareToIgnoreCase(string2);
		System.out.println(result_number);
	}

	public static void lastIndex() {
		System.out.println("enter first String");
		string1 = st.nextLine();
		System.out.println("enter sub string");
		string2 = st.nextLine();
		result_number = string1.lastIndexOf(string2);
		System.out.println(result_number);

	}

	public static void replace() {

		System.out.println("Enter String");
		string1 = st.nextLine();
		System.out.println("Enter character to replace");
		string2 = st.nextLine();
		System.out.println("Enter new character");
		string3 = st.nextLine();
		result = string1.replace(string2, string3);
		System.out.println(result);
	}

}