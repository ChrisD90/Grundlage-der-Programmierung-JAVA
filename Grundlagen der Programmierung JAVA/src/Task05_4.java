import java.math.RoundingMode;


public class Task05_4 {

	public static double round(double y) {
		
		return (Math.round((y * Math.pow(10d, 2))))/Math.pow(10d, 2);
	}
	
	public static double round(double y, int step) {
		
		return (Math.round((y * Math.pow(10d, step))))/Math.pow(10d, step);
	}
	
}
