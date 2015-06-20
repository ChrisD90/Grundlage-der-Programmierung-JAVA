package task07_4;

public class CookBook extends Book{

	boolean vegeterian;
	
	public CookBook(boolean vegeterian) {
	    this.vegeterian = vegeterian;
	}
	
	public boolean isVegeterian(boolean bool) {
		
		if(bool) return true;
		return false;
	}

}
