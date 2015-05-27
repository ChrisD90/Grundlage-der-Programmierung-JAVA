
public class Task01_1a {

	int x;
	int y;
	
	public Task01_1a(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int max() {
		if(x >= y) {
			return x;
		} else {
			return y;
		}
	}
}
