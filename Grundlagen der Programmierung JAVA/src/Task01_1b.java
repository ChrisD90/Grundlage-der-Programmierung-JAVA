
public class Task01_1b {

	int x;
	int y;
	int z;
	
	public Task01_1b(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public int max() {
		return Math.max(x, Math.max(y, z));
	}
}
