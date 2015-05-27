
public class Main {

	static int[] array = {12,14,9,12,15,16,15,11,8,13,15,12};
	
	static Task01_1a task01_1a = new Task01_1a(6,5);
	static Task01_1b task01_1b = new Task01_1b(6,90,8);
	static Task01_5 task01_5 = new Task01_5();
	static Task02_1b task02_1b = new Task02_1b();
	static Task02_3 task02_3 = new Task02_3();
	static Task03_3 task03_0 = new Task03_3();
	static Task04_2 task04_2 = new Task04_2();
	static Task04_3 task04_3 = new Task04_3(array);
	
	
	public static void main(String args[]) {
		System.out.println("Task01_1a: " + task01_1a.max());
		System.out.println("Task01_1b: " + task01_1b.max());
		System.out.println("Task01_5:  " + task01_5.calculate());
		System.out.println("Task02_1b: " + task02_1b.check());
		System.out.println("Task02_3:  " + task02_3.run());
		System.out.print("Task03_3:  "); task03_0.quad();
		System.out.print("\nTask04_2: "); task04_2.schaltjahr();
		System.out.print("Task04_3: " + task04_3.avgTemp(array) + " ; " + task04_3.maxTemp(array) + " ; " + task04_3.maxDiff(array)); 
	}
}
