public class Task02_3 {

	int note = 4;
	String string;

	public String run() {
		switch (note) {

		case 1:
			string = "Sehr gut";
			break;
		case 2:
			string = "Gut";
			break;
		case 3:
			string = "Befriedigend";
			break;
		case 4:
			string = "Ausreichend";
			break;
		case 5:
			string = "Mangelhaft";
			break;
		case 6:
			string = "Unzureichend";
			break;
		default:
			string = "Die Eingabe ist keine Note";
			break;
		}
		return string;
	}
}
